package com.itlize.joole.documentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DocumentationController {

    @Autowired
    private DocumentationService documentationService;

    @RequestMapping(method = RequestMethod.GET, value ="/documentations")
    public void getAllDocumentation(){
        //return productService.getAllProducts();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/documentation/{id}")
    public void getDocumentation(@PathVariable int id){

    }

    @RequestMapping(method = RequestMethod.POST, value = "/documentation")
    public void addDocumentation(@RequestBody Documentation documentation){

    }
    @RequestMapping(method = RequestMethod.PUT, value = "/documentation/{id}")
    public void updateDocumentation(@RequestBody Documentation documentation, @PathVariable int id){

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/documentation/{id}")
    public void deleteDocumentation(@PathVariable int id){

    }

}
