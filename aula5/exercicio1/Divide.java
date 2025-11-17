package exercicio1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Divide {
    public static int quociente(int numerador, int denominador)
        throws ArithmeticException
    {
        return numerador/denominador;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean continueL = true;

        do {
            try {
                System.out.println("Informe um inteiro numerador: ");
                int numerador = scanner.nextInt();

                System.out.println("Informe um inteiro denominador: ");
                int denominador = scanner.nextInt();

                int result = quociente(numerador, denominador);
                System.out.printf("Resultado: %d / %d = %d \n", numerador, denominador, result);
                continueL = false;
            }
            catch (InputMismatchException inputMismatchException){
                System.err.printf("Excessão: %s\n", inputMismatchException);
                scanner.nextLine();
                System.out.println("Insira valores inteiros \n");
            }
            catch(ArithmeticException arithmeticException){
                System.err.printf("Excessão: %s\n", arithmeticException);
                System.out.printf("Denominador invalido, informe outro \n");

            }
        } while (continueL);
        scanner.close();
    }
}
