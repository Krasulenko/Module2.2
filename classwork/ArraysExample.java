package classwork;

public class ArraysExample {

    static int calculateBalancesSum ( int [] balances) {
        int sum = 0;
        for (int balance: balances) {
            if (balance > 1000 && balance < 5000) {
                // send email promotion
                sum += balance;

            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] myIntArray0 = new int[3];
        int[] myIntArray1 = {1, 2, 3};
        int[] myIntArray2 = new int[]{1, 2, 3};

        for (int i = 0; i < myIntArray0.length; i++){
            System.out.println(myIntArray0 [i]);
        }
        System.out.println(myIntArray1[0]);
        System.out.println(myIntArray1.length);

        for (int item: myIntArray2) {

        }

        int[] balances = {1300, 1200, 50, 0, 10, 400, 900, 6000};
        int[] balances1 = {2300, 1500, 350, 40, 210, 1400, 5900, 600};

       /* int sum = 0;
        for (int balance: balances) {
            if (balance > 1000 && balance < 5000) {
                // send email promotion
                sum += balance;

                System.out.println("email was sent " + balance);
            }
        }

        for (int balance: balances1) {
            if (balance > 1000 && balance < 5000) {
                // send email promotion
                sum += balance;

                System.out.println("email was sent " + balance);
            }
        }*/

       int sum = calculateBalancesSum(balances);
       int sum1 = calculateBalancesSum(balances1);

        System.out.println(sum);
        System.out.println(sum1);

        String[] myStringArray0 = new String[3];
        String[] myStringArray1 = {"a", "b", "c"};
        String[] myStringArray2 = new String[]{"a", "b", "c"};
    }
}
