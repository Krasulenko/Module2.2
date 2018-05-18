package selfwork;

public class Task2 {
    public static void main(String[] args) {
        int n, e;
        n=68;
        if (n<100 && n>9){
            //if (n>9){
            e=n/10+n%10;
            System.out.println("Сумма цифр числа n равна "+e);
            //}
                /*else {
                System.out.println("Вы ввели однозначное число. Введите двухзначное число");
            }*/
        }
        else{
            System.out.println("Введите двухзначное число");
        }

        //e=n/10+n%10;
        //System.out.println("Сумма цифр числа n равна "+e);

    }
}
