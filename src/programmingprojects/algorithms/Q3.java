package programmingprojects.algorithms;

public class Q3 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        int num;

        System.out.println("Input a number : ");
        num = sc.nextInt();

        findMultipliers(num);

    }

    public static void findMultipliers(int num) {

        for (int i = 1; i<=num; i++) {

            if (isPrime(i) && num%i==0) {
                System.out.print(i + " ");
                num = num/i;
                i--;
            }

        }

    }

    public static boolean isPrime(long a) {
        if (a <= 1)
            return false;

        if (a % 2 == 0)
            return a == 2;

        for (long i = 3; i * i <= a; i += 2)
            if (a % i == 0)
                return false;

        return true;
    }

}
