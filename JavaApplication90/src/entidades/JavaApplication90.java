
package entidades;

public class JavaApplication90 {

 
    public static void main(String[] args) {
     Reloj reloj = new Reloj("modelo1", 23132133);
     Persona persona1 = new Persona("sdds", "scs", 0, 0, reloj);
     persona1.decirHora();
     persona1.getReloj().incrementarHora();
     persona1.getReloj().incrementarDia();
     RelojFit reloj2 = new RelojFit(0, 0, 434, "sdsd", 232323); 
     System.out.println( reloj2.distanciaRecorrida(3, 3));
     System.out.println("FRECUANCIA : " + reloj2.frecuenciaAleatoria()); 
    }
}
