public class Operacion {

    int suma;
    int resta;
    int multiplicacion;
    double division;




    public void sumar(int num1, int num2) {
        suma = num1 + num2;


    }

    public void restar(int num1, int num2) {

        resta = num1 - num2;

    }

    public void multiplicar(int num1, int num2) {

        multiplicacion = num1 * num2;

    }

    public void dividir(double num1, double num2) {

        division = num1 / num2;

    }

    public void mostrarResultados() {
        System.out.println("La suma es : " + suma);
        System.out.println("La resta es : " + resta);
        System.out.println("La multiplicacion es : " + multiplicacion);
        System.out.println("La division es : " + division);

    }


}

