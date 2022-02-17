package com.rafaelpardo.javaintermediario.threads;

public class Test8 {
    public static void main(String[] args) {

        MinhaThread2 t1 = new MinhaThread2("#1");
        MinhaThread2 t2 = new MinhaThread2("#2");

        System.out.println("Pausando a Thread #1");

        t1.suspend();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Pausando a Thread #2");

        t2.suspend();

        System.out.println("Resumindo a Thread #1");

        t1.resume();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Resumindo a Thread #2");

        t2.resume();

        System.out.println("Terminando a Thread #2");

        t2.stop();
    }

}
