
package trabajomenu;


public class estudiante {
    
    private String nombre;
     private String apellido;
    private String identificacion;
     private int puesto;
    private Double nota;
    
    public estudiante(String nombre, String apellido, String identificacion, int puesto, Double nota) {
        
        setNombre (nombre);
         setApellido (apellido);
          setIdentificacion (identificacion);
           setPuesto (puesto);
            setNota (nota);
    }
    
    public String imprimir(){
        
        return "";
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
    
    
            
            
    
}
