package programmingprojects.unit3;

public class Q4 {

    public static void main(String[] args) {

        double cost;
        double inflation;
        int year;

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Input cost : ");
        cost = sc.nextDouble();
        System.out.print("Input year : ");
        year = sc.nextInt();
        System.out.print("Input inflation rate : ");
        inflation = sc.nextDouble();

        for (int i = 0; i < year; i++) {
            cost += cost * inflation;
        }
        cost = (int) (cost * 100) / 100.0;

        System.out.println("The cost will be " + cost + " in " + year + " years. " );


    }

}
