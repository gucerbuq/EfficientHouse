package programmingprojects.unit1;

public class Q4 {

    public static void main(String[] args) {
        int amountOfSweeney;
        int weightOfMouse;
        int initWeightOfDieter;
        int desiredWeightOfDieter;
        double artificialSweetener = 0.001;

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter the amount of sweeney to kill a mouse : ");
        amountOfSweeney = sc.nextInt();
        System.out.println("Enter the weight of mouse : ");
        weightOfMouse = sc.nextInt();
        System.out.println("Enter the starting weight of pop soda : ");
        initWeightOfDieter = sc.nextInt();
        System.out.println("Enter the desired weight of artificial sweetener : ");
        desiredWeightOfDieter = sc.nextInt();



        double mouseDeathLimit = amountOfSweeney / artificialSweetener;
        double humanDeathLimit = (mouseDeathLimit * desiredWeightOfDieter) / weightOfMouse;

        //Printing the results
        System.out.println("Human limit of diet soda is :" + humanDeathLimit);

    }

}
