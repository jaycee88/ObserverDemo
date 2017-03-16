package com.jaycee.observerdemo.subject;

import com.jaycee.observerdemo.observer.Observer;

/**
 * 发布者、被观察者
 * Created by jaycee on 2017/3/16.
 */
public interface Subject {

    /**
     * 注册观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
