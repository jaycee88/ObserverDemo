package com.jaycee.observerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jaycee.observerdemo.observer.CurrentConditionsDisplay;
import com.jaycee.observerdemo.observer.ForecastDisplay;
import com.jaycee.observerdemo.subject.WeatherData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WeatherData weatherData = new WeatherData();
                CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
                ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

                List<Float> forecastTemperatures = new ArrayList<>();
                forecastTemperatures.add(22f);
                forecastTemperatures.add(-1f);
                forecastTemperatures.add(9f);
                forecastTemperatures.add(23f);
                forecastTemperatures.add(27f);
                forecastTemperatures.add(30f);
                forecastTemperatures.add(10f);
                weatherData.setMeasurements(22f, 0.8f, 1.2f, forecastTemperatures);
            }
        });
    }
}
