import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        float valor;
        int qtde=0;
        float media=0;
        Scanner teclado = new Scanner(System.in);
        for (int cont=1; cont <=6; cont ++){
            valor = teclado.nextFloat();
            if (valor >0){
                qtde++;
                media=media + valor;
                // media +=valor;
            }
                       
        }
System.out.println(qtde+ " valores positivos");
System.out.printf("%.1f\n", media/qtde);
    }
}
//leia 6 numeros diferentes de zero que podem ser positivos ou negativos e veja quantos sao positivos