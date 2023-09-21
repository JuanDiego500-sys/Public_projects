package com.mycompany.prjusabilidadweb;

import modelo.to.cAdministrador;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelo.to.cCaracterísticaDeCalidad;
import modelo.to.cElementos;
import modelo.to.cUsabilidadWeb;
import modelo.to.cComponenteCaracterística;
import modelo.to.cEmpresa;
import modelo.to.cSitioWeb;

public class PrjUsabilidadWeb {

    public static cUsabilidadWeb objUsabilidad;

    public static cUsabilidadWeb llenarvaloraciones(cUsabilidadWeb miUsabilidad) {

        cElementos objElem;
        for (int i = 0; i < miUsabilidad.getLstCar().size(); i++) {

            for (int j = 0; j < miUsabilidad.getLstCar().get(i).getLstComp().size(); j++) {

                for (int k = 0; k < miUsabilidad.getLstCar().get(i).getLstComp().get(j).getLstElementos().size(); k++) {
                    objElem = miUsabilidad.getLstCar().get(i).getLstComp().get(j).getLstElementos().get(k);
                    objElem.setValoracion(Double.parseDouble(JOptionPane.showInputDialog(objElem.getNombreMed())));

                }
            }
        }
        return miUsabilidad;
    }//end of llenar valoraciones

    public static cAdministrador llenarAdmin() {
        cAdministrador Admin = new cAdministrador();
        Admin.setNombreAdm(JOptionPane.showInputDialog("Digite el nombre del administrador"));
        Admin.setTelefono(JOptionPane.showInputDialog("Digite el nombre del administrador"));
        Admin.setCorreo(JOptionPane.showInputDialog("Digite el correo del empleado"));
        return Admin;
    }//end of llenar admin

    public static cSitioWeb llenarWeb() {
        cSitioWeb Sitio = new cSitioWeb();
        Sitio.setURL(JOptionPane.showInputDialog("Digite la URL del sitio web"));
        Sitio.setCUI(JOptionPane.showInputDialog("Digite el CUI  del sitio web"));
        Sitio.setFechaValoracion(JOptionPane.showInputDialog("Digite la fecha de valoración del sitio web"));
        Sitio.setDescripcionSitio(JOptionPane.showInputDialog("¿De qué trata el sitio web?"));
        Sitio.setAdminSitio(llenarAdmin());
        return Sitio;
    }//end of llenar sitio 

    public static cEmpresa llenarEmpresa() {
        cEmpresa Emp = new cEmpresa();
        Emp.setNombreEmpre(JOptionPane.showInputDialog("Digite el nombre de la empresa"));
        Emp.setDireccion(JOptionPane.showInputDialog("Digite la dirección de la empresa"));
        Emp.setRepLegal(JOptionPane.showInputDialog("Digite el nombre del representante legal"));
        String[] options = {"1", "2"};
        //-------------------begginning of options of sitio web ----------------------------
        int opcM = JOptionPane.showOptionDialog(null, "Seleccione cuántos sitios web tiene su empresa", "Elección de sitio web",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null,
                options, options[0]);
        switch (opcM) {
            case 0:
                Emp.setSitioEmpresa(llenarWeb());
                break;
            case 1:
                Emp.setSitioEmpresa(llenarWeb());
                Emp.setSitioEmpresa2(llenarWeb());
                break;

        }//end of switch

        return Emp;
    }//end of llenar empresa

    public static void llenarDatos() {
        String ubic = "C:\\Users\\jndgg\\Desktop\\PROG-1\\listaPRJUsabilidadWeb.txt";//creation of var recorrido
        String lineArch = "";
        String partes[];

        //var to open de file
        FileReader fr_usab;
        // var to navegate into the file
        BufferedReader br_usab;
        int cant = 0;
        try {
            //try to open the file of municipals in ubic(pc)
            fr_usab = new FileReader(ubic);
            br_usab = new BufferedReader(fr_usab);
            do {
                lineArch = br_usab.readLine();
                System.out.println(lineArch);
                //---------on----------------------
                switch (lineArch) {
                    case "{"://fill característica
                        cant = Integer.parseInt(lineArch = br_usab.readLine());
                        for (int i = 0; i < cant; i++) {
                            lineArch = br_usab.readLine();
                            partes = lineArch.split(",");
                            cCaracterísticaDeCalidad objCaracterísticaDeCalidad = new cCaracterísticaDeCalidad(partes[1], partes[0], Double.parseDouble(partes[2]));
                            objUsabilidad.insertarCar(objCaracterísticaDeCalidad);
                        }

                        break;
                    case "("://fill componente
                        lineArch = br_usab.readLine();
                        int posCar = objUsabilidad.buscarCar(lineArch);
                        if (posCar != -1) {
                            cant = Integer.parseInt(lineArch = br_usab.readLine());
                            for (int i = 0; i < cant; i++) {
                                lineArch = br_usab.readLine();
                                partes = lineArch.split(",");
                                cComponenteCaracterística objComponenteCaracterística = new cComponenteCaracterística(partes[1], partes[0], Double.parseDouble(partes[2]));
                                objUsabilidad.getLstCar().get(posCar).insertarComp(objComponenteCaracterística);
                            }

                        } else {
                            fr_usab.close();
                        }

                        break;
                    case "?"://fill elemento
                        lineArch = br_usab.readLine();
                        int psCar = objUsabilidad.buscarCar(lineArch);
                        if (psCar != -1) {
                            lineArch = br_usab.readLine();
                            int posCom = objUsabilidad.getLstCar().get(psCar).buscarComp(lineArch);
                            if (posCom != -1) {
                                cant = Integer.parseInt(lineArch = br_usab.readLine());
                                for (int i = 0; i < cant; i++) {
                                    lineArch = br_usab.readLine();
                                    partes = lineArch.split(",");
                                    cElementos objElementos = new cElementos(partes[1], partes[0], Double.parseDouble(partes[2]));
                                    objUsabilidad.getLstCar().get(psCar).getLstComp().get(posCom).insertarElem(objElementos);

                                }

                            }

                        }

                        break;

                }
                fr_usab.close();
            } while (lineArch != null);

        } catch (IOException err) {
        }
    }//-----------end of llenar datos-----------------------

    public static void main(String[] args) {//begining of the main
        objUsabilidad = new cUsabilidadWeb();
        llenarDatos();
        llenarEmpresa();

    }//end of main
}//end of project

