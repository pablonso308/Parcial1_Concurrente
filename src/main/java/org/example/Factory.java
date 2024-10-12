package org.example;

public class Factory {

    public static void crearComponente(String tipoComponente) {
        try {
            // Producir el componente
            BufferCompartido.producir(tipoComponente);

            // Subir el componente a Firebase
            DatabaseHelper.subirComponenteAFirebase(tipoComponente);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
