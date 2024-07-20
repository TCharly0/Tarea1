class CalculadoraAvanzada extends Calculadora {
    public double logaritmo(double a) {
        return Math.log(a);
    }

    public double logaritmoBase10(double a) {
        return Math.log10(a);
    }
}

public class Extension {
    public static void main(String[] args) {
        CalculadoraAvanzada calc = new CalculadoraAvanzada();

        System.out.println("Suma: " + calc.sumar(5, 3));
        System.out.println("Resta: " + calc.restar(5, 3));
        System.out.println("Multiplicación: " + calc.multiplicar(5, 3));
        System.out.println("División: " + calc.dividir(5, 3));
        System.out.println("Módulo: " + calc.modulo(5, 3));
        System.out.println("Potencia: " + calc.potencia(2, 3));
        System.out.println("Raíz Cuadrada: " + calc.raizCuadrada(16));
        System.out.println("Seno: " + calc.seno(Math.PI / 2));
        System.out.println("Coseno: " + calc.coseno(0));
        System.out.println("Tangente: " + calc.tangente(Math.PI / 4));

    }
}

