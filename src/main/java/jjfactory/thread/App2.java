package jjfactory.thread;

public class App2 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread:  "  +Thread.currentThread().getName());
        });
        thread.start();
    }
}