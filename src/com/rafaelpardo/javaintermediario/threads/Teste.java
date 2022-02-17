package com.rafaelpardo.javaintermediario.threads;

public class Teste {
    public static void main(String[] args) {

//        MinhaThread thread = new MinhaThread("Thread #1", 600);
//        //thread.start();
//
//        MinhaThread thread2 = new MinhaThread("Thread #2", 900);
//
//        MinhaThread thread3 = new MinhaThread("Thread #3", 500);
//
//        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 900);
        //Thread t1 = new Thread(thread1);
        //t1.start();

        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 650);

        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 1100);
    }

}

