import java.util.Scanner;

public class Uri1115{
    public static void main (String args []){
        int X, Y, F;
        Scanner teclado = new Scanner(System.in);

      
        
        do {

        X = teclado.nextInt();
        Y = teclado.nextInt();
        

        if ((X==0) || (Y==0)){
                F=0;
        }
        else F=1; 

        if ((X>0) && (Y>0)){
            System.out.println("primeiro");
        }
        else if ((X>0) && (Y<0)){
            System.out.println("quarto");
        }
        else if ((X<0) && (Y>0)){
            System.out.println("segundo");
        }
        else if ((X<0) && (Y<0)){
            System.out.println("terceiro");
        }
             

        } while (F==1) ;      
    }
}