package classwork;

public class VariablesExample {
    public static void main(String[] args) {
        int a = 3, b = 10;
        int result = b / a;
        System.out.println(result);

        boolean test = false;
        boolean test1 = true;
        System.out.println(test && test1);

        for (int k=5; k<10; k++){
            System.out.println("value " + k);
        }

        int n = 10;
        while (n > 0) {
            System.out.println(n);
            n-=4;
        }
    }
}
