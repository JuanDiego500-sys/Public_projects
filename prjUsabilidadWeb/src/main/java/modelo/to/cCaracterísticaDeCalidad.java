package modelo.to;

import java.util.ArrayList;

public class cCaracterísticaDeCalidad extends cUnidadMedicion {//Beginning of Caracterísitca de calidad
//-------------array creation-----------------------------------
    ArrayList<cComponenteCaracterística> lstComp;
//-------------constructors--------------------------------------

    public cCaracterísticaDeCalidad() {
        lstComp = new ArrayList();
    }

    public cCaracterísticaDeCalidad(String nombreMed, String idUnidad, double valoracion) {
        super(nombreMed, idUnidad, valoracion);
        lstComp = new ArrayList();
    }

    
    public cCaracterísticaDeCalidad(ArrayList<cComponenteCaracterística> lstComp, String idUnidad) {
        super(idUnidad);
        this.lstComp = lstComp;
    }

    public cCaracterísticaDeCalidad(ArrayList<cComponenteCaracterística> lstComp) {
        this.lstComp = lstComp;
    }

    public cCaracterísticaDeCalidad(ArrayList<cComponenteCaracterística> lstComp, String nombreMed, String idUnidad, double valoracion) {
        super(nombreMed, idUnidad, valoracion);
        this.lstComp = lstComp;
    }

    public cCaracterísticaDeCalidad(ArrayList<cComponenteCaracterística> lstComp, String nombreMed, double valoracion) {
        super(nombreMed, valoracion);
        this.lstComp = lstComp;
    }




    
//--------------setters and getters--------------------------------
    public ArrayList<cComponenteCaracterística> getLstComp() {
        return lstComp;
    }

    public void setLstComp(ArrayList<cComponenteCaracterística> lstComp) {
        this.lstComp = lstComp;
    }
//--------------to string--------------------------------------------
    @Override
    public String toString() {
        return "cCaracter\u00edsticaDeCalidad{" + "lstComp=" + lstComp + '}';
    }

//--------------CRUD AND METHODS------------------------------------------------
    //---------------Search--------------------------------------------
    public int buscarComp(String compBus) {//inicio del método buscar
        int pos = 0;
        while ((pos < getLstComp().size()) && (!getLstComp().get(pos).idUnidad.equals(compBus))) {
            pos++;
        }
        if (pos >= lstComp.size()) {//si la posicion es mayor de cada posicion de la lista empleados , nos va a decir que no existe
            pos = -1;//no existe
        }
        return pos;

    }//fin del método buscar
    //---------------create and insert---------------------------------------
    public boolean insertarComp(cComponenteCaracterística nCar) {//inicio del método insertar
        boolean exito = false;
        int pos = buscarComp(nCar.getIdUnidad());//falta corregirlo ya que me debe buscar es un id de la empresa
        if (pos == -1) {
            getLstComp().add(nCar);
            exito = true;
        }
        return exito;
    }//fin del método insertar empresa
    //----------------update---------------------------------------------------
    public boolean modificarComp(cComponenteCaracterística nCar) {//inicio de modificar empresa
        boolean exito = false;
        int pos = buscarComp(nCar.getIdUnidad());//recordar que se tiene que buscar otra cosa distinta en el método
        if (pos != -1) {
            getLstComp().set(pos, nCar);
            exito = true;
        }
        return exito;
    }//fin de modificar empresa
    //----------------------delete---------------------------------------------
    public boolean eliminarComp(String idString) {//inicio de eliminar componente
        boolean exito = false;
        int pos = buscarComp(idString);
        if (pos != -1) {
            getLstComp().remove(pos);
            System.gc();
            exito = true;
        }
        return exito;
    }//fin de eliminar componente
//-----------------------------------------------------------------------------
}//end of caracterísitca de calidad
