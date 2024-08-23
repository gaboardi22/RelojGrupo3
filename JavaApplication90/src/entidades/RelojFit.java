
package entidades;

public class RelojFit extends Reloj {
    private int x;
    private int y;
    private int frecuencia;

    public RelojFit(int x, int y, int frecuencia, String modelo, long nroSerie) {
        super(modelo, nroSerie);
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
        return Hz = (int)(Math.random() *60 + 60);  
    }
   public int distanciaRecorrida(int a, int b){
       System.out.println("DISTANCIA RECORRIDA POR LA PERSONA");
       int pasos =(int) Math.sqrt(Math.pow(a - x, 2 )+Math.pow(b - y, 2 ));
       return pasos;
   }
    }
 
    

