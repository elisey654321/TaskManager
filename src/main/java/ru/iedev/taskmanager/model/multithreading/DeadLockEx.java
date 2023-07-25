package ru.iedev.taskmanager.model.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockEx {

    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    static Runnable run1 = () -> {



        synchronized (lock1) {
            synchronized (lock2) {
                try {
                    lock1.wait(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    };

    static Runnable run2 = () -> {
        synchronized (lock2) {
            synchronized (lock1) {
                try {
                    lock1.wait(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    };

    public static void main(String[] args) {
        Thread thread1 = new Thread(run1);
        Thread thread2 = new Thread(run2);
        thread1.start();
        thread2.start();
    }

}
