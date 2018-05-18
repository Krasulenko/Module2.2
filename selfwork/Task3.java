package selfwork;

public class Task3 {
    public static void main(String[] args) {
        double n, q;
        int w;
        n=16.5;
        q=n-(int)n;
        if (q>=0.5){
            w=(int)n+1;
        }
        else w=(int)n;
        System.out.println("При округлении числа n до целого получим "+w);
    }
}
