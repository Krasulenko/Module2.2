package homework;

public class Task1 {

   static  int sum (int array []) {
       int arraySum = 0;
       for (int massive: array ) {
           arraySum += massive;
       }
       return arraySum;
    }

    static  double sum (double array []) {
        double arraySum = 0;
        for (double massive: array ) {
            arraySum += massive;
        }
        return arraySum;
    }

    static int min (int array []){
       int arrayMin = array[0];
       for (int i = 1; i < array.length; i++){
           if (arrayMin > array[i]) arrayMin = array[i];
       }
       return arrayMin;
    }

    static double min (double array []){
        double arrayMin = array[0];
        for (int i = 1; i < array.length; i++){
            if (arrayMin > array[i]) arrayMin = array[i];
        }
        return arrayMin;
    }

    static int max (int array []){
        int arrayMax = array[0];
        for (int i = 1; i < array.length; i++){
            if (arrayMax < array[i]) arrayMax = array[i];
        }
        return arrayMax;
    }

    static double max (double array []){
        double arrayMax = array[0];
        for (int i = 1; i < array.length; i++){
            if (arrayMax < array[i]) arrayMax = array[i];
        }
        return arrayMax;
    }

    static int maxPositive (int array []){
        int arrayMaxPositive = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > 0 && array[i] > arrayMaxPositive) arrayMaxPositive = array[i];
        }
        return arrayMaxPositive;
    }

    static double maxPositive (double array []){
        double arrayMaxPositive = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > 0 && array[i] > arrayMaxPositive) arrayMaxPositive = array[i];
        }
        return arrayMaxPositive;
    }

    static long multiplication (int array []){
        long arrayMultiplication = 1;
        for (int massive:array) {
            arrayMultiplication *= massive;
        }
        return arrayMultiplication;
    }

    static double multiplication (double array []){
        double arrayMultiplication = 1;
        for (double massive:array) {
            arrayMultiplication *= massive;
        }
        return arrayMultiplication;
    }

    static int modulus (int array []){
        int modulusSum;
        int i = array.length-1;
        modulusSum = array [0] % array [i];
        return modulusSum;
    }

    static double modulus (double array []){
        double modulusSum;
        int i = array.length-1;
        modulusSum = array [0] % array [i];
        return modulusSum;
    }

    static int secondLargest (int array []){
        int firstLargest = array [0];
        int secondLargest = array [0];
        for (int i = 1; i < array.length; i++) {
            if (firstLargest < array [i]) {
                secondLargest = firstLargest;
                firstLargest = array [i];
            }
            else
            if (secondLargest < array [i] && array [i] != firstLargest) secondLargest = array [i];
        }
        if (secondLargest == firstLargest) {
            secondLargest = array [1];
            for (int i = 2; i < array.length; i++){
                if (secondLargest < array [i]) secondLargest = array [i];
            }
        }
        return secondLargest;
    }

    static double secondLargest (double array []){
        double firstLargest = array [0];
        double secondLargest = array [0];
        for (int i = 1; i < array.length; i++) {
            if (firstLargest < array [i]) {
                secondLargest = firstLargest;
                firstLargest = array [i];
            }
            else
                if (secondLargest < array [i] && array [i] != firstLargest) secondLargest = array [i];
        }
        if (secondLargest == firstLargest) {
            secondLargest = array [1];
            for (int i = 2; i < array.length; i++){
                if (secondLargest < array [i]) secondLargest = array [i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {

        int array [] = {2, 65, 768, 457, 985, 235, 190, 9, 900, -45};
        double array1 [] = {14.5, 56.97, 85.4, 12.7, 986.6, 984.76, 874.9, 764.8, 10.9, 2.1};

        int resSum = sum (array);
        double resSum1 = sum(array1);
        System.out.println("Sum int result " + resSum);
        System.out.println("Sum double result " + resSum1);

        int resMin = min (array);
        double resMin1 = min(array1);
        System.out.println("Min int result " + resMin);
        System.out.println("Min double result " + resMin1);

        int resMax = max (array);
        double resMax1 = max(array1);
        System.out.println("Max int result " + resMax);
        System.out.println("Max double result " + resMax1);

        int resMaxPos = maxPositive (array);
        double resMaxPos1 = maxPositive(array1);
        System.out.println("Max positive int result " + resMaxPos);
        System.out.println("Max positive double result " + resMaxPos1);

        long resMultipl = multiplication (array);
        double resMultipl1 = multiplication(array1);
        System.out.println("Multiplication of int result " + resMultipl);
        System.out.println("Multiplication of double result " + resMultipl1);

        int resMod = modulus (array);
        double resMod1 = modulus(array1);
        System.out.println("Modulus int result " + resMod);
        System.out.println("Modulus double result " + resMod1);

        int resSecLarg = secondLargest (array);
        double resSecLarg1 = secondLargest(array1);
        System.out.println("Second largest int result " + resSecLarg);
        System.out.println("Second largest double result " + resSecLarg1);
    }


}
