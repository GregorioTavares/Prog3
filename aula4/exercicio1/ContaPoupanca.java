package exercicio1;

public class ContaPoupanca extends ContaBancaria{
    //contrutor
    ContaPoupanca(int numero1, String nome1){
        super(numero1, nome1);
    }


    //metodos
    @Override
    public boolean sacar(double valor){
        if (this.saldo < valor){ 
            return false;
        } else {
            this.saldo = this.saldo - valor;
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
