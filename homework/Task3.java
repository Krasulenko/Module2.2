package homework;

public class Task3 {

    static double withdrawBalanceOwner( String ownerName, double sumWithdraw, double balances [], String ownerNames []) {
        double commissionPercents = 0.05;
        double commission = sumWithdraw * commissionPercents;
        double balanceAfter = 0;

        for (int i = 0; i < ownerNames.length; i++ ){
            if (ownerName == ownerNames [i]){
                double balance = balances [i];
                balanceAfter = balance - sumWithdraw - commission;
                if (balanceAfter >= 0){
                    System.out.println(ownerName + " " + sumWithdraw + " " + balanceAfter);
                }
                else {
                    System.out.println(ownerName + " No");
                }
                balances [i] = balanceAfter;
                break;
            }
        }
        return balanceAfter;
    }

    public static void main(String[] args) {

        double balances [] = {100, 300, 599, 577, 800};
        String ownerNames [] = {"Ann", "Sam", "Bill", "Jane", "Max"};

        System.out.println(balances[2]);

        String ownerName = "Bill";
        double sumWithdraw = 500;

        withdrawBalanceOwner(ownerName, sumWithdraw, balances, ownerNames);

        System.out.println(balances[2]);
    }
}
