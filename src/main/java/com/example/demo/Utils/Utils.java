package com.example.demo.Utils;

public class Utils {
    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();  // Preserve interrupt status
            System.out.println("Interrupted during sleep");
        }
    }
}
