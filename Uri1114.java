import java.util.Scanner;

public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        int Senha=2002, S;

        S = teclado.nextInt();

        while (S != Senha) {
            System.out.println("Senha Invalida");
            S = teclado.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}