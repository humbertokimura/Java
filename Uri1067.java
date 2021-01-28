import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){
        
        int valor=0, max=1000;
        int impar=1;

        Scanner teclado = new Scanner(System.in);
        valor = teclado.nextInt();

        while ((impar <= max) && (valor >0) && (impar <=valor)){
            System.out.println(impar);    
            impar +=2;
        }
    }
}