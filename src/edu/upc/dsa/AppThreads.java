package edu.upc.dsa;

public class AppThreads {
    public static void main(String[] args) throws InterruptedException {
        ThreadClass threadClass = new ThreadClass("thread class");
        Thread thread = new Thread(new RunnableClass(), "runnable class");
        threadClass.start();
        thread.start();

        threadClass.join();
        thread.join();

        System.out.println("Se acab�.");
    }
}
