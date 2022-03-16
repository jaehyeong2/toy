package jjfactory.thread;

public class App {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.run();

        System.out.println("main~");
    }

    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("hello !! " + Thread.currentThread().getName());
        }
    }
}
