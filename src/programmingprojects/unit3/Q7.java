package programmingprojects.unit3;

import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        //for finding armstrong number
        int number;

        System.out.println("Input the number to check if it is an armstrong number or not : ");
        number = sc.nextInt();



        System.out.println(isArmstrong(number));

        if (isArmstrong(number)){
            System.out.println(number + " is an Armstrong number.");
        }else {
            System.out.println(number + " is nat an Armstrong number.");
        }

    }

    public static int totalDigitsPowers(int number) {
        int originalNumber;
        int remainder;
        int result = 0;

        originalNumber = number;


        for (int n=0; originalNumber != 0; originalNumber /= 10, n++)
        {
            remainder = originalNumber % 10;

            result +=  pow(remainder, totalDigits(number));
        }

        return result;
    }

    public static boolean isArmstrong(int number) {
        return totalDigitsPowers(number)==number;
    }

    public static int totalDigits(int number) {


        int count= 0;


        for (int n = 0; number!=0; n++){
           number = number/10;
           count++;
        }


        return count;

    }

    public static long pow(int base, int power) {

        long powResult = 1;

        while (power != 0)
        {
            powResult *= base;
            --power;
        }

        return powResult;

    }




}
