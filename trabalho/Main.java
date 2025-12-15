package trabalho;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Onibus onibus1 = new Onibus();
        Metro metro1 = new Metro();
        Taxi taxi1 = new Taxi();
        Trem trem1 = new Trem();
        Bicicleta bicicleta1 = new Bicicleta();
        Patinete patinete1 = new Patinete();
        Aviao aviao1 = new Aviao();

        
        ArrayList<Transporte> lista = new ArrayList<>();
        //adicionando objetos na lista
        lista.add(onibus1);
        lista.add(metro1);
        lista.add(taxi1);
        lista.add(trem1);
        lista.add(bicicleta1);
        lista.add(patinete1);
        lista.add(aviao1);

        for(Transporte t : lista){
            t.calcularTarifa();
        }

        return;
    }
}
