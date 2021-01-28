import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        
        int valor=0;
        int vp=0;
        Scanner teclado = new Scanner(System.in);

        for (int i =1; i <= 5 ; i++){
            valor = teclado.nextInt();
            if ((valor % 2) == 0) {
                vp++;
            } 
        }
        System.out.println(vp + " valores pares");

    }
}