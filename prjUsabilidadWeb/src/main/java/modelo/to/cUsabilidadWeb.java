package modelo.to;

import java.util.ArrayList;

public class cUsabilidadWeb extends cUnidadMedicion {//beginning cUsabilidadWeb
//--------------creation of array------------------
    ArrayList<cCaracterísticaDeCalidad> lstCar;
//-------------constructors-----------------------

    public cUsabilidadWeb() {
        lstCar = new ArrayList();
    }

    public cUsabilidadWeb(String nombreMed, String idUnidad, double valoracion) {
        super(nombreMed, idUnidad, valoracion);
        lstCar = new ArrayList();
    }

    
    
    public cUsabilidadWeb(ArrayList<cCaracterísticaDeCalidad> lstCar, String idUnidad) {
        super(idUnidad);
        this.lstCar = lstCar;
    }

    public cUsabilidadWeb(ArrayList<cCaracterísticaDeCalidad> lstCar) {
        this.lstCar = lstCar;
    }

    public cUsabilidadWeb(ArrayList<cCaracterísticaDeCalidad> lstCar, String nombreMed, String idUnidad, double valoracion) {
        super(nombreMed, idUnidad, valoracion);
        this.lstCar = lstCar;
    }

    public cUsabilidadWeb(ArrayList<cCaracterísticaDeCalidad> lstCar, String nombreMed, double valoracion) {
        super(nombreMed, valoracion);
        this.lstCar = lstCar;
    }

//---------------------setters and getters---------------------
    public ArrayList<cCaracterísticaDeCalidad> getLstCar() {
        return lstCar;
    }

    public void setLstCar(ArrayList<cCaracterísticaDeCalidad> lstCar) {
        this.lstCar = lstCar;
    }

    @Override
    public String toString() {
        return "cUsabilidadWeb{" + "lstCar=" + lstCar + '}';
    }

  
//---------------------------------Methods and CRUD---------------
    //--------------------------SEARCH---------------------------
         public int buscarCar(String carBus) {//inicio del método buscar comp
        int pos = 0;
        while ((pos < getLstCar().size()) && (!getLstCar().get(pos).idUnidad.equals(carBus))) {
            pos++;
        }
        if (pos >= lstCar.size()) {//si la posicion es mayor de cada posicion de la lista empleados , nos va a decir que no existe
            pos = -1;//no existe
        }
        return pos;

    }//fin del método buscar comp
    //-------------------------Create and insert-------------------
    public boolean insertarCar(cCaracterísticaDeCalidad nCar) {//inicio del método insertar
        boolean exito = false;
        int pos = buscarCar(nCar.getIdUnidad());//falta corregirlo ya que me debe buscar es un id de la empresa
        if (pos == -1) {
            getLstCar().add(nCar);
            exito = true;
        }
        return exito;
    }//fin del método insertar componente
    //--------------------------update------------------------------
    public boolean modificarCar(cCaracterísticaDeCalidad nCar) {//inicio de modificar componente
        boolean exito = false;
        int pos = buscarCar(nCar.getIdUnidad());//recordar que se tiene que buscar otra cosa distinta en el método
        if (pos != -1) {
            getLstCar().set(pos, nCar);
            exito = true;
        }
        return exito;
    }//fin de modificar componente
    //--------------------------delete---------------------------------
    public boolean eliminarCar(String idString) {//inicio de eliminar componente
        boolean exito = false;
        int pos = buscarCar(idString);
        if (pos != -1) {
            getLstCar().remove(pos);
            System.gc();
            exito = true;
        }
        return exito;
    }//fin de eliminar componente
}//end of cUsabilidadWeb
