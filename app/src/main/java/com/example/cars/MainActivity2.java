package com.example.cars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = getIntent().getExtras();
        Car car = (Car) b.getSerializable("car");

        ImageView image = findViewById(R.id.imageView);
        TextView name = findViewById(R.id.name);
        TextView price = findViewById(R.id.price);
        TextView brand = findViewById(R.id.brand);
        TextView model = findViewById(R.id.model);
        TextView year = findViewById(R.id.year);

        image.setImageResource(car.getImage());
        name.setText(car.getName());
        price.setText(car.getPrice());
        brand.setText(car.getBrand());
        model.setText(car.getModel());
        year.setText(car.getYear());
    }
}