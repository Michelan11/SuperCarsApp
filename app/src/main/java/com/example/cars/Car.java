package com.example.cars;

import java.io.Serializable;

public class Car implements Serializable {
    private int Image;
    private String Name;
    private String Brand;
    private String Model;
    private String Year;
    private String Price;

    public int getImage() {
        return Image;
    }
    public String getName() {
        return Name;
    }
    public String getBrand() {
        return Brand;
    }
    public String getModel() {
        return Model;
    }
    public String getYear() {
        return Year;
    }
    public String getPrice(){return Price;}

public Car(int image,String name,String brand,String model, String year, String price)
{
    this.Image = image;
    this.Name = name;
    this.Brand = brand;
    this.Model = model;
    this.Year = year;
    this.Price = price;

}

}
