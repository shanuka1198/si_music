package com.ijse.simusic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.simusic.Entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{
  
}
