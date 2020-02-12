package com.itlize.joole.user;

import com.itlize.joole.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserControl {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value ="/users")
    public ResponseEntity<?> getAllUsers(){
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/users/{id}")
    public ResponseEntity<?> getUser(@PathVariable int id){
        return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/signUp")
    public ResponseEntity<?> addUser(@RequestBody User user){
        return new ResponseEntity<>(userService.addUser(user),HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
    public ResponseEntity<?> updateUser(@RequestBody User user, @PathVariable int id){
        return new ResponseEntity<>(userService.updateUser(user, id),HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable int id){
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
