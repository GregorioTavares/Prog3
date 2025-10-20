package exercicio3;
import java.util.ArrayList;
import java.util.Iterator;

public class Array {
    public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Carlos");
        lista.add("José");
        lista.add("Marcos");
        lista.add("Júlia");
        lista.add("Ana");

        System.out.println("Lista antes da remoção: \n");
        Iterator<String> i = lista.iterator();
        while (i.hasNext()){
            String nome = i.next();
            System.out.println(nome + "\n");
        }
        System.out.println("\n");

        lista.remove(2);

        System.out.println("Lista após a remoção: \n");
        Iterator<String> iterador = lista.iterator();
        while (iterador.hasNext()){
            String nome1 = iterador.next();
            System.out.println(nome1 + "\n");
        }
        return;
    }
}
