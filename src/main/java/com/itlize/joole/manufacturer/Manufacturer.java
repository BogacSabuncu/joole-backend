package com.itlize.joole.manufacturer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Manufacturer {
    @Id
    private int manufacturerId;
    private String mName;
    private String mPhone;
    private String mWeb;
    private String mEmail;

    public Manufacturer() {
    }

    public Manufacturer(int manufacturerId, String mName, String mPhone, String mEmail, String mWeb){
        super();
        this.manufacturerId = manufacturerId;
        this.mName = mName;
        this.mEmail = mEmail;
        this.mWeb = mWeb;
        this.mPhone = mPhone;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public String getmWeb() {
        return mWeb;
    }

    public void setmWeb(String mWeb) {
        this.mWeb = mWeb;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }
}
