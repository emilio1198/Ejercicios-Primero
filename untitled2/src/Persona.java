public class Persona {

    String nombre;
    int edad;

    //Metodos
    //El metodo constructor siempre se pone Public y al lado el nombre de la Clase
    // EL metodo constructor no lleva el Void los demas metodos puede pero este no

    //Metodo Constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;

    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
