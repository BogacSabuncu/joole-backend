package com.itlize.joole.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET, value ="/products")
    public ResponseEntity<?> getAllProducts(){
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/products/{id}")
    public ResponseEntity<?> getProduct(@PathVariable int id){
        return new ResponseEntity<>(productService.getProduct(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/products")
    public ResponseEntity<?> addProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.addProduct(product),HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/products/{id}")
    public void updateProduct(@RequestBody Product product, @PathVariable int id){

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/products/{id}")
    public void deleteProduct(@PathVariable int id){

    }
}
