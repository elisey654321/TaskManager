package ru.iedev.taskmanager.model.multithreading;

public class Ex1 {

    static Object o1 = new Object();

    public static void main(String[] args) {

        TestTread testTread = new TestTread();

        Thread thread = new Thread(testTread);
        thread.start();

        Thread thread1 = new Thread(testTread);
        thread1.start();

    }

    static class TestTread implements Runnable{

        @Override
        public void run() {
//            synchronized (o1) {

                for (int i = 0; i < 100; i++) {
                    if (i%3 == 0){
                        System.out.println(i);
                    }
                }
                System.out.println("test");
//            }
        }
    }


}
