import java.util.Scanner;

public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int N, M;
        N = teclado.nextInt();

        for (int i=1 ; i <= N ; i++) {
            M = teclado.nextInt();
            if ((M > 0) && (M % 2 == 0)){
                System.out.println ("EVEN POSITIVE");
            } 
            else if (M> 0){
                System.out.println ("ODD POSITIVE");
            }
            else if ((M< 0) && (M %2 ==0)){
                System.out.println("EVEN NEGATIVE");
            }
            else if (M <0){
                System.out.println("ODD NEGATIVE");
            }
            else System.out.println("NULL");

            

        }

    }
}