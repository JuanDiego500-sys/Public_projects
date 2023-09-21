package modelo.to;

import java.util.ArrayList;//importar array list

public class cComponenteCaracterística extends cUnidadMedicion {//beginning of cComponenteCaracterística
//-------------------------creation of array--------------
    ArrayList<cElementos> lstElementos;
//-------------------------creators-----------------------
 
    public cComponenteCaracterística(String nombreMed, String idUnidad, double valoracion) {
        super(nombreMed, idUnidad, valoracion);
        lstElementos = new ArrayList();
    }

    public cComponenteCaracterística(String nombreMed, double valoracion) {
        super(nombreMed, valoracion);
        lstElementos = new ArrayList();
    }
    
    
    public cComponenteCaracterística() {
        lstElementos = new ArrayList();//creation of array lst
    }
//-------------------setters and getters-------------------------------

    public cComponenteCaracterística(ArrayList<cElementos> lstElementos, String idUnidad) {
        super(idUnidad);
        this.lstElementos = lstElementos;
    }

    public cComponenteCaracterística(ArrayList<cElementos> lstElementos) {
        this.lstElementos = lstElementos;
    }

    public cComponenteCaracterística(ArrayList<cElementos> lstElementos, String nombreMed, String idUnidad, double valoracion) {
        super(nombreMed, idUnidad, valoracion);
        this.lstElementos = lstElementos;
    }

    public cComponenteCaracterística(ArrayList<cElementos> lstElementos, String nombreMed, double valoracion) {
        super(nombreMed, valoracion);
        this.lstElementos = lstElementos;
    }


    public ArrayList<cElementos> getLstElementos() {
        return lstElementos;
    }

    public void setLstElementos(ArrayList<cElementos> lstElementos) {
        this.lstElementos = lstElementos;
    }
//---------------------to string-----------------------------------------
    @Override
    public String toString() {
        return "cComponenteCaracter\u00edstica{" + "lstElementos=" + lstElementos + '}';
    }

//----------------------------methods and CRUD---------------------------------------------------
    //-----------------------SEARCH-------------------------------------------------------------
    public int buscarElem(String compBus) {//inicio del método buscar comp
        int pos = 0;
        while ((pos < getLstElementos().size()) && (!getLstElementos().get(pos).idUnidad.equals(compBus))) {
            pos++;
        }
        if (pos >= lstElementos.size()) {//si la posicion es mayor de cada posicion de la lista empleados , nos va a decir que no existe
            pos = -1;//no existe
        }
        return pos;

    }//fin del método buscar comp
    //------------------------INSERT AND CREATE----------------------------------------------
    public boolean insertarElem(cElementos nComp) {//inicio del método insertar
        boolean exito = false;
        int pos = buscarElem(nComp.getIdUnidad());
        if (pos == -1) {
            getLstElementos().add(nComp);
            exito = true;
        }
        return exito;
    }//fin del método insertar componente
    //---------------------------UPDATE------------------------------------------------------
    public boolean modificarElem(cElementos nComp) {//inicio de modificar componente
        boolean exito = false;
        int pos = buscarElem(nComp.getIdUnidad());//recordar que se tiene que buscar otra cosa distinta en el método
        if (pos != -1) {
            getLstElementos().set(pos, nComp);
            exito = true;
        }
        return exito;
    }//fin de modificar componente
    //----------------------DELETE---------------------------------------------------------
    public boolean eliminarElem(String idString) {//inicio de eliminar componente
        boolean exito = false;
        int pos = buscarElem(idString);
        if (pos != -1) {
            getLstElementos().remove(pos);
            System.gc();
            exito = true;
        }
        return exito;
        
    }//fin de eliminar componente
    
  

}//end of cComponente característica
