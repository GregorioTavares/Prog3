package Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int atual = 1;
        int ant = 1;

        //mostrando os dois primeiros valoresS
        System.out.println(ant);
        System.out.println(atual);

        for (int i = 0; i < 28; i++){
            System.out.println(atual + ant);
            int temp = ant;
            ant = atual;
            atual = atual + temp;
        }
    }
}
