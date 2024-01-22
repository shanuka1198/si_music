package com.ijse.simusic.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ijse.simusic.Entity.User;
import com.ijse.simusic.Repository.UserRepository;
import com.ijse.simusic.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

@Autowired
private UserRepository userRepository;

  @Override
  public List<User> getAllUsers() {
  return userRepository.findAll();
  }

  @Override
  public User createUser(User user) {
    return userRepository.save(user);
  }

  @Override
  public User getUserById(Long id) {
    return userRepository.findById(id).orElse(null);
  }
  
}
