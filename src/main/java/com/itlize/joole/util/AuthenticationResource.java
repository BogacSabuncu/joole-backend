package com.itlize.joole.util;

import com.itlize.joole.myUserDetailsService;
import com.itlize.joole.user.User;
import com.itlize.joole.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationResource {
    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private myUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),authenticationRequest.getPassword())
            );
        } catch (BadCredentialsException e){
//            Map<String,String> errorMap = new HashMap<>();
//            errorMap.put("error","Incorrect username or password");
            return new ResponseEntity<String>("Incorrect username or password",HttpStatus.BAD_REQUEST);
        }
        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(authenticationRequest.getUsername());

        User userInfo = userService.getByUsername(authenticationRequest.getUsername());

        final String jwt = jwtUtil.generateToken(userDetails);
        final String username = userInfo.getUsername();
        final String img_url = userInfo.getImg_url();

        Map<String, String> userMap = new HashMap<>();
        userMap.put("jwt",jwt);
        userMap.put("username", username);
        userMap.put("img_url", img_url);

        return new ResponseEntity<>(userMap, HttpStatus.OK);
    }
}
