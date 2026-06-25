package JavaProgramTesting;

import java.util.*;

public class Sleeping {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        t2.start();

    }
}

class MyThread extends Thread {

    ArrayList<String> list = new ArrayList<>();

    {
        list.add("You are lucky man");
        list.add("fine hain");
        list.add("You are bad man");
        list.add("handsome hain");
        list.add("You are 5th man");
        list.add("guys hain");
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i) + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
