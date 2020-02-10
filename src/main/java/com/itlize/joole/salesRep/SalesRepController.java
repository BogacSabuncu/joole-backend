package com.itlize.joole.salesRep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalesRepController {

    @Autowired
    private SalesRepService salesRepService;

    @RequestMapping(method = RequestMethod.GET, value ="/salesReps")
    public List<SalesRep> getAllSalesReps(){
        return salesRepService.getAllSalesReps();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/salesRep/{id}")
    public void getSalesRep(@PathVariable int id){

    }

    @RequestMapping(method = RequestMethod.POST, value = "/salesRep")
    public void addSalesRep(@RequestBody SalesRep salesRep){

    }
    @RequestMapping(method = RequestMethod.PUT, value = "/salesRep/{id}")
    public void updateSalesRep(@RequestBody SalesRep salesRep, @PathVariable int id){

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/salesRep/{id}")
    public void deleteSalesRep(@PathVariable int id){

    }
}
