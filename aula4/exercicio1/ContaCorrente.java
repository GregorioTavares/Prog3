package exercicio1;

public class ContaCorrente extends ContaBancaria{
    //contrutor
    ContaCorrente(int numero1, String nome1){
        super(numero1, nome1);
    }

    //metodos
    @Override
    public boolean sacar(double valor){
        if (this.saldo < valor + 1){ //taxa de saque de 1 real
            return false;
        } else {
            this.saldo = this.saldo - valor - 1;
            return true;
        }
    }

    @Override
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public double getSaldo(){
        System.out.println(saldo + "\n");
        return saldo;
    }
}
