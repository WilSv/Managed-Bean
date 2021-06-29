/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;


import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Karasu
 */
@Named(value = "materiasB")
@RequestScoped
public class MateriasB {
    
    private String asignatura;
    private String docente;
    private String carrera;
    private String ciclo;
    private List<String> Carreraseleccionadas; 
    private List<String> Docentesseleccionados; 
    private List<String> Ciclossseleccionados; 


    /**
     * Creates a new instance of MateriasB
     */
    public MateriasB() {
    }
    

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getDocente() {
           StringBuilder sb = new StringBuilder();
    String delim = "-";
 
        int i = 0;
        while (i < Docentesseleccionados.size() - 1)
        {
            sb.append(Docentesseleccionados.get(i));
            sb.append(delim);
            i++;
        }
        sb.append(Docentesseleccionados.get(i));
        docente= sb.toString();  ;
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getCarrera() {
                   StringBuilder sb = new StringBuilder();
    String delim = "-";
 
        int i = 0;
        while (i < Carreraseleccionadas.size() - 1)
        {
            sb.append(Carreraseleccionadas.get(i));
            sb.append(delim);
            i++;
        }
        sb.append(Carreraseleccionadas.get(i));
        carrera= sb.toString();  ;
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public List<String> getCarreraseleccionadas() {
        return Carreraseleccionadas;
    }

    public void setCarreraseleccionadas(List<String> Carreraseleccionadas) {
        this.Carreraseleccionadas = Carreraseleccionadas;
    }


    public List<String> getDocentesseleccionados() {
        return Docentesseleccionados;
    }

    public void setDocentesseleccionados(List<String> Docentesseleccionados) {
        this.Docentesseleccionados = Docentesseleccionados;
    }

    public List<String> getCiclossseleccionados() {
        return Ciclossseleccionados;
    }

    public void setCiclossseleccionados(List<String> Ciclossseleccionados) {
        this.Ciclossseleccionados = Ciclossseleccionados;
    }


    
    
    public String consultar(){
        return "ConsultaDatos.xhtml";
    }
   

    
}
