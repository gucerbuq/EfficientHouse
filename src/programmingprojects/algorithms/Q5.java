package programmingprojects.algorithms;

public class Q5 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        int num;

        System.out.println("Input a even number : " );
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            if (isPrime(i)) {

                if (isPrime(num - i)) {

                    System.out.println(i + " " + (num - i));

                }

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
