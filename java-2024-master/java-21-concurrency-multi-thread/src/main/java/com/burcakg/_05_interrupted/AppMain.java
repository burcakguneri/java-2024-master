package com.burcakg._05_interrupted;

import java.util.Random;

public class AppMain {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Random randomNo = new Random();

        final var mainThreadName = Thread.currentThread();

        new Thread( ()-> {

            try {

                for (int i = 1; i <= 6; i++) {
                    System.out.println("\n" + i + ". KOLON----------------------");

                    for (int j = 0; j < 6; j++) {
                        Thread.sleep(300);
                        System.out.print(randomNo.nextInt(50) + " ");
                    }
                    System.out.println();
                }

            } catch (InterruptedException e){
                System.out.println("Hata 1: " + e);
            } catch (Exception e){
                System.out.println("Hata 2: " + e);
            } finally {
                System.out.println("Teşekkür ederiz.");
            }


        }).start();



        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;

        System.out.println("startTime: "+ startTime);
        System.out.println("endTime: "+ endTime);
        System.out.println("elapsedTime: "+ elapsedTime);



    }
}
