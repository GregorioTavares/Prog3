package exercicio6;

public class ContaBancaria {
    //atributo
    private int numero;

    //construtor
    ContaBancaria(int anumero){
        this.numero = anumero;
    }

    //get
    int getNumero(){
        return numero;
    }

    @Override
    public boolean equals(Object objeto){
        if (objeto == null){
            return false;
        } else if (objeto.getClass() != this.getClass()){
            return false;
        } else if (((ContaBancaria) objeto).getNumero() != this.getNumero()){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString(){
        return ("Numero da Conta Bancaria: " + this.numero);
    }

    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(12345);
        ContaBancaria c2 = new ContaBancaria(12345);

        if (c1.equals(c2) == true){
            System.out.println("Iguais");
        }

        System.out.println(c1.toString());    
        System.out.println(c2.toString());  
    }
}
