package exercicio1;

public class Main {
    public static void main(String[] args){
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("Livro muito massa", "Um cara muito massa");
        livro1.mostraInfo();
        System.out.println();
        livro2.mostraInfo();
    }
}
