package com.example.demo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private Insurance[] insurance;
    public Quote(){}

    public Insurance getInsurance(int i) {
        return insurance[i];
    }

    public void setInsurance(Insurance[] insurance) {
        this.insurance = insurance;
    }
    public int insuranceQty(){
        return insurance.length;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "insurance=" + insurance +
                '}';
    }
}
