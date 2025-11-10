package exercicio2;

public class Usuario {
    public enum NivelAcesso{BASICO, INTERMEDIARIO, ADMIN};

    //contrutor
    Usuario(String nome1, NivelAcesso nivel1){
        this.nome = nome1;
        this.nivel = nivel1;
    }

    Usuario(){
        this.nome = "";
        this.nivel = NivelAcesso.BASICO;
    }

    //metodos
    public String getNome(){
        return nome;
    }

    public NivelAcesso getNivel(){
        System.out.println("Usuario de nivel " + nivel + " \n");
        return nivel;
    }

    public void setNome(String nome1){
        this.nome = nome1;
    }

    public void setNivel(NivelAcesso nivel){
        this.nivel = nivel;
    }

    //atributos
    private String nome;
    private NivelAcesso nivel;
}
