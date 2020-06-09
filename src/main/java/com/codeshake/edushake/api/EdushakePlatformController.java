package com.codeshake.edushake.api;

import com.codeshake.edushake.model.User;
import com.codeshake.edushake.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("target/codeshake")
@RestController
public class EdushakePlatformController {

    private final UserService userService;

    @Autowired
    public EdushakePlatformController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("users")
    public void addUser(@Valid @NonNull @RequestBody User user){
        userService.addUser(user);
    }
}
