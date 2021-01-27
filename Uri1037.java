import java.util.Scanner;
public class Uri1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float Num;
        Num = teclado.nextFloat();

       

        if ((Num >= 0) && (Num <= 25.0000)) {
            System.out.println("Intervalo [0,25]");
        }

        else if ((Num <= 50.0000000) && (Num >0)) {
            System.out.println("Intervalo (25,50]");
        }

        else if ((Num <= 75.0000000) && Num >0){
            System.out.println("Intervalo (50,75]");
        }
        
        else if ((Num <= 100.0000000) && Num >0){
            System.out.println("Intervalo (75,100]");
        }

        else {
            System.out.println("Fora de intervalo");
        }

    }

}