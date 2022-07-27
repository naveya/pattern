package com.naveya.rosefinch.pattern.publishsubscribe.impl;

import com.naveya.rosefinch.pattern.publishsubscribe.Observer;

/**
 * @author eugene liu
 * @date 2022/7/26.
 */
public class DisplayObserver implements Observer {

    @Override
    public void update(Runnable runnable) {
        runnable.run();
    }
}
