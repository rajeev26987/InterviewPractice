package com.interview;

public class ChessPattern {
    public static void main(String[] args) {

        ChessPattern my = new ChessPattern();
        my.call(new One());


    }

    void call(One o){
        o.start();
    }

    static class One extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println(i);
            }
        }
    }
}
