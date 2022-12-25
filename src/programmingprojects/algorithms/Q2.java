package programmingprojects.algorithms;

public class Q2 {

    public static void main(String[] args) {

        long totalTime;

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Input the total duration in seconds : ");
        totalTime = sc.nextLong();

        displayDuration(totalTime);


    }

    public static void displayDuration(long totalTime) {

        int second;
        int minute;
        int hour;

        minute = (int) (totalTime / 60);
        second = (int) (totalTime % 60);
        hour = minute / 60;
        minute = minute % 60;

        if (second==0 && minute==0) {
            System.out.println("Duration : " + hour);
        } else if(second==0) {
            System.out.println("Duration : " + hour + ":" + minute);
        }else {
            System.out.println("Duration : " + hour + ":" + minute + ":" + second);
        }

    }

}
