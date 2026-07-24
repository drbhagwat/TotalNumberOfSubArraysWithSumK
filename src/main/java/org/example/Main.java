package org.example;

import java.util.Scanner;

public class Main {
    private int[] data;
    private int numberOfElements;
    private int requiredSum;

    public static void main() {
        Main main = new Main();
        main.read();
        main.print();
        System.out.println(main.subarraySum(main.getData(), main.getRequiredSum()));
    }

    private int[] getData() {
        return data;
    }

    private int getRequiredSum() {
        return requiredSum;
    }

    public Main() {
    }

    public void read() {
        System.out.print("Enter the number of elements to be stored in an array : ");
        Scanner scanner = new Scanner(System.in);
        numberOfElements = scanner.nextInt();
        data = new int[numberOfElements];

        System.out.print("Now, read the elements one by one (each separated by a whitespace (space, tab, or newline)): ");

        for (int i = 0; i < data.length; i++) {
            data[i] = scanner.nextInt();
        }
        System.out.print("Now Enter the value os k so, I can find out how many subarrays add up to K ");
        requiredSum = scanner.nextInt();
        scanner.close();
    }

    public void print() {
        for (int i = 0; i < numberOfElements; i++) {
            System.out.println(data[i] + "\t");
        }
        System.out.println("\n");
    }

    public int subarraySum(int[] nums, int k) {
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            int sum = 0;

            for(int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
