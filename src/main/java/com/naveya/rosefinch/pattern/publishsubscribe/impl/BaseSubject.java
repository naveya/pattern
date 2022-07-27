package com.naveya.rosefinch.pattern.publishsubscribe.impl;


import com.naveya.rosefinch.pattern.publishsubscribe.Observer;
import com.naveya.rosefinch.pattern.publishsubscribe.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author eugene liu
 * @date 2022/7/26.
 */
public abstract class BaseSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeOberver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0){
            observers.remove(i);
        }
    }

    public List<Observer> getObservers(){
        return observers;
    }
}
