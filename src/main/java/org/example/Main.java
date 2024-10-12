package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Inicializamos Firebase
            FirebaseConfig.inicializarFirebase();

            // Creamos las estaciones de trabajo (hilos)
            EstacionTrabajo baseEstacion = new EstacionTrabajo("Base");
            EstacionTrabajo cupulaEstacion = new EstacionTrabajo("Cúpula");
            EstacionTrabajo soporteEstacion = new EstacionTrabajo("Soporte");
            EstacionTrabajo calibracionEstacion = new EstacionTrabajo("Calibración");

            // Línea de ensamblaje final
            Ensamblaje ensamblaje = new Ensamblaje();

            // Iniciamos los hilos de producción
            baseEstacion.start();
            cupulaEstacion.start();
            soporteEstacion.start();
            calibracionEstacion.start();

            // Iniciamos el hilo de ensamblaje
            ensamblaje.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
