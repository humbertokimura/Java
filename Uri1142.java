import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, Aux=1;

        N = teclado.nextInt();

        for (int i=1 ; i <= N ; i++){
            System.out.println(Aux + " " + (Aux +1) + " " + (Aux + 2) + " PUM");
            Aux += 4;
        }

    }
}