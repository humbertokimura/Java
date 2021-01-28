import java.util.Scanner;

public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int N;
        double Q;
        N = teclado.nextInt();
        for (int i=2 ; i <= N ; i += 2) {
            System.out.println(i + "^2 = " + (i*i));
        }

    }
}