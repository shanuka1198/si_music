package com.ijse.simusic.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.simusic.Entity.Category;
import com.ijse.simusic.Service.CategoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class CategoryControllr {

@Autowired
private CategoryService categoryService;

@GetMapping("/category")
public ResponseEntity<List<Category>>getAllCategory(){
return ResponseEntity.status(HttpStatus.OK).body(categoryService.getAllCategory());
}

@PostMapping("/category")
public ResponseEntity<Category> createCategory(@RequestBody Category category) {
return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.createCategory(category));
}

@GetMapping("/category/{id}")
public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
Category category=categoryService.getCategoryById(id);
if(category!=null){
    return ResponseEntity.status(HttpStatus.OK).body(category);
}else{
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
}
}

@PutMapping("/category/{id}")
public ResponseEntity<Category> updateCategory(@PathVariable Long id, @RequestBody Category category) {
    return ResponseEntity.status(HttpStatus.OK).body(categoryService.updateCategory(id, category));
}
}
