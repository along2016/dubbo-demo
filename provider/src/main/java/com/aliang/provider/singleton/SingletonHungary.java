package com.aliang.provider.singleton;

/**
 * 饿汉模式
 */
public class SingletonHungary {
    private static final SingletonHungary singletonHungary = new SingletonHungary();

    /** 将构造器设置为private禁止通过new进行实例化 */
    private SingletonHungary(){

    }

    public static SingletonHungary getInstance(){
        return singletonHungary;
    }
}
