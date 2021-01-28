import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        
        int valor=0, max=1000;
        int impar=1;

        Scanner teclado = new Scanner(System.in);
        valor = teclado.nextInt();

        while (impar < valor){
               
            impar +=2;
        }

        for (int i=1 ; i <= 6 ; i++) {
            System.out.println(impar);
            impar +=2;
        }
    }
}