
package Ejercicio;

public class main {
    public static void main (String [] args){
        RaulEjercicio objeto = new Ejercicio ();
        RaulEjercicio objeto2= new Ejercicio ("Juliana",18);
        System.out.println("mi edad es "+objeto.getedad());
        System.out.println("mi nombre es "+objeto2.getNombre());
    }
}
