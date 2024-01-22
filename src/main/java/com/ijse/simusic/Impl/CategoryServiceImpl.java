package com.ijse.simusic.Impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ijse.simusic.Entity.Category;
import com.ijse.simusic.Repository.CatergoryRepository;
import com.ijse.simusic.Service.CategoryService;


@Service
public class CategoryServiceImpl implements CategoryService{

@Autowired
  private CatergoryRepository catergoryRepository;

  @Override
  public List<Category> getAllCategory() {
  return catergoryRepository.findAll();
  }

  @Override
  public Category createCategory(Category category) {
 return catergoryRepository.save(category);
  }

  @Override
  public Category getCategoryById(Long id) {
   return catergoryRepository.findById(id).orElse(null);
  }

  @Override
  public Category updateCategory(Long id, Category category) {
   Category existinCategory=catergoryRepository.findById(id).orElse(null);

   if(existinCategory!=null){
    existinCategory.setName(category.getName());
    existinCategory.setProducts(category.getProducts());
    return catergoryRepository.save(existinCategory);
   }else{
    return null;
   }
  }
  
}
