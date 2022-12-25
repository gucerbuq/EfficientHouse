package programmingprojects.unit3;

public class Q6 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        char repeat;

        do
        {
            System.out.print("Enter the initial size of a green crud population (in pounds): ");
            int initialPopulation = sc.nextInt();

            System.out.print("Enter the number of days: ");
            int numberOfDays = sc.nextInt();

            int f0 = 0;
            int f1 = initialPopulation;
            int f2 = f1 + f0;

            for (int day = 1; day <= numberOfDays; day++)
            {
                if (day % 5 == 0)
                {
                    f2 = f1 + f0;
                    f0 = f1;
                    f1 = f2;
                }
            }

            System.out.println("The number of pounds of green crud after " + numberOfDays
                    + " days: " + f2);

            System.out.print("\nEnter 'y' or 'Y' to repeat: ");
            repeat = sc.next().charAt(0);
            System.out.println();
        } while (repeat == 'Y' || repeat == 'y');

    }

}
