package com.itlize.joole.salesRep;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SalesRepService {

    @Autowired
    private  SalesRepRepository salesRepRepository;

    public List<SalesRep> getAllSalesReps(){
        List<SalesRep> salesReps = new ArrayList<>();
        salesRepRepository.findAll()
                .forEach(salesReps::add);

        return salesReps;
    }
    public void getManufacturer(int id){
    }
    public void addManufacturer(SalesRep salesRep){}
    public void updateManufacturer(SalesRep salesRep, int id){}
    public void deleteManufacturer(int id){}
}
