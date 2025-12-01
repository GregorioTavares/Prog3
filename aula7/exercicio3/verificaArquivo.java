package exercicio3;

import java.io.File;
import java.util.Scanner;

public class verificaArquivo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o caminho de um arquivo ou diretorio:");
        String caminho = scan.nextLine();

        File arquivo = new File(caminho);

        //verifica existencia
        if (!arquivo.exists()) {
            System.out.println("O arquivo/diretório NAO existe");
        } else {
            System.out.println("O arquivo/diretório existe");

            //verificando se eh arquivo ou diretorio
            if (arquivo.isFile()) {
                System.out.println("Eh um arquivo");
                System.out.println("Tamanho: " + arquivo.length() + " bytes");
            } else if (arquivo.isDirectory()) {
                System.out.println("Eh um diretorio");
            }

            //caminho absoluto do arquivo
            System.out.println("Caminho absoluto: " + arquivo.getAbsolutePath());
        }

        scan.close();
    }
}
