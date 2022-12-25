package programmingprojects.unit1;

public class Q1 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Please input your weight in kilograms : ");
        double weight = sc.nextDouble();
        System.out.println("Please input your height in meters : ");
        double height = sc.nextDouble();

        double bmi = weight/(height*height);

        System.out.println("Your bmi is : " + bmi);

    }

}
