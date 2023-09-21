package modelo.to;


public class cElementos extends cUnidadMedicion {//beginning of cElementos
//----------------constructors---------------------
    public cElementos() {
    }

    public cElementos(String idUnidad) {
        super(idUnidad);
    }

    public cElementos(String nombreMed, String idUnidad, double valoracion) {
        super(nombreMed, idUnidad, valoracion);
    }

    public cElementos(String nombreMed, double valoracion) {
        super(nombreMed, valoracion);
    }
    

//-------------to string------------------------
    @Override
    public String toString() {
        return "{" + super.toString() + '}';
    }

}//end of cElementos
