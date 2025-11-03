package exercicio3;

public class Aluno extends Pessoa{
    private String matricula;
    
    //construtor
    public Aluno(String anome, int aidade, String amatricula){
        super(anome, aidade);
        this.matricula = amatricula;
    }

    @Override
    void mostraInfo(){
        super.mostraInfo();
        System.out.println("Matricula: " + matricula);
        System.out.println();
    }

    //getters
    void getNome(){
        super.getNome();
    }

    void getIdade(){
        super.getIdade();
    }

    void getMatricula(){
        System.out.println(matricula);
    }

    //setters
    void setNome(String anome){
        super.setNome(anome);
    }

    void setIdade(int aidade){
        super.setIdade(aidade);
    }

    void setMatricula(String amatricula){
        this.matricula = amatricula;
    }
}
