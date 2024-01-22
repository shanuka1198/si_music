package com.ijse.simusic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.simusic.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

  

  
}
