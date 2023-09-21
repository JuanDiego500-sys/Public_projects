
package modelo.to;

public class cAdministrador {//beginning of admin
//------------definition----------------
    String nombreAdm,correo,telefono;
//------------constructors--------------
    public cAdministrador() {
    }

    public cAdministrador(String nombreAdm, String correo, String telefono) {
        this.nombreAdm = nombreAdm;
        this.correo = correo;
        this.telefono = telefono;
    }
//-------------setters and getters-----------
    public String getNombreAdm() {
        return nombreAdm;
    }

    public void setNombreAdm(String nombreAdm) {
        this.nombreAdm = nombreAdm;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

   
//-----------------to string----------------------
    @Override
    public String toString() {
        return "cAdministrador{" + "nombreAdm=" + nombreAdm + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
}//end of admin
