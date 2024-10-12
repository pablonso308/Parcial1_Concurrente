package org.example;

import java.util.concurrent.CountDownLatch;

class Ensamblaje extends Thread {
    private CountDownLatch latch;

    public Ensamblaje(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            System.out.println("Esperando que todos los componentes estén listos...");
            // Esperamos a que todas las estaciones terminen
            latch.await();

            // Simulamos el ensamblaje final
            System.out.println("Todos los componentes listos. Ensamblando la campana de Gauss...");
            Thread.sleep(2000);
            System.out.println("Campana de Gauss ensamblada correctamente.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

