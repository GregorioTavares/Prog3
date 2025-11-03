package exercicio3;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Jorge amado", 17, "1231723");
        aluno1.getNome();
        aluno1.getIdade();
        aluno1.getMatricula();

        aluno1.setIdade(20);
        aluno1.setNome("Gabriel");
        aluno1.setMatricula("44444444");

        System.out.println("Dados atualizadaos:");

        aluno1.getNome();
        aluno1.getIdade();
        aluno1.getMatricula();
    }
}
