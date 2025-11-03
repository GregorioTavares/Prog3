package exercicio2;

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
}
