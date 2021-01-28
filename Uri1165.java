import java.util.Scanner;

public class Uri1165{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, X, restozero=0;

        N = teclado.nextInt();

        for (int i=1 ; i <= N ; i++){

            restozero=0;
            X = teclado.nextInt();

            for (int j=1 ; j<= X ; j++){
                if ( (X % j) ==0) {
                    restozero++;
                    //System.out.println("Resto = "+restozero);
                }

            }
            
            
            if ( restozero > 2) {
            System.out.println(X + " nao eh primo");
            }
            else System.out.println(X + " eh primo");
        
        }

    }
}