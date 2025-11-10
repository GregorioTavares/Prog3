package exercicio3;

public class Triatleta implements Ciclista, Corredor, Nadador{
    //construtores
    Triatleta(){}

    //metodos
    public void correr(){
        System.out.println("Está correndo");
    }

    public void nadar(){
        System.out.println("Está nadando");
    }

    public void pedalar(){
        System.out.println("Está pedalando");
    }
}
