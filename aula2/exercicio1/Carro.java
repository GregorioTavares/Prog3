package exercicio1;

public class Carro {
    //atributos
    String marca;
    String modelo;
    int ano;

    //método
    void exibirInfo(){
        System.out.println(this.marca + "\n");
        System.out.println(this.modelo + "\n");
        System.out.println(this.ano + "\n");
        System.out.println("\n");
        return;
    }

    public static void main(String[] args){
        Carro carro1 = new Carro();
        carro1.marca = "toyota";
        carro1.modelo = "prius";
        carro1.ano = 2020;

        Carro carro2 = new Carro();
        carro2.marca = "fiat";
        carro2.modelo = "uno";
        carro2.ano = 2010;

        carro1.exibirInfo();
        carro2.exibirInfo();
    }
}
