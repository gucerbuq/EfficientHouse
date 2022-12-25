package programmingprojects.unit1;

public class Q6 {
    public static void main(String[] args) {
        int initPrincipalAmount = 1000;
        double initInterestRate = 0.05;
        int noOfYears = 5;

        double simpleInterest = (initPrincipalAmount * initInterestRate * noOfYears)/100;
        System.out.println("Five years of interest rate is : " + simpleInterest);

    }
}
