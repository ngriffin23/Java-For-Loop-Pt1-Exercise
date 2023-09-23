package com.kaetech;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 99;
        int evenSum = 0;
        int oddSum = 0;

//Challenge 1
        for (int i = 1; i <= n; i++) {
            System.out.println("Display a string 99 times");
        }

//Challenge 2
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd Numbers:" + " " + i);
            }
        }

//Challenge 3
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Numbers:" + " " + i);
            }
        }

//Challenge 4
        for (int i = 2; i <= n; i+=2 ) {
                System.out.println("Even Numbers:" + " " + i);
        }

//Challenge 5
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                oddSum = oddSum + i;
            }
        }
        System.out.println("Sum of Odd Numbers :" + " " + oddSum);

//Challenge 6
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum = evenSum + i;
            }
        }
        System.out.println("Sum of Even Numbers :" + " " + evenSum);

// Challenge 7
        int num1, num2, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();

        total = 0;
        for(int i = num1; i <= num2; i++){
            total += i;
        }
        System.out.println("Sum of these numbers: " + total);
        sc.close();
    }

}

