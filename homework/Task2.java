package homework;

public class Task2 {

    static double withdrawBalance (double balance, double sumWithdraw) {
        double commissionpercents = 0.05;
        double commission = commissionpercents * sumWithdraw;
        double balanceAfter = balance - sumWithdraw - commission;

        if (balanceAfter >= 0) {
            System.out.println("Ok " + commission + " " + balanceAfter);
        }
        else {
            System.out.println("No");
        }

        return balanceAfter;
    }

    public static void main(String[] args) {

        double balance = 800;
        double sumWithdraw = 761.9;

        withdrawBalance(balance, sumWithdraw);

    }
}
