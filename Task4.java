public class Task4 {
    public static void main(String[] args) {
        int n, q,w;
        n=376;
        q=n/10;
        if (n>99 && n<1000){
            w=n%10+q%10+q/10;
            System.out.println("Сумма цифр числа n равна "+w);
        }
        else System.out.println("Введите трехзначное число");
    }
}
