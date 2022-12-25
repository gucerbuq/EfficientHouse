package programmingprojects.unit3;

public class Q5 {

    public static void main(String[] args) {

        double credit = 1000;
        double interestRate = 0.015;

        double interest = credit * interestRate;
        double debt = credit - interest;
        double paid = interest + debt;
        double newCredit = 965.0;

        int count = 0;
        double totalPaidInterest = 0.0;

        while (newCredit > 0) {
            interest = newCredit * interestRate;
            debt = newCredit - interest;
            paid = interest + debt;
            newCredit = newCredit - paid;
            totalPaidInterest += interest;

            count++;
        }

        System.out.print("Total paid interest : " + totalPaidInterest);

    }

}
