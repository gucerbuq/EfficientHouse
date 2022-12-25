package programmingprojects.algorithms;

public class Q4 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        int height;
        int width;

        System.out.println("Input height : ");
        height = sc.nextInt();
        System.out.println("Input width : ");
        width = sc.nextInt();

        borders(height, width);

    }

    public static void borders(int height, int width) {



        for (int i = 0; i <= height; i++) {

            System.out.print("|");




            for (int j = 0; j <= width; j++) {

                System.out.print(" ");

            }

            System.out.print("|");
            System.out.println();

        }

    }

}
