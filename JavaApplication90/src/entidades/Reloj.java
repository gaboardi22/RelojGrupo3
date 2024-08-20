
package entidades;

import java.time.LocalDate;


public class Reloj {
    private LocalDate dia;
    private LocalDate hora;
    private String modelo;
    private long nroSerie;

    public Reloj(LocalDate dia, LocalDate hora, String modelo, long nroSerie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.nroSerie = nroSerie;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalDate getHora() {
        return hora;
    }

    public void setHora(LocalDate hora) {
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
        
    }
}
