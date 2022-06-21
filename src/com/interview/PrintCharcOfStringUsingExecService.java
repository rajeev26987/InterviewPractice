package com.interview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintCharcOfStringUsingExecService {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(6);
        for (int i = 0; i < 6; i++) {
            Task tsk = new Task(i);
            exec.execute(tsk);
        }
    }

    static class Task implements Runnable{
        final String name = "Shipra";
        private int i;
        public Task(int ind){
            i = ind;
        }
        @Override
        public void run() {
            System.out.println(name.charAt(i));
        }
    }


}
