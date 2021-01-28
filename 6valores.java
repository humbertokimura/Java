import java.util.Scanner;

public class Valores{
    public static void main(String args[]){
        float valor;
        int qtde=0;
        Scanner teclado = new Scanner(System.in);
        for (int cont=1; cont <=6; cont ++){
            valor = teclado.nextFloat();
            if (valor >0){
                qtde++;
            }
            System.out.println(qtde+ "positivo(s)");
            
        }

    }
}
//leia 6 numeros diferentes de zero que podem ser positivos ou negativos e veja quantos sao positivos