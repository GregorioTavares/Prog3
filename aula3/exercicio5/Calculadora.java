package exercicio5;

public class Calculadora {
    //metodos

    static int somar(int v1, int v2){
        System.out.println(v1 + v2);
        return v1 + v2;
    }

    static int somar(int v1, int v2, int v3){
        System.out.println(v1 + v2 + v3);
        return v1 + v2 + v3;
    }

    static double somar(double v1, double v2){
        System.out.println(v1 + v2);
        return v1 + v2;
    }

    public static void main(String[] args) {
        Calculadora.somar(10, 20);
        Calculadora.somar(10.0, 20.0);
        Calculadora.somar(10, 20, 30);
    }
}
