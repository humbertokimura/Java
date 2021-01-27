import java.util.Scanner;
public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float Sal1, Sal2,Reaj;
        int Percent;
        Sal1 = teclado.nextFloat();

       

        if ((Sal1 >= 0) && (Sal1 <= 400.00)) {
            Sal2 = (Sal1 * 1.15f);
            Reaj = Sal2 - Sal1;
            System.out.printf("Novo salario: %.2f\n", Sal2);
            System.out.printf("Reajuste ganho: %.2f\n", Reaj);
            System.out.println("Em percentual: 15 %");
        }

        else if (Sal1 <= 800.00) {
            Sal2 = (Sal1 * 1.12f);
            Reaj = Sal2 - Sal1;
            System.out.printf("Novo salario: %.2f\n", Sal2);
            System.out.printf("Reajuste ganho: %.2f\n", Reaj);
            System.out.println("Em percentual: 12 %");
        }

        else if (Sal1 <= 1200.00){
            Sal2 = (Sal1 * 1.10f);
            Reaj = Sal2 - Sal1;
            System.out.printf("Novo salario: %.2f\n", Sal2);
            System.out.printf("Reajuste ganho: %.2f\n", Reaj);
            System.out.println("Em percentual: 10 %");
        }
        
        else if (Sal1 <= 2000.00){
            Sal2 = (Sal1 * 1.07f);
            Reaj = Sal2 - Sal1;
            System.out.printf("Novo salario: %.2f\n", Sal2);
            System.out.printf("Reajuste ganho: %.2f\n", Reaj);
            System.out.println("Em percentual: 7 %");
        }

        else {
            Sal2 = (Sal1 * 1.04f);
            Reaj = Sal2 - Sal1;
            System.out.printf("Novo salario: %.2f\n", Sal2);
            System.out.printf("Reajuste ganho: %.2f\n", Reaj);
            System.out.println("Em percentual: 4 %");
        }

    }

}