package com.itlize.joole.manufacturer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManufacturerService {

    @Autowired
    private ManufacturerRepository manufacturerRepository;

    public void getAllManufacturers(){
        List<Manufacturer> manufacturers = new ArrayList<>();
        manufacturerRepository.findAll()
                .forEach(manufacturers::add);

    }
    public void getManufacturer(int id){
    }
    public void addManufacturer(Manufacturer manufacturer){}
    public void updateManufacturer(Manufacturer manufacturer, int id){}
    public void deleteManufacturer(int id){}
}
