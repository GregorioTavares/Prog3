package exercicio3;
import java.util.Scanner;

public class Converte {
    //metodo
    public static int converter() throws NumberFormatException{
        Scanner scanner = new Scanner(System.in);

        while(true){
            try{
                System.out.println("Informe uma String a ser convertida em Int");
                String texto = scanner.nextLine();
                int conversao = Integer.parseInt(texto);
                return conversao;
            }
            catch(NumberFormatException n){
                n.printStackTrace();
                System.err.printf("Informe uma string valida\n\n\n");
            }
        }
    }
}
