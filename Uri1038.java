import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codigo, qtde;
        float total;
        codigo = teclado.nextInt();
        qtde = teclado.nextInt();

        if (codigo == 1){ // teste se codigo vale 1
            total = qtde * 4.00f;
         
        }
        else { // pode ser 3, 4 ou 5 vou selecionar um deles }
            if (codigo == 2){
                total = qtde * 4.50f;
            }
            else{
                if (codigo == 3){
                    total = qtde * 5.00f;
                }
                else {
                    if (codigo == 4){
                        total = qtde * 2.00f;
                    }
                    else{
                        if (codigo ==5){
                            total = qtde*1.5f;
                        }
                        else total = 0;
                     
                    }
           
                }
      
        
            }
        
        }
        System.out.printf("Total: R$ %.2f\n",total);     
    
    }

}