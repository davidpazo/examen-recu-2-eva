package concesionario;

/**
 *
 * @author dpazolopez
 */
public class Coche {

    String modelo;
    float precio;

    public Coche() {
    }

    public Coche(String modelo, float precio) {
        this.modelo = modelo;
        this.precio = precio;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
     public float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    
}
