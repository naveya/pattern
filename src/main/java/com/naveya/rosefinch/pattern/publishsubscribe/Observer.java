package com.naveya.rosefinch.pattern.publishsubscribe;

/**
 * @author eugene liu
 * @date 2022/7/26.
 */
public interface Observer {
    public void update(Runnable runnable);
}
