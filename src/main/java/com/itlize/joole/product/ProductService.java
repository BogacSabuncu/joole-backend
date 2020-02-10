package com.itlize.joole.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
       List<Product> products = new ArrayList<> ();
       productRepository.findAll()
               .forEach(products::add);

       return products;
    }

    public Optional<Product> getProduct(int id){
        return productRepository.findById(id);
    }

    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public void updateProduct(Product product, int id){}
    public void deleteProduct(int id){}
}
