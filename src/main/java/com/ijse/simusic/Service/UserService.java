package com.ijse.simusic.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.simusic.Entity.User;

@Service
public interface UserService {
  List<User>getAllUsers();
  User createUser(User user);
  User getUserById(Long id);
  
}
