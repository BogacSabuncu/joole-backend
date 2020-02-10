package com.itlize.joole.salesRep;

import javax.persistence.*;

@Entity
@Table(name = "salesReps")
public class SalesRep {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int salesRepId;

    private String srName;
    private String srPhone;
    private String srEmail;
    private String srWeb;

    public SalesRep(int salesRepId, String srName, String srPhone, String srEmail, String srWeb) {
        super();
        this.salesRepId = salesRepId;
        this.srName = srName;
        this.srPhone = srPhone;
        this.srEmail = srEmail;
        this.srWeb = srWeb;
    }

    public SalesRep(){

    }

    public int getSalesRepId() {
        return salesRepId;
    }

    public void setSalesRepId(int salesRepId) {
        this.salesRepId = salesRepId;
    }

    public String getSrName() {
        return srName;
    }

    public void setSrName(String srName) {
        this.srName = srName;
    }

    public String getSrPhone() {
        return srPhone;
    }

    public void setSrPhone(String srPhone) {
        this.srPhone = srPhone;
    }

    public String getSrEmail() {
        return srEmail;
    }

    public void setSrEmail(String srEmail) {
        this.srEmail = srEmail;
    }

    public String getSrWeb() {
        return srWeb;
    }

    public void setSrWeb(String srWeb) {
        this.srWeb = srWeb;
    }
}
