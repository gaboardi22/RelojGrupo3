
package entidades;

public class JavaApplication90 {

 
    public static void main(String[] args) {
     Reloj reloj = new Reloj("modelo1", 23132133);
     Persona persona1 = new Persona("pablo", "gaboardi", 42, 1.70);
     persona1.decirHora(reloj);
        System.out.println(reloj.getDia());
        reloj.incrementarDia();
        System.out.println(reloj.getHora());
        reloj.IncrementarHora();
    }
    
}
