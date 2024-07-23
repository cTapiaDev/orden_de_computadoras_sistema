package modelo;

/**
 * Clase padre de raton y teclado.
 * 
 * @author Carlos Tapia
 * @version 0.0.1
 */

public class DispositivoEntrada {
    
    /**
     * Tipo de entrada.
     */
    private String tipoEntrada;
    
    /**
     * Marca del dispositivo.
     */
    private String marca;
    
    
    // Constructor
    /**
     * Datos de nuevo dispositivo de entrada.
     * 
     * @param tipoEntrada Tipo de entrada.
     * @param marca Marca del dispositivo.
     */
    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }
    
    /**
     * Se obtiene el Tipo de entrada.
     * 
     * @return Tipo de entrada.
     */
    public String getTipoEntrada() {
        return tipoEntrada;
    }

    // Modificador de tipoEntrada
    /**
     * Modifica el Tipo de entrada.
     * 
     * @param tipoEntrada Tipo de entrada.
     */
    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    /**
     * Se obtiene la marca del dispositivo.
     * 
     * @return Marca del dispositivo.
     */
    public String getMarca() {
        return marca; 
    }

    /**
     * Modifica la marca del dispositivo
     * 
     * @param marca Marca del dispositivo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    /**
     * Retorna los datos del dispositivo de entrada.
     * 
     * @return Datos de clase.
     */
    @Override
    public String toString() {
        return "DispositivoEntrada{" 
                + "tipoEntrada=" + tipoEntrada 
                + ", marca=" + marca 
                + '}';
    }
    
    
    
}
