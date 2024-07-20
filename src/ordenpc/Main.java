package ordenpc;

import modelo.Raton;
import modelo.Teclado;
import modelo.Monitor;
import modelo.Computadora;
import servicio.Orden;

public class Main {
    
    public static void main(String[] args) {
        
        Teclado tecladoDell = new Teclado("usb", "Dell");
        Teclado tecladoDell2 = new Teclado("bluetooth", "Dell");
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
        
        Raton ratonDell = new Raton("usb", "Dell");
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        
        Monitor monitorDell = new Monitor("Dell", 24);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        
//        System.out.println(tecladoDell);
//        System.out.println(tecladoLenovo);
//        
//        System.out.println(ratonDell);
//        
//        System.out.println(monitorDell);
//        System.out.println(monitorLenovo);

        Computadora computadoraDell = new Computadora(
                "Computadora Dell", 
                monitorDell, 
                tecladoDell, 
                ratonDell
        );
        
        Computadora computadoraLenovo = new Computadora(
                "Computadora Lenovo",
                monitorLenovo,
                tecladoDell2,
                ratonLenovo
        );
        
//        System.out.println(computadoraDell);
//        System.out.println(computadoraLenovo);

        Orden orden1 = new Orden();
        
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraLenovo);
        
        orden1.mostrarOrden();
        
    }
    
}
