package ru.iedev.taskmanager.model.multithreading;

public class Ex2 {


    public static void main(String[] args) {

        Object o = new Object();

        MyThread myThread = new MyThread(o);
        MyThread2 myThread2 = new MyThread2(o);

        myThread.start();
        myThread2.start();

    }

}

class MyThread extends Thread{

    private Object o;

    public MyThread(Object o){
        this.o = o;
    }

    @Override
    public void run() {
        synchronized (o) {
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
            }
        }
    }
}

class MyThread2 extends Thread{

    private Object o;

    public MyThread2(Object o){
        this.o = o;
    }

    @Override
    public void run() {
        synchronized (o) {
            for (int i = 1000; i > 1; i--) {
                System.out.println(i);
            }
        }
    }
}