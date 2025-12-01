package exercicio1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.InputStream;

public class ex1 {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Informe o nome de um arquivo:");
            String arquivo = scan.nextLine();

            try (InputStream is = new FileInputStream(arquivo);
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr)) {

                String linha;
                System.out.println("\nConteudo do arquivo:\n");

                while ((linha = br.readLine()) != null) {
                    System.out.println(linha);
                }

            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            }
        }
    }
}