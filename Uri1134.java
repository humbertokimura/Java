import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        int Tipo, A=0, G=0, D=0;

        while ((Tipo = teclado.nextInt()) != 4){
            if (Tipo==1) {
                A++;
            }
            else if (Tipo == 2) {
                G++;
            }
            else if (Tipo == 3) {
                D++;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + A);
        System.out.println("Gasolina: " + G);
        System.out.println("Diesel: " + D);
    }
}