package homework;

public class Task4 {

    static double balanceFund (double fund, String ownerName, double balances [], String ownerNames []) {
        double balanceAfter = 0;

        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName == ownerNames [i]) {
                double balance = balances [i];
                balanceAfter = balance + fund;
                balances [i] = balanceAfter;
                System.out.println(ownerName + " " + balanceAfter);
                break;
            }
        }
        return balanceAfter;

    }

    public static void main(String[] args) {

        double balances [] = {300, 700, 400, 500, 90};
        String ownerNames [] = {"Jack", "Max", "Julia", "Sam", "Ann"};

        System.out.println(balances[2]);

        String ownerName = "Julia";
        double fund = 300;

        balanceFund(fund, ownerName, balances, ownerNames);

        System.out.println(balances[2]);
    }
}
