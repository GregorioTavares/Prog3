package exercicio2;

import exercicio2.Usuario.NivelAcesso;

public class Main {
    public static void main(String[] args){
        Usuario usuario1 = new Usuario("Pedro", NivelAcesso.BASICO);
        Usuario usuario2 = new Usuario("Jorge", NivelAcesso.INTERMEDIARIO);
        Usuario usuario3 = new Usuario("Carlos", NivelAcesso.ADMIN);

        usuario1.getNivel();
        usuario2.getNivel();
        usuario3.getNivel();
    }
}
