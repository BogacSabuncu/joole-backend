package com.itlize.joole.product;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    private int productId;
    private String manufacturer;
    private String series;
    private String model;
    private String useType;
    private String application;
    private String mLocation;
    private String accessories;
    private String modelYear;
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
    private int SalesReps_salesRepId;
    private int Manufacturers_manufacturersId;
    private int Documentations_documentationsId;

    public Product(int productId, String manufacturer, String series, String model, String useType, String application, String mLocation, String accessories, String modelYear, int airflow, int powerMin, int powerMax, int voltageMin, int voltageMax, int speedMin, int speedMax, int noOfFanSpeed, int sound, int diameter, int heightMin, int heightMax, int weight, int salesReps_salesRepId, int manufacturers_manufacturersId, int documentations_documentationsId) {
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
        this.SalesReps_salesRepId = salesReps_salesRepId;
        this.Manufacturers_manufacturersId = manufacturers_manufacturersId;
        this.Documentations_documentationsId = documentations_documentationsId;
    }

    public Product() {
    }

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

    public int getSalesReps_salesRepId() {
        return SalesReps_salesRepId;
    }

    public void setSalesReps_salesRepId(int salesReps_salesRepId) {
        SalesReps_salesRepId = salesReps_salesRepId;
    }

    public int getManufacturers_manufacturersId() {
        return Manufacturers_manufacturersId;
    }

    public void setManufacturers_manufacturersId(int manufacturers_manufacturersId) {
        Manufacturers_manufacturersId = manufacturers_manufacturersId;
    }

    public int getDocumentations_documentationsId() {
        return Documentations_documentationsId;
    }

    public void setDocumentations_documentationsId(int documentations_documentationsId) {
        Documentations_documentationsId = documentations_documentationsId;
    }
}
