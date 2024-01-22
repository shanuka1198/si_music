package com.ijse.simusic.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ijse.simusic.Entity.Product;
import com.ijse.simusic.Repository.ProductRepository;
import com.ijse.simusic.Service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductRepository productRepository;

  @Override
  public List<Product> getAllProduct() {
  return productRepository.findAll();
  }

  @Override
  public Product createProduct(Product product) {
    return productRepository.save(product);
  }

  @Override
  public Product getProductById(Long id) {
    return productRepository.findById(id).orElse(null);
  }

  @Override
  public Product updateProduct(Long id, Product product) {
  Product existinProduct=productRepository.findById(id).orElse(null);
  if(existinProduct!=null){
    existinProduct.setProduct_name(product.getProduct_name());
    existinProduct.setBrand(product.getBrand());
    existinProduct.setModel(product.getModel());
    existinProduct.setPrice(product.getPrice());
    existinProduct.setCategory(product.getCategory());
    
    return productRepository.save(existinProduct);
  }else{
    return null;
  }
  }
  
}
