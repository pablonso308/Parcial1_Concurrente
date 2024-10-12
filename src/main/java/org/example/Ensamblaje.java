package org.example;

public class Ensamblaje extends Thread {
    private InterfazCampanas interfaz;

    public Ensamblaje(InterfazCampanas interfaz) {
        this.interfaz = interfaz;
    }

    @Override
    public void run() {
        try {
            while (!BufferCompartido.estaVacio()) {
                String componente = BufferCompartido.consumir();  // Consumir del búfer
                Thread.sleep((long) (Math.random() * 3000));      // Simula el tiempo de ensamblaje

                // Actualizar la interfaz con el componente ensamblado
                interfaz.agregarComponente(componente);
            }

            System.out.println("Todos los componentes han sido ensamblados.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
