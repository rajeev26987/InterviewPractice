package com.interview.Educative;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
    public static void main(String[] args) {
        List<String> msgList = new ArrayList<>();
        Thread t1 = new Thread(new ProduceMsg(msgList));
        Thread t2 = new Thread(new ConsumeMsg(msgList));
        t1.start();
        t2.start();
    }
    static class ProduceMsg implements Runnable{
        List<String> msgObj;
        ProduceMsg(List<String> msgObj){
            this.msgObj = msgObj;
        }
        @Override
        public void run() {
            // running it 5 times
            for(int i = 1; i <= 5; i++){
                synchronized (msgObj) {
                    // loop checking wait condition to avoid spurious wakeup
                    while(msgObj.size() >= 1){
                        try {
                            msgObj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    msgObj.add("Hello-" + i);
                    System.out.println("Adding to list - " + msgObj.get(0));
                    msgObj.notify();
                }
            }
        }
    }

    // This class consumes message from a shared list
    static class ConsumeMsg implements Runnable{
        List<String> msgObj;
        ConsumeMsg(List<String> msgObj){
            this.msgObj = msgObj;
        }

        @Override
        public void run() {
            for(int i = 1; i <= 5; i++){
                synchronized (msgObj) {
                    // loop checking wait condition to avoid spurious wakeup
                    while(msgObj.size() < 1){
                        try {
                            msgObj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    // Getting value from the list
                    System.out.println("Getting from queue - " + msgObj.get(0));
                    msgObj.remove(0);
                    msgObj.notify();
                }
            }
        }
    }
}
