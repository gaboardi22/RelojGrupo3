
package entidades;

public class JavaApplication90 {

 
    public static void main(String[] args) {
     Reloj reloj = new Reloj("modelo1", 23132133);
        System.out.println(reloj.getDia());
        reloj.incrementarDia();
        System.out.println(reloj.getHora());
        reloj.IncrementarHora();
    }
    
}
