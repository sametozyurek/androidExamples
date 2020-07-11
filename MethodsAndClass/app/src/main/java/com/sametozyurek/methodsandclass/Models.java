package com.sametozyurek.methodsandclass;

public class Models {
    public String brand;
    public int fiyat;

    public Models(String brand, int fiyat){
        this.brand=brand;
        this.fiyat=fiyat;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
}
