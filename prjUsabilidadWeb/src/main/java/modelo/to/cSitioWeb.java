package modelo.to;

public class cSitioWeb {//beginning of class cSitioWeb
//-----------------------defintion---------------------------
    String URL,CUI,fechaValoracion,descripcionSitio;
    cAdministrador AdminSitio;
//------------------------constructors-----------------------
    public cSitioWeb() {
    }

    public cSitioWeb(cAdministrador AdminSitio) {
        this.AdminSitio = AdminSitio;
        AdminSitio = new cAdministrador();
    }

    public cAdministrador getAdminSitio() {
        return AdminSitio;
    }

    public void setAdminSitio(cAdministrador AdminSitio) {
        this.AdminSitio = AdminSitio;
    }

    public cSitioWeb(String URL, String CUI, String fechaValoracion, String descripcionSitio) {
        this.URL = URL;
        this.CUI = CUI;
        this.fechaValoracion = fechaValoracion;
        this.descripcionSitio = descripcionSitio;
    }
//-----------------------setters and getters-----------------
    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getCUI() {
        return CUI;
    }

    public void setCUI(String CUI) {
        this.CUI = CUI;
    }

    public String getFechaValoracion() {
        return fechaValoracion;
    }

    public void setFechaValoracion(String fechaValoracion) {
        this.fechaValoracion = fechaValoracion;
    }

    public String getDescripcionSitio() {
        return descripcionSitio;
    }

    public void setDescripcionSitio(String descripcionSitio) {
        this.descripcionSitio = descripcionSitio;
    }
//--------------------to string-----------------------------------
    @Override
    public String toString() {
        return "cSitioWeb{" + "URL=" + URL + ", CUI=" + CUI + ", fechaValoracion=" + fechaValoracion + ", descripcionSitio=" + descripcionSitio + '}';
    }
    

}//end of cSitioWeb
