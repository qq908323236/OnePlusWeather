package com.fu.oneplusweather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private OnePlusWeatherView weatherview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.weatherview = (OnePlusWeatherView) findViewById(R.id.weather_view);

        List<WeatherBean> data = new ArrayList<>();

        WeatherBean w1 = new WeatherBean(1, "10/19", "今日", 20, 15);
        WeatherBean w2 = new WeatherBean(2, "10/20", "周五", 23, 16);
        WeatherBean w3 = new WeatherBean(3, "10/21", "周六", 21, 16);
        WeatherBean w4 = new WeatherBean(4, "10/22", "周日", 18, 16);
        WeatherBean w5 = new WeatherBean(5, "10/23", "周一", 18, 14);
        WeatherBean w6 = new WeatherBean(6, "10/24", "周二", 21, 14);

        data.add(w1);
        data.add(w2);
        data.add(w3);
        data.add(w4);
        data.add(w5);
        data.add(w6);

        weatherview.setData(data);

    }
}
