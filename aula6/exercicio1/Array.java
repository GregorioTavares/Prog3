package exercicio1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Array {
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int j = 0;
        System.out.println("Informe 10 valores inteiros: ");
        
        while (j < 10){
            int valor = scanner.nextInt();
            lista.add(valor);
            j++;
        }
        scanner.close();

        Iterator<Integer> i = lista.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        // soma dos valores
        int soma = 0;

        for (int n : lista){
            soma = soma + n;
        }

        System.out.printf("Soma dos numeros: %d\n", soma);
        
        float media = (float) soma / 10f;

        System.out.printf("Media dos numeros: %f\n", media);

        lista.removeIf(n -> n % 2 == 0);


        System.out.println("Nova Lista: ");
        i = lista.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
