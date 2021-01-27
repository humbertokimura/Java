import java.util.Scanner;
/*
Se B for maior que C e se D for maior que A e a soma de C com D for maior que a Soma de A e B e se C e D, ambos foresm positivos e
se a variavel A for par
*/

public class Uri1035{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, C, D;
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        // --1--
        if ( B>C  && D>A && C+D > A + B && C>=0 && D >= 0 &&  A %2 == 0) {
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores nao aceitos");
        }
        
        
        


    }


}