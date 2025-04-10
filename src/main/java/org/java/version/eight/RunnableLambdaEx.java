package org.java.version.eight;

public class RunnableLambdaEx {
    public static void main(String[] args) {
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Runnable");
            }
        };
        new Thread(runnable).start();

        Runnable runnable1= () -> {
            System.out.println("Hello Runnable using java 8");
        };
        new Thread(runnable1).start();
    }


}
