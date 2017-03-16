package com.jaycee.observerdemo.observer;

import com.jaycee.observerdemo.subject.WeatherData;

import java.util.List;

/**
 * 未来几天天气公告牌
 * Created by jaycee on 2017/3/16.
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;

    private List<Float> forecastTemperatures;//未来几天的温度

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.forecastTemperatures = this.weatherData.getForecastTemperatures();
        display();
    }

    @Override
    public void display() {
        System.out.println("未来几天的气温");
        int count = forecastTemperatures.size();
        for (int i = 0; i < count; i++) {
            System.out.println("第" + i + "天:" + forecastTemperatures.get(i) + "℃");
        }
    }
}
