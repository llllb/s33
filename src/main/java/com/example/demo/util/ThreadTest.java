package com.example.demo.util;

public class ThreadTest implements Runnable{

    @Override
    public void run() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        Thread thread1 = new Thread(threadTest);
        Thread thread2 = new Thread(threadTest);
        thread1.start();
        thread2.start();
    }
}
