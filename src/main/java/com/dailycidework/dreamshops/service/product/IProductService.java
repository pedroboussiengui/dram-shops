package com.dailycidework.dreamshops.service.product;

import com.dailycidework.dreamshops.model.Product;
import com.dailycidework.dreamshops.request.AddProductRequest;
import com.dailycidework.dreamshops.request.UpdateProductRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(UpdateProductRequest product, Long id);
    List<Product> getAllProducts();
    List<Product> getProductByName(String name);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);
}
