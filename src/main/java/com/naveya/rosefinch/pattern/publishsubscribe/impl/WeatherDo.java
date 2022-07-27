package com.naveya.rosefinch.pattern.publishsubscribe.impl;

/**
 * @author eugene liu
 * @date 2022/7/26.
 */
public class WeatherDo implements Runnable{
    private Integer temperature;
    private String cloud;

    public WeatherDo(Integer temperature,String cloud){
        this.cloud = cloud;
        this.temperature = temperature;
    }
    @Override
    public void run() {
        System.out.print("temperature is "+temperature +" cloud is "+cloud);
    }
}
