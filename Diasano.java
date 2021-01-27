import java.util.Scanner;
public class Diasano{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int Dias;
        int Y, M, D;
        

        System.out.println("Por favor, digite a quantidade de dias");
        Dias = teclado.nextInt();

        Y = Dias / 365; 
        M = (Dias % 365) / 30;
        D = (Dias% 365) % 30;

        System.out.println(Y + " ano (s)");
        System.out.println(M + " mes (es)");
        System.out.println(D + " dia (s)");

        

    }
}