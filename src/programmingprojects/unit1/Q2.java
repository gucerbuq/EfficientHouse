package programmingprojects.unit1;

public class Q2 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int gumNum;
        int candyNum;

        System.out.println("Congratulations! Enter your coupon amount : ");
        int coupon = sc.nextInt();

        if (coupon<2){
            System.out.println("You can't buy candy bar or gumball.");
        } else if (coupon<10) {
            System.out.println("You can't buy candy bar.");
            gumNum = coupon/2;
            System.out.println("You got " + gumNum + " gumball!");
        }else if(coupon>10){
            candyNum = coupon/10;
            System.out.println("You got " + candyNum + " candy bar!");
            gumNum = (coupon%10)/2;
            System.out.println("You got " + gumNum + " gumball!");
        }else {
            System.out.println("Enter a valid number.");
        }

    }

}
