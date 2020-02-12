package com.itlize.joole.user;

import com.itlize.joole.documentation.Documentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Lazy
    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        userRepository.findAll()
                .forEach(users::add);

        return users;
    }
    public Optional<User> getUser(int id){
        return userRepository.findById(id);
    }

    public User addUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User updateUser(User user, int id){
        return userRepository.save(user);
    }
    public void deleteUser(int id){
        userRepository.deleteById(id);
    }

    public User getByUsername(String username){
        return userRepository.findByUsername(username);
    }
}
