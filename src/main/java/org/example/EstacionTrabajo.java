package org.example;
import java.util.concurrent.CountDownLatch;

// Cada estación es un hilo que produce un componente
class EstacionTrabajo extends Thread {
    private String tipoComponente;
    private CountDownLatch latch;

    public EstacionTrabajo(String tipoComponente, CountDownLatch latch) {
        this.tipoComponente = tipoComponente;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            System.out.println("Produciendo " + tipoComponente + "...");
            // Simulamos tiempo de producción
            Thread.sleep((long) (Math.random() * 5000));

            // Usamos la fábrica para crear el componente
            Componentes componente = Factory.crearComponente(tipoComponente);
            System.out.println(componente.getNombre() + " producido.");

            // Avisamos a la línea de ensamblaje que hemos terminado
            latch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
