package exercicio1;

public class Main {
    public static void main(String[] args){
        ContaCorrente conta1 = new ContaCorrente(12, "Pedro de Oliveira");
        ContaPoupanca conta2 = new ContaPoupanca(13, "João Paulo" );

        conta1.depositar(150);
        conta2.depositar(200);
        conta1.getSaldo();
        conta2.getSaldo();
        
        conta1.sacar(100);
        conta2.sacar(100);

        conta1.getSaldo();
        conta2.getSaldo();
    }
}
