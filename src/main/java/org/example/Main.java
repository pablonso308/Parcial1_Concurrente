package org.example;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Crear la interfaz gráfica
        InterfazCampanas interfaz = new InterfazCampanas();

        // Crear y arrancar las estaciones de trabajo (productores)
        EstacionTrabajo estacion1 = new EstacionTrabajo("Base");
        EstacionTrabajo estacion2 = new EstacionTrabajo("Cúpula");
        EstacionTrabajo estacion3 = new EstacionTrabajo("Soporte");
        EstacionTrabajo estacion4 = new EstacionTrabajo("Calibración");

        estacion1.start();
        estacion2.start();
        estacion3.start();
        estacion4.start();

        // Crear y arrancar la línea de ensamblaje (consumidor)
        Ensamblaje ensamblaje = new Ensamblaje(interfaz);
        ensamblaje.start();

        // Esperar a que todas las estaciones terminen
        estacion1.join();
        estacion2.join();
        estacion3.join();
        estacion4.join();

        // Esperar a que la línea de ensamblaje termine
        ensamblaje.join();

        System.out.println("Proceso de producción y ensamblaje completado.");
    }
}
