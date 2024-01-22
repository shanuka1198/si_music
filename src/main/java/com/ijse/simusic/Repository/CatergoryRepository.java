package com.ijse.simusic.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.simusic.Entity.Category;

@Repository
public interface CatergoryRepository extends JpaRepository<Category,Long> {
    
}

  

