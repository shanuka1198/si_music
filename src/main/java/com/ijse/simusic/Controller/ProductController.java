package com.ijse.simusic.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.simusic.Entity.Product;
import com.ijse.simusic.Service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class ProductController {

@Autowired
private ProductService productService;

@GetMapping("/products")
public List<Product>getAllProduct(){
return productService.getAllProduct();
}

@PostMapping("/products")
public Product createProduct(@RequestBody Product product) {
return productService.createProduct(product);
}

@GetMapping("/products/{id}")
public Product getProductById(@PathVariable Long id) {
return productService.getProductById(id);
}
@PutMapping("/products/{id}")
public Product updateProduct(@PathVariable Long id,@RequestBody Product product) {
return productService.updateProduct(id, product);
}

}



