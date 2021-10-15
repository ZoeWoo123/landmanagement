package com.opendoors.landmanagement.domain;

public class OwnerForTemp {
    String fullname;
    String Streetaddress;
    String salutation;
    String parcelacreage;
    String citystatezip;

    public OwnerForTemp(){}
    public OwnerForTemp(String fn, String sa, String salu, String pa, String csz) {
        this.fullname = fn;
        this.Streetaddress = sa;
        this.salutation = salu;
        this.parcelacreage = pa;
        this.citystatezip = csz;
    }
    
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getStreetaddress() {
        return Streetaddress;
    }
    public void setStreetaddress(String streetaddress) {
        Streetaddress = streetaddress;
    }
    public String getSalutation() {
        return salutation;
    }
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }
    public String getParcelacreage() {
        return parcelacreage;
    }
    public void setParcelacreage(String parcelacreage) {
        this.parcelacreage = parcelacreage;
    }
    public String getCitystatezip() {
        return citystatezip;
    }
    public void setCitystatezip(String citystatezip) {
        this.citystatezip = citystatezip;
    }
    
}
