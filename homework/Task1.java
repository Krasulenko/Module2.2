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

    
}
