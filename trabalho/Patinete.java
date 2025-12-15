package trabalho;

public class Patinete extends Transporte{
    
    //construtor
    Patinete(){};


    //metodo
    @Override
    public double calcularTarifa(){

        double tarifa = 1.50;
        double tarifaFinal;
        double aumento = 1; //sem aumento

        int horario = Horario.retornaHora();

        if (horario >= 17 && horario < 22){ //horario de pico
            aumento = 1.25;
        }

        tarifaFinal = tarifa * aumento; //25% de aumento

        System.out.println(String.format("Tarifa Patinete: R$ %.2f", tarifaFinal));
        
        return tarifaFinal;
    }
}
