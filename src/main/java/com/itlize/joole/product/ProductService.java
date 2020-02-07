package com.itlize.joole.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void getAllProducts(){
       List<Product> products = new ArrayList<> ();
       productRepository.findAll()
               .forEach(products::add);

    }
    public void getProduct(int id){
    }
    public void addProduct(Product product){}
    public void updateProduct(Product product, int id){}
    public void deleteProduct(int id){}
}
