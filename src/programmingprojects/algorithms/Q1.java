package programmingprojects.algorithms;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number : ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n-i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2*i-1; j++)
                System.out.print("*");

            System.out.println();
        }

        for (int i = n-1; i >= 1; i--) {

            for (int j = 1; j <= n-i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2*i-1; j++)
                System.out.print("*");

            System.out.println();
        }


    }

}
