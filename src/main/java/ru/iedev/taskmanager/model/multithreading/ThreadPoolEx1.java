package ru.iedev.taskmanager.model.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolEx1 {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableTest1());
            executorService.execute(new RunnableTest2());
        }
        executorService.shutdown();
    }

}

class RunnableTest1 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

class RunnableTest2 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}