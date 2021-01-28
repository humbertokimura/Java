import java.util.Scanner;

public class Uri1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, Aux=1;

        N = teclado.nextInt();

        for (int i=1 ; i <= N ; i++){
            System.out.println(Aux + " " + (Aux * Aux) + " " + (Aux * Aux * Aux) );
            Aux ++;
        }

    }
}