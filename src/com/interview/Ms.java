package com.interview;

public class Ms {
    static int number; // maxim possible n = 100
    int counter = 1;

    public void printEven(){
        synchronized (this){
            while(counter < number){
                while(counter % 2 == 1){
                    try{
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
                System.out.println(counter);
                counter++;
                notify();
            }
        }
    }

    public void printOdd(){
        synchronized (this){
            while(counter < number){
                while(counter % 2 == 0){
                    try{
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
                System.out.println(counter);
                counter++;
                notify();
            }
        }
    }


    public static void main(String[] args) {
        number = 50;
        Ms inst = new Ms();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                inst.printEven();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                inst.printOdd();
            }
        });

        t1.start();
        t2.start();
    }
}
