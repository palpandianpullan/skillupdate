package com.abndemo.skillsupdate.service;

import com.abndemo.skillsupdate.model.User;
import com.abndemo.skillsupdate.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User getUser(Long user) {
        return userRepository.findById(user).orElseThrow();
    }

    public User updateUser(User user, Long id) {
        User user1 = userRepository.findById(id).get();
        return userRepository.save(user1);
    }

    public void removeUser(Long id) {
        userRepository.deleteById(id);
    }
}
