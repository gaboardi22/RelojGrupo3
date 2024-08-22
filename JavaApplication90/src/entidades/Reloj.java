
package entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class Reloj {
    private LocalDate dia;
    private LocalTime hora;
    private String modelo;
    private long nroSerie;

    public Reloj( String modelo, long nroSerie) {
        this.dia = LocalDate.now();
        this.hora = LocalTime.now();
        this.modelo = modelo;
        this.nroSerie = nroSerie;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(long nroSerie) {
        this.nroSerie = nroSerie;
    }

    @Override
    public String toString() {
        return "Reloj{" + "dia=" + dia + ", hora=" + hora + ", modelo=" + modelo + ", nroSerie=" + nroSerie + '}';
    }
    
    public void incrementarDia(){
        System.out.println("INCREMENTO EN UNA UNIDAD DEL DIA");
        LocalDate diaIncrementado = dia.plusDays(1);
        System.out.println(diaIncrementado);
    }
    public void incrementarHora(){
        System.out.println(" INCREMENTO EN UNA UNIDAD DE LA  HORA");
        LocalTime horaIncrementada = hora.plusHours(1);
         DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(horaIncrementada.format(formatoHora));
    }
    public void limpiarPantalla(){
        System.out.println("PANTALLA LIMPIA");
    }
}
