package com.example.cars;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class DataPersistencyHelper {

    public static Context Context;

    public static void StoreData(List<Car> cars) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Context);
        SharedPreferences.Editor editor = sp.edit();
        String json = new Gson().toJson(cars);
        editor.putString("cars", json);
        editor.commit();
    }

    public static List<Car> LoadData()
    {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Context);
        String json = sp.getString("cars", null);
        if (json != null)
        {
            Type type = new TypeToken<List<Car>>() {
            }.getType();
            return new Gson().fromJson(json,type);
        }
        else
        {
            List<Car> cars = new ArrayList<Car>();
            cars.add(new Car(R.drawable.porche, "Porche", "911", "Turbo S", "2017", "250,000$"));
            cars.add(new Car(R.drawable.aston, "Aston Martin", "vantage", "Sport", "2018", "400,000$"));
            cars.add(new Car(R.drawable.audi, "Audi", "rs5", "Sport", "2019", "205,000$"));
            cars.add(new Car(R.drawable.bmw, "Bmw", "7 series", "Sedan", "2020", "230,000$"));
            cars.add(new Car(R.drawable.corvette, "Chevrolet", "Corvette", "C8", "2021", "180,000$"));
            cars.add(new Car(R.drawable.cupra, "Seat", "Cupra", "Hatchback", "2016", "90,000$"));
            cars.add(new Car(R.drawable.lambo, "lamborghini", "Hurrican", "Sport", "2014", "310,000$"));
            cars.add(new Car(R.drawable.nissan, "Nissan", "GTR", "Nismo", "2020", "220,000$"));
            return cars;
        }

    }
}