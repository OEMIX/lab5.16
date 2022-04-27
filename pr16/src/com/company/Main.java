package com.company;

public class Main {

    public static void main(String[] args) {


        for (;;) {
            int random = (int)(Math.random()*20);
            if (random > 0) {
                System.out.println(random);
            }else if (random<=0){
                break;
            }
        }

    }
}
