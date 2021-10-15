package com.opendoors.landmanagement.domain;

public class Contract {
    String greeting;
    String background;
    String whyyourproperty;
    String ouroffer;
    String ourjob;
    String regardingagreement;

    public Contract() {}

    public Contract(Contract c) {
        this.greeting = c.getGreeting();
        this.background = c.getBackground();
        this.whyyourproperty = c.getWhyyourproperty();
        this.ouroffer = c.getOuroffer();
        this.ourjob = c.getOurjob();
        this.regardingagreement = c.getRegardingagreement();
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getWhyyourproperty() {
        return whyyourproperty;
    }

    public void setWhyyourproperty(String whyyourproperty) {
        this.whyyourproperty = whyyourproperty;
    }

    public String getOuroffer() {
        return ouroffer;
    }

    public void setOuroffer(String ouroffer) {
        this.ouroffer = ouroffer;
    }

    public String getOurjob() {
        return ourjob;
    }

    public void setOurjob(String ourjob) {
        this.ourjob = ourjob;
    }

    public String getRegardingagreement() {
        return regardingagreement;
    }

    public void setRegardingagreement(String regardingagreement) {
        this.regardingagreement = regardingagreement;
    }
    
    
    
}
