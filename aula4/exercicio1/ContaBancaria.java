package exercicio1;

public abstract class ContaBancaria {
    //construtor
    ContaBancaria(int numero1, String nome1){
        this.numero = numero1;
        this.nome = nome1;
        saldo = 0;
    }

    ContaBancaria(){
        this.nome = "";
        this.numero = 0;
        this.saldo = 0;
    }

    //metodos
    public abstract boolean sacar(double valor);

    public abstract void depositar(double valor);

    public String getNome(){
        return nome;
    }

    public int getNumero(){
        return numero;
    }

    //atributos
    private int numero;
    private String nome;
    protected double saldo;
}
