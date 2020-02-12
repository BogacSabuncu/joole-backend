package com.itlize.joole.product;

import com.itlize.joole.documentation.Documentation;
import com.itlize.joole.manufacturer.Manufacturer;
import com.itlize.joole.salesRep.SalesRep;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String manufacturer;
    private String series;
    private String model;
    private String useType;
    private String application;
    private String mLocation;
    private String accessories;
    private String modelYear;
    private String imgUrl;
    private int airflow;
    private int powerMin;
    private int powerMax;
    private int voltageMin;
    private int voltageMax;
    private int speedMin;
    private int speedMax;
    private int noOfFanSpeed;
    private int sound;
    private int diameter;
    private int heightMin;
    private int heightMax;
    private int weight;

    @ManyToOne
    private SalesRep salesRep;
    @ManyToOne
    private Manufacturer newManufacturer;
//    @OneToMany()
//    private Documentation documentation;
    @OneToMany(cascade = CascadeType.ALL,
        fetch = FetchType.LAZY,
        mappedBy = "product")
    private Set<Documentation> documentations = new HashSet<>();

    public Product(int productId, String manufacturer, String series, String model, String useType, String application, String mLocation, String accessories, String modelYear, String imgUrl, int airflow, int powerMin, int powerMax, int voltageMin, int voltageMax, int speedMin, int speedMax, int noOfFanSpeed, int sound, int diameter, int heightMin, int heightMax, int weight, int salesRepId, int manufacturersId, int documentationsId) {
        super();
        this.productId = productId;
        this.manufacturer = manufacturer;
        this.series = series;
        this.model = model;
        this.useType = useType;
        this.application = application;
        this.mLocation = mLocation;
        this.accessories = accessories;
        this.modelYear = modelYear;
        this.airflow = airflow;
        this.powerMin = powerMin;
        this.powerMax = powerMax;
        this.voltageMin = voltageMin;
        this.voltageMax = voltageMax;
        this.speedMin = speedMin;
        this.speedMax = speedMax;
        this.noOfFanSpeed = noOfFanSpeed;
        this.sound = sound;
        this.diameter = diameter;
        this.heightMin = heightMin;
        this.heightMax = heightMax;
        this.weight = weight;
        this.salesRep = new SalesRep(salesRepId,"","","","");
        this.newManufacturer = new Manufacturer(manufacturersId,"","","","");
        //this.documentation = new Documentation(documentationsId,"","");
        this.imgUrl = imgUrl;
    }

    public  Product(int id){
        this.productId = id;
    }

    public Product() { }

    public int getProductId(){
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public int getAirflow() {
        return airflow;
    }

    public void setAirflow(int airflow) {
        this.airflow = airflow;
    }

    public int getPowerMin() {
        return powerMin;
    }

    public void setPowerMin(int powerMin) {
        this.powerMin = powerMin;
    }

    public int getPowerMax() {
        return powerMax;
    }

    public void setPowerMax(int powerMax) {
        this.powerMax = powerMax;
    }

    public int getVoltageMin() {
        return voltageMin;
    }

    public void setVoltageMin(int voltageMin) {
        this.voltageMin = voltageMin;
    }

    public int getVoltageMax() {
        return voltageMax;
    }

    public void setVoltageMax(int voltageMax) {
        this.voltageMax = voltageMax;
    }

    public int getSpeedMin() {
        return speedMin;
    }

    public void setSpeedMin(int speedMin) {
        this.speedMin = speedMin;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = speedMax;
    }

    public int getNoOfFanSpeed() {
        return noOfFanSpeed;
    }

    public void setNoOfFanSpeed(int noOfFanSpeed) {
        this.noOfFanSpeed = noOfFanSpeed;
    }

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        this.sound = sound;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getHeightMin() {
        return heightMin;
    }

    public void setHeightMin(int heightMin) {
        this.heightMin = heightMin;
    }

    public int getHeightMax() {
        return heightMax;
    }

    public void setHeightMax(int heightMax) {
        this.heightMax = heightMax;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public SalesRep getSalesRep() {
        return salesRep;
    }

    public void setSalesRep(SalesRep salesRep) {
        this.salesRep = salesRep;
    }

    public Manufacturer getNewManufacturer() {
        return newManufacturer;
    }

    public void setNewManufacturer(Manufacturer newManufacturer) {
        this.newManufacturer = newManufacturer;
    }

    public Set<Documentation> getDocumentations() {
        return documentations;
    }

    public void setDocumentations(Set<Documentation> documentations) {
        this.documentations = documentations;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
