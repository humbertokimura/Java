import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int H1, H2, Dur;
        H1 = teclado.nextInt();
        H2 = teclado.nextInt();
        

        if (H2 > H1){
            Dur = H2 - H1;
        }
        else Dur = 24 - H1 + H2;

            System.out.printf("O JOGO DUROU %d HORA(S)\n", Dur);
        

        

    }

}