package exercicio2;
import java.util.Scanner;
import java.lang.IllegalArgumentException;

public class Raiz {
    public static double calcularRaiz(double valor) 
        throws IllegalArgumentException
    {
        if (valor < 0){
            throw new IllegalArgumentException("Valor nao pode ser negativo");
        }
        double raiz = Math.sqrt(valor);
        return raiz;   
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean continueL = true;

        do {
            try{
               System.out.println("Informe um valor para ser tirado a raiz: ");
               double valor = scanner.nextDouble();
               
               double raiz = calcularRaiz(valor);
               System.out.printf("Raiz de %f = %f\n", valor, raiz);
               continueL = false;
            }
            catch(IllegalArgumentException e){
                e.printStackTrace();
                System.out.printf("Erro, insira um valor valido\n");
            }

        } while(continueL);
        scanner.close();
    }
}
