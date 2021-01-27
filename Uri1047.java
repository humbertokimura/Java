import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int H1, H2, M1, M2, DurH, DurM;
        H1 = teclado.nextInt();
        M1 = teclado.nextInt();

        H2 = teclado.nextInt();
        M2 = teclado.nextInt();

        DurH=0;
        DurM=0;

        if ((H2 == H1) && (M2 > M1)) {
            DurH = H2 - H1;
            DurM = M2 - M1;
        }
        else if ((H2 == H1) && (M2 < M1)) {
            DurH = 23;
            DurM = 60 - (M1 - M2);
        }

        else if ((H2 > H1) && (M2 >= M1)) {
            DurH = H2 - H1;
            DurM = M2 - M1;
        }

        else if ((H2 > H1) && (M2 < M1)) {
            DurH = (H2 - H1) -1 ;
            DurM = 60 - (M1 - M2);
        }

        else if ((H2 < H1) && (M2 >= M1)){
            DurH = 24 - (H1 - H2);
            DurM = M2 - M1;
        }

        else if ((H2 < H1) && (M2 < M1)){
            DurH = 24 - (H1 - H2) -1;
            DurM = 60 - (M1 - M2);
        }
        else {
            DurH = 24;
            DurM = 0;
        }
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", DurH, DurM);
        

        

    }

}