package trabalho;

import java.time.LocalTime; // API

public abstract class Horario {
    
    //metodo que retorna a hora atual
    public static int retornaHora(){
        LocalTime tempoAtual = LocalTime.now();
        int hora = tempoAtual.getHour(); //Pega somente a hora
        return hora;
    }

    //metodo que retorna minuto atual
    public static int retornaMinuto(){
        LocalTime tempoAtual = LocalTime.now();
        int minuto = tempoAtual.getMinute();
        return minuto;
    }
}
