package exercicio2;

public class Pessoa {
    private String nome;
    private int idade;

    //construtor
    public Pessoa(String anome, int aidade){
        this.nome = anome;
        this.idade = aidade;
    }

    void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
