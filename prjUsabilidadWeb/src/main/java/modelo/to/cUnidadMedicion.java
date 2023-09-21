package modelo.to;

public class cUnidadMedicion {//inicio de super clase
    //-------------definition-----------

    String nombreMed, idUnidad;
    double valoracion;

    //-------------constructors--------------
    public cUnidadMedicion(String idUnidad) {
        this.idUnidad = idUnidad;
    }

    public cUnidadMedicion() {
    }

    public cUnidadMedicion(String nombreMed, String idUnidad, double valoracion) {
        this.nombreMed = nombreMed;
        this.idUnidad = idUnidad;
        this.valoracion = valoracion;
    }

    
    
    public cUnidadMedicion(String nombreMed, double valoracion) {
        this.nombreMed = nombreMed;
        this.valoracion = valoracion;
    }

    //------------setters and getters-----------
    public String getNombreMed() {
        return nombreMed;
    }

    public String getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(String idUnidad) {
        this.idUnidad = idUnidad;
    }

    public void setNombreMed(String nombreMed) {
        this.nombreMed = nombreMed;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    //---------to string------------------------
    @Override
    public String toString() {
        return "cUnidadMedicion{" + "nombreMed=" + nombreMed + ", valoracion=" + valoracion + '}';
    }

}//fin de superclass

