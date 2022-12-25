package programmingprojects.unit1;

public class Q7 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int totaltime;

        System.out.println("Enter the total time in seconds : ");
        totaltime = sc.nextInt();

        int hour = totaltime/3600;
        int minute = (totaltime%3600)/60;
        int second = (totaltime%3600)%60;

        System.out.println("Hour : " + hour + " Minute : " + minute + " Second : " + second);




    }






}
