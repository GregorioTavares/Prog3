package exercicio4;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        Cachorro cachorro1 = new Cachorro();
        Gato gato1 = new Gato();
        animais.add(cachorro1);
        animais.add(gato1);
        Animal a = new Animal();

        Iterator<Animal> i = animais.iterator();

        while (i.hasNext()){
            a = (Animal)i.next();
            a.emitirSom();
        }
    }
}
