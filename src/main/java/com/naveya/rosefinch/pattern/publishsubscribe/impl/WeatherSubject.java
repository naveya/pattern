package com.naveya.rosefinch.pattern.publishsubscribe.impl;

import com.naveya.rosefinch.pattern.publishsubscribe.Observer;

/**
 * @author eugene liu
 * @date 2022/7/26.
 */
public class WeatherSubject extends BaseSubject {


    @Override
    public Boolean post(Runnable runnable) {
        for(int i = 0; i < getObservers().size();i++){
            Observer observer = getObservers().get(i);
            observer.update(runnable);
        }
        return Boolean.TRUE;
    }
}
