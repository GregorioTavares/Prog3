package exercicio3;

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

    //getters 
    void getNome(){
        System.out.println(nome);
    }
    void getIdade(){
        System.out.println(idade);
    }

    //setters
    void setNome(String anome){
        this.nome = anome;        
    }

    void setIdade(int aidade){
        this.idade = aidade;
    }
}
