package exercicio2;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.IOException;
import java.util.Scanner;

public class scan {
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in);
            PrintStream ps = new PrintStream(new FileOutputStream("saida.txt", true))) {

            System.out.println("Informe linhas a serem adicionadas ao arquivo, digite FIM para encerrar o programa.");

            while (true) {
                String linha = s.nextLine();

                if (linha.equalsIgnoreCase("FIM")) {
                    break;
                }

                ps.println(linha);
            }

            System.out.println("Texto gravado");

        } catch (IOException e) {
            System.out.println("Erro no arquivo: " + e.getMessage());
        }
    }
}
