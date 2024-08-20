
package entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Reloj {
    private LocalDate dia;
    private LocalDateTime hora;
    private String modelo;
    private long nroSerie;

    public Reloj( String modelo, long nroSerie) {
        this.dia = LocalDate.now();
        this.hora = LocalDateTime.now();
        this.modelo = modelo;
        this.nroSerie = nroSerie;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
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
        LocalDate diaIncrementado = dia.plusDays(1);
        System.out.println(diaIncrementado);
    }
}
