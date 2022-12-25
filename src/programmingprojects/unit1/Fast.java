package programmingprojects.unit1;

public class Fast {

    public static void main(String[] args) {

        System.out.println(totalDigits(153));
    }

    public static int totalDigits(int number) {


        int count= 0;


        for (int n = 0; number!=0; n++){
            number = number/10;
            count++;
        }


        return count;

    }

}
