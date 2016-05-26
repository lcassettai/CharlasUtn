package Modelo;

public class ReporteDos {

    private int codigo;
    private String titulo;
    private String orador;
    private int minutosExceso;

    public ReporteDos(int codigo, String titulo, String orador, int diferencia) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.orador = orador;
        this.minutosExceso = diferencia;
    }

    public ReporteDos() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getOrador() {
        return orador;
    }

    public void setOrador(String orador) {
        this.orador = orador;
    }

    public int getExceso() {
        return minutosExceso;
    }

    public void setExceso(int diferencia) {
        this.minutosExceso = diferencia;
    }

}
