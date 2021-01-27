import java.util.Scanner;
public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double Sal, Imposto;
        Sal = teclado.nextDouble();
       


        if (Sal <= 2000.00) {
            System.out.println("Isento");
        }
        else if ((Sal > 2000.00) && (Sal <= 3000.00)) {
            Imposto = ((Sal - 2000.00) * 0.08);
            System.out.printf("R$ %.2f", Imposto);
        }

        else if ((Sal > 3000.00) && (Sal <= 4500.00)) {
            Imposto = ((1000.00 * 0.08) + ((Sal - 3000.00) * 0.18)) ;
            System.out.printf("R$ %.2f", Imposto); 
        }

        else if (Sal > 4500.00) {
            Imposto = ((1000.00 * 0.08) + (1500.00 * 0.18) + ((Sal - 4500.00) * 0.28))  ;
            System.out.printf("R$ %.2f", Imposto); 
        }
      



    }

}