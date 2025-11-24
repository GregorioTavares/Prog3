package exercicio3;
import java.util.HashMap;
import java.util.Scanner;

public class Map {
    public static void main(String[] args){
        HashMap<String, Integer> idades = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.printf("Informe o nome e a idade da pessoa %d: \n", i + 1);
            String nome = scan.nextLine();
            int idade = scan.nextInt();
            scan.nextLine();
            idades.put(nome, idade);
        }

        System.out.println("\nInforme um nome para que a idade seja buscada:");
        String nome = scan.nextLine();
        if (idades.containsKey(nome)) { //verificando existencia
            int idade = idades.get(nome);
            System.out.printf("idade correspondente: %d\n", idade);
        } else {
            System.out.println("nome nao encontrado");
        }

        System.out.println("\nInforme um nome a ser removido: ");
        String nome1 = scan.nextLine();
        if (idades.containsKey(nome1)) { //verificando existencia
            idades.remove(nome1);
            System.out.println("nome removido\n");
        } else {
            System.out.println("nome nao encontrado\n");
        }

        scan.close();

        for (String v : idades.keySet()){
            System.out.println(v);
        }
    }
}
