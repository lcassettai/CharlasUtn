
package Modelo;


public class ReporteCuatro {
    private String tematica;
    private int cantCharlas;
    private int cantAsistentes;
    private int tiempoPromedio;

    public ReporteCuatro(String tematica, int cantCharlas, int cantAsistentes, int tiempoPromedio) {
        this.tematica = tematica;
        this.cantCharlas = cantCharlas;
        this.cantAsistentes = cantAsistentes;
        this.tiempoPromedio = tiempoPromedio;
    }

    public ReporteCuatro() {
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public int getCantCharlas() {
        return cantCharlas;
    }

    public void setCantCharlas(int cantCharlas) {
        this.cantCharlas = cantCharlas;
    }

    public int getCantAsistentes() {
        return cantAsistentes;
    }

    public void setCantAsistentes(int cantAsistentes) {
        this.cantAsistentes = cantAsistentes;
    }

    public int getTiempoPromedio() {
        return tiempoPromedio;
    }

    public void setTiempoPromedio(int tiempoPromedio) {
        this.tiempoPromedio = tiempoPromedio;
    }
    
    
}
