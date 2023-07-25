package ru.iedev.taskmanager.model.multithreading;

public class VolatileEx extends Thread{

    volatile boolean b = true;

    public static void main(String[] args) throws InterruptedException {
        VolatileEx volatileEx = new VolatileEx();
        volatileEx.start();
        Thread.sleep(3000);
        System.out.println("after 3 seconds it is time to wake up");
        volatileEx.b = false;
        System.out.println("end");
    }

    public void run(){
        long count = 0;
        while (b){
            count++;
        }
        System.out.println("loop is finished. counter = " + count);
    }

}
