package com.naveya.rosefinch.pattern.publishsubscribe;

/**
 * @author eugene liu
 * @date 2022/7/26.
 */
public interface Subject {
    /**
     * 注册观察者
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    public void removeOberver(Observer observer);

    /**
     * 当主题状态发生改变时，这个方法需要被调用，以通知所有观察者
     */
    public Boolean post(Runnable runnable);
}
