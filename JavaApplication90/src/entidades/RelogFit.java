
package entidades;

import java.time.LocalDate;


public class RelogFit extends Reloj {
    private int x;
    private int y;
    private int frecuencia;

    public RelogFit(int x, int y, int feecuencia, LocalDate dia, LocalDate hora, String modelo, long nroSerie) {
        super(dia, hora, modelo, nroSerie);
        this.x = x;
        this.y = y;
        this.frecuencia = frecuencia;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "RelogFit{" + "x=" + x + ", y=" + y + ", frecuencia=" + frecuencia + '}';
    }

   public int frecuenciaAleatoria(){
        int Hz;
        return Hz = (int)(Math.random() * 5);  
    }
    }
 
    

