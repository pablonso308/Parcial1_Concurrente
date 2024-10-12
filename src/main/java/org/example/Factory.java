package org.example;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    // Mapa para almacenar el estado de los componentes producidos
    private static Map<String, String> componentesProducidos = new HashMap<>();

    // Método para crear un componente y añadirlo al mapa de componentes
    public static synchronized void crearComponente(String tipoComponente) {
        if (!componentesProducidos.containsKey(tipoComponente)) {
            // Simular creación del componente
            componentesProducidos.put(tipoComponente, "producido");

            // Subir el componente a Firebase una vez creado
            DatabaseHelper.subirComponenteAFirebase(tipoComponente);

            System.out.println("Componente " + tipoComponente + " producido y subido a Firebase.");
        } else {
            System.out.println("Componente " + tipoComponente + " ya ha sido producido.");
        }
    }

    // Método para verificar si todos los componentes han sido producidos
    public static synchronized boolean todosComponentesProducidos() {
        return componentesProducidos.size() == 4;  // Supongamos que son 4 tipos de componentes
    }
}
