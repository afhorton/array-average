/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array_average;

/**
 *
 * @author allenhorton
 */
import java.util.Scanner;
        
public class Array_average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's make an array."
                + "  Enter the number of elements in the array:\t");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element" + (i+1) + ":");
            numbers[i] = scanner.nextInt();
        }
        
        
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        System.out.println("Ta-da!  The average is:" + average);
    }
}
