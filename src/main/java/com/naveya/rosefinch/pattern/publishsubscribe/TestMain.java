package com.naveya.rosefinch.pattern.publishsubscribe;

import com.naveya.rosefinch.pattern.publishsubscribe.impl.DisplayObserver;
import com.naveya.rosefinch.pattern.publishsubscribe.impl.WeatherDo;
import com.naveya.rosefinch.pattern.publishsubscribe.impl.WeatherSubject;

/**
 * @author eugene liu
 * @date 2022/7/26.
 */
public class TestMain {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        DisplayObserver displayObserver =  new DisplayObserver();
        weatherSubject.registerObserver(displayObserver);
        WeatherDo weatherDo = new WeatherDo(12,"rain");
        weatherSubject.post(weatherDo);
        weatherDo = new WeatherDo(28,"cloud");
        weatherSubject.post(weatherDo);
    }
}
