package modelo.to;

public class cEmpresa {//Beginning of class cEmpresa
//---------------------definition----------------
    String repLegal, telefono, direccion, nombreEmpre;
    cSitioWeb SitioEmpresa,SitioEmpresa2;
//--------------------constructors---------------
    public cEmpresa() {
    }

    public cEmpresa(cSitioWeb SitioEmpresa, cSitioWeb SitioEmpresa2) {
        this.SitioEmpresa = SitioEmpresa;
        this.SitioEmpresa2 = SitioEmpresa2;
        SitioEmpresa = new cSitioWeb();
        SitioEmpresa2 = new cSitioWeb();
    }

 

    public cEmpresa(String repLegal, String telefono, String direccion, String nombreEmpre) {
        this.repLegal = repLegal;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nombreEmpre = nombreEmpre;
    }
//------------------setters and getters------------
    public String getRepLegal() {
        return repLegal;
    }

    public cSitioWeb getSitioEmpresa() {
        return SitioEmpresa;
    }

    public void setSitioEmpresa(cSitioWeb SitioEmpresa) {
        this.SitioEmpresa = SitioEmpresa;
    }

    public void setRepLegal(String repLegal) {
        this.repLegal = repLegal;
    }

    public String getTelefono() {
        return telefono;
    }

    public cSitioWeb getSitioEmpresa2() {
        return SitioEmpresa2;
    }

    public void setSitioEmpresa2(cSitioWeb SitioEmpresa2) {
        this.SitioEmpresa2 = SitioEmpresa2;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreEmpre() {
        return nombreEmpre;
    }

    public void setNombreEmpre(String nombreEmpre) {
        this.nombreEmpre = nombreEmpre;
    }
//---------------to string-------------------------------
    @Override
    public String toString() {
        return "cEmpresa{" + "repLegal=" + repLegal + ", telefono=" + telefono + ", direccion=" + direccion + ", nombreEmpre=" + nombreEmpre + '}';
    }
    

}//end of cEmpresa

