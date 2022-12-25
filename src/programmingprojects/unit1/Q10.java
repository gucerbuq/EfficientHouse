package programmingprojects.unit1;

public class Q10 {

    public static void main(String[] args) {
        int lethalLimit = 10000;
        int colaLimit;
        int colaCaffeine = 34;
        int coffeeLimit;
        int coffeeCaffeine = 160;

        colaLimit = lethalLimit/colaCaffeine + 1;
        coffeeLimit = lethalLimit/coffeeCaffeine + 1;

        System.out.println("Max number of cola : " + colaLimit);
        System.out.println("Max number of coffee : " + coffeeLimit);


    }

}
