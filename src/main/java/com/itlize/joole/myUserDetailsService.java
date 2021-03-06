package com.itlize.joole;

import com.itlize.joole.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class myUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        com.itlize.joole.user.User user = userService.getByUsername(username) ;

        if(user == null){
            throw new UsernameNotFoundException("User not found");
        }

        return new User(user.getUsername(),user.getPassword(), new ArrayList<>());
    }
}
