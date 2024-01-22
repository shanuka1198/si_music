package com.ijse.simusic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.simusic.Entity.User;
import com.ijse.simusic.Service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class UserController {
  
@Autowired
private UserService userService;

@GetMapping("/users")
public List<User> getAllUsers(){
  return userService.getAllUsers();
}

@PostMapping("/users")
public User createUser(@RequestBody User user){
  return userService.createUser(user);
}
  


}
