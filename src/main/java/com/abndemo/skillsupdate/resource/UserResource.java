package com.abndemo.skillsupdate.resource;

import com.abndemo.skillsupdate.model.User;
import com.abndemo.skillsupdate.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserResource {
    final
    UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }



    @PostMapping("/user/")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);

    }
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);

    }

    @PatchMapping ("/user/{id}")
    public User upateUser(@RequestBody User user, @PathVariable Long id) {
        return userService.updateUser(user, id);

    }

    @DeleteMapping ("/user/{id}")
    public void deleteuser(@PathVariable Long id) {
        userService.removeUser(id);

    }

}
