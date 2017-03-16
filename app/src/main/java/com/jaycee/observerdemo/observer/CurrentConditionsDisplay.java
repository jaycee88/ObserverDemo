package com.jaycee.observerdemo.observer;

import com.jaycee.observerdemo.subject.WeatherData;

/**
 * 当前天气公告牌
 * Created by jaycee on 2017/3/16.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;

    private float temperature;// 温度
    private float humidity;// 湿度
    private float pressure;// 气压

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.humidity = this.weatherData.getHumidity();
        this.pressure = this.weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("当前温度为：" + this.temperature + "℃");
        System.out.println("当前湿度为：" + this.humidity);
        System.out.println("当前气压为：" + this.pressure);
    }
}
