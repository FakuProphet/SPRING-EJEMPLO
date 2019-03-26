 
package modelos;


public class Afiliado {
    
    private int dni;
    private int codAfiliado;
    private String area;
    private Double sueldo;

    public Afiliado(int dni, int codAfiliado, String area, Double sueldo) {
        this.dni = dni;
        this.codAfiliado = codAfiliado;
        this.area = area;
        this.sueldo = sueldo;
    }
    
    public Afiliado(){}

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCodAfiliado() {
        return codAfiliado;
    }

    public void setCodAfiliado(int codAfiliado) {
        this.codAfiliado = codAfiliado;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
    
}
