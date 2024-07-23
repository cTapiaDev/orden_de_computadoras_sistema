package modelo;

/**
 * Clase Teclado, herencia de Dispositivo Entrada.
 * 
 * @author Carlos Tapia
 * @version 0.0.1
 */

public class Teclado extends DispositivoEntrada {
    
    private final int idTeclado;
    private static int contadorTeclado;
    
    // ID es auto incrementable
    /**
     * 
     * @param tipoEntrada
     * @param marca 
     */
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        idTeclado = ++contadorTeclado;
    }

    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Teclado{" 
                + "idTeclado=" 
                + idTeclado 
                + "} " + super.toString();
    }
    
    
    
    
    
}
