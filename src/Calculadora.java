class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return (double) a / b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double raizCuadrada(double a) {
        return Math.sqrt(a);
    }

    public double seno(double a) {
        return Math.sin(a);
    }

    public double coseno(double a) {
        return Math.cos(a);
    }

    public double tangente(double a) {
        return Math.tan(a);
    }
}
