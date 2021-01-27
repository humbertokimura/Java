import java.util.Scanner;
public class Consumo{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X;
        float Y;
        float consumo;

        System.out.println("Por favor, digite a distância");
        X = teclado.nextInt();

        System.out.println("Por favor, digite o gasto em litros");
        Y = teclado.nextFloat();

        consumo = X/Y;

        System.out.printf("%.3f km/l\n", consumo);


    }
}