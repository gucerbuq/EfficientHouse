package programmingprojects.unit3;

public class Q1 {

    public static void main(String[] args) {

        double num;
        double guess;
        double r;
        double temp;
        double diff;

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a value for n: ");
        num = sc.nextDouble();

        guess = num / 10;


        do
        {
            r = num / guess;
            temp = guess;
            guess = (guess + r) / 2;
            diff = 	(temp - guess) / (0.01 * temp);
        }while(diff > 0);

        System.out.printf("Square root of n value is : " + r);

    }

}
