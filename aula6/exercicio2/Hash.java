package exercicio2;
import java.util.HashSet;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe diversas palavras (digite 'fim' para finalizar");

        HashSet<String> set = new HashSet<>();

        while (true){
            String palavra = scanner.nextLine();
            if (palavra.equals("fim")){
                break;
            } else {
                set.add(palavra);
            }
        }
        scanner.close();

        System.out.println("Palavras digitadas: ");
        for (String p : set){
            System.out.println(p);
        }


        if (set.contains("Java")){
            System.out.println("Possui a palavra Java");
        } else {
            System.out.println("Não possui a palavra Java");
        }
    }
}
