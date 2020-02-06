package com.itlize.joole.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductController productController;

    @RequestMapping(method = RequestMethod.GET, value ="/products")
    public void getAllProducts(){

    }

    @RequestMapping(method = RequestMethod.GET, value = "/products/{id}")
    public void getProduct(@PathVariable int id){

    }

    @RequestMapping(method = RequestMethod.POST, value = "/products")
    public void addProduct(@RequestBody Product product){

    }
    @RequestMapping(method = RequestMethod.PUT, value = "/products/{id}")
    public void updateProduct(@RequestBody Product product, @PathVariable int id){

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/products/{id}")
    public void deleteProduct(@PathVariable int id){

    }
}
