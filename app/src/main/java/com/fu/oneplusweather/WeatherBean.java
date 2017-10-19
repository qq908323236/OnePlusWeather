package com.fu.oneplusweather;

/**
 * Created by Fu.
 * QQ:908323236
 * 2017/10/18 17:37
 */

public class WeatherBean {

    //定义天气的标识
    public static final int SUN = 1;               //晴
    public static final int CLOUDY = 2;            //阴
    public static final int SNOW = 3;              //雪
    public static final int RAIN = 4;              //雨天
    public static final int SUN_CLOUDY = 5;        //多云
    public static final int THUNDER = 6;           //雷

    private int weatherId;          //天气标识，取值为上面6种
    private String date;            //日期
    private String week;            //周，星期
    private int maxTemperature;     //最高温度
    private int minTemperature;     //最低温度

    public WeatherBean(int weatherId, String date, String week, int maxTemperature, int minTemperature) {
        this.weatherId = weatherId;
        this.date = date;
        this.week = week;
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public static int[] getAllWeatherId() {
        int[] weatherId = {SUN, CLOUDY, SNOW, RAIN, SUN_CLOUDY, THUNDER};
        return weatherId;
    }
}
