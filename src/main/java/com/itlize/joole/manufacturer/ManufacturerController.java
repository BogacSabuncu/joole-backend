package com.itlize.joole.manufacturer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ManufacturerController {

    @Autowired
    private ManufacturerService manufacturerService;

    @RequestMapping(method = RequestMethod.GET, value ="/manufacturers")
    public void getAllManufacturers(){
        //return productService.getAllProducts();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/manufacturer/{id}")
    public void getManufacturer(@PathVariable int id){

    }

    @RequestMapping(method = RequestMethod.POST, value = "/manufacturer")
    public void addManufacturer(@RequestBody Manufacturer manufacturer){

    }
    @RequestMapping(method = RequestMethod.PUT, value = "/manufacturer/{id}")
    public void updateManufacturer(@RequestBody Manufacturer manufacturer, @PathVariable int id){

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/manufacturer/{id}")
    public void deleteManufacturer(@PathVariable int id){

    }
}
