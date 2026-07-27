package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private int[] data;
    private int requiredSum;

    public static void main() {
        Main main = new Main();
        main.read();
        main.print();
        int requiredSum = main.getRequiredSum();
        System.out.println("# of subarrays whose sum is " + requiredSum + " is " + main.subarraySum(requiredSum));
    }

    private int getRequiredSum() {
        return requiredSum;
    }

    public void read() {
        System.out.print("Enter the number of elements to be stored in an array : ");
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        data = new int[numberOfElements];
        System.out.print("Now, read the elements one by one (each separated by a whitespace (space, tab, or newline)): ");

        for (int i = 0; i < data.length; i++) {
            data[i] = scanner.nextInt();
        }
        System.out.print("What is the required Sum? ");
        requiredSum = scanner.nextInt();
        scanner.close();
    }

    public void print() {
        System.out.print("The array is as follows: ");
        System.out.println(Arrays.toString(data));
    }

    public int subarraySum(int k) {
        int count = 0;

        for(int i = 0; i < data.length; i++) {
            int sum = 0;

            for(int j = i; j < data.length; j++) {
                sum += data[j];

                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}