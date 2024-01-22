package com.ijse.simusic.Service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.ijse.simusic.Entity.Category;

@Service
public interface CategoryService {
  List<Category>getAllCategory();
  Category createCategory(Category category);
  Category getCategoryById(Long cat_id);
  Category updateCategory(Long cat_id,Category category);
}
