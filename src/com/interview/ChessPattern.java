package com.interview;

public class ChessPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 8; j++) {
                if(i % 2 == j % 2){
                    sb.append("W");
                } else{
                    sb.append("B");
                }
            }
            System.out.print(sb.toString());
            System.out.println();
        }
    }
}
