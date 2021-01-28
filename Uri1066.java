import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        
        int valor=0;
        int vpar=0, vimpar=0, vpos=0, vneg=0;

        Scanner teclado = new Scanner(System.in);

        for (int i =1; i <= 5 ; i++){
            valor = teclado.nextInt();
            if ((valor % 2) == 0) {
                vpar++;
            } 
            else vimpar++;

            if (valor>0) {
                vpos++;
            }
            else if (valor <0) vneg++;

        }
        System.out.println(vpar + " valor(es) par(es)");
        System.out.println(vimpar + " valor(es) impar(es)");
        System.out.println(vpos + " valor(es) positivo(s)");
        System.out.println(vneg + " valor(es) negativo(s)");
    }
}