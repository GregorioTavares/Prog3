package exercicio2;

public class Contador {
    Contador(){
        totalObjetos++;
    }

    //atributos
    static int totalObjetos = 0;


    //métodos
    static void mostrarTotal(){
        System.out.println("contador: " + totalObjetos + "\n");
        return;
    }

    public static void main(String[] args){
        Contador c1 = new Contador(); 
        Contador c2 = new Contador(); 
        Contador c3 = new Contador(); 
        Contador c4 = new Contador(); 
        Contador c5 = new Contador(); 

        Contador.mostrarTotal();
        return;
    }
}
