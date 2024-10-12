package org.example;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        // Cantidad de estaciones de trabajo
        int numEstaciones = 4;
        CountDownLatch latch = new CountDownLatch(numEstaciones);

        // Creamos las estaciones de trabajo (hilos)
        EstacionTrabajo baseEstacion = new EstacionTrabajo("Base", latch);
        EstacionTrabajo cupulaEstacion = new EstacionTrabajo("Cúpula", latch);
        EstacionTrabajo soporteEstacion = new EstacionTrabajo("Soporte", latch);
        EstacionTrabajo calibracionEstacion = new EstacionTrabajo("Calibración", latch);

        // Línea de ensamblaje final
        Ensamblaje ensamblaje = new Ensamblaje(latch);

        // Iniciamos los hilos
        baseEstacion.start();
        cupulaEstacion.start();
        soporteEstacion.start();
        calibracionEstacion.start();

        // Iniciamos el ensamblaje final
        ensamblaje.start();
    }
}
