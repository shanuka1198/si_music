package com.ijse.simusic.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.simusic.Entity.Product;


@Service
public interface ProductService {

  List<Product>getAllProduct();
  Product createProduct(Product product);
  Product getProductById(Long product_id);
  Product updateProduct(Long product_id,Product product);
}
