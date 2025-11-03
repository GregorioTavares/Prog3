package exercicio1;

public class Livro {
    //atributos
    private String titulo;
    private String autor;

    //construtores
    public Livro(){}

    public Livro(String umtitulo, String umautor){
        this.titulo = umtitulo;
        this.autor = umautor;        
    }

    void mostraInfo(){
        System.out.println("Informações: ");
        System.out.println(titulo);
        System.out.println(autor);
    }

}
