# OnePlusWeather

仿一加天气6日温度折线图控件

源码解析博客地址:![自定义View之一加天气中的6日温度折线图](http://blog.csdn.net/fu908323236/article/details/78287030)

预览图

![预览图](https://github.com/qq908323236/OnePlusWeather/blob/master/image/pre_img.png)

xml中

```XML
    <com.fu.oneplusweather.OnePlusWeatherView
        android:id="@+id/weather_view"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp"/>
```

MainActivity中
```Java
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
```
