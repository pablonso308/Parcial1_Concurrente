package org.example;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BufferCompartido {
    // Definir una cola bloqueante con un límite de 4 (suponiendo que hay 4 tipos de componentes)
    private static BlockingQueue<String> buffer = new LinkedBlockingQueue<>(4);

    // Método para agregar un componente al búfer (productor)
    public static void producir(String componente) throws InterruptedException {
        buffer.put(componente);  // Esto bloqueará si el búfer está lleno
        System.out.println("Componente " + componente + " producido y agregado al búfer.");
    }

    // Método para consumir un componente del búfer (consumidor)
    public static String consumir() throws InterruptedException {
        String componente = buffer.take();  // Esto bloqueará si el búfer está vacío
        System.out.println("Componente " + componente + " retirado del búfer para ensamblaje.");
        return componente;
    }

    // Verificar si el búfer está vacío
    public static boolean estaVacio() {
        return buffer.isEmpty();
    }
}
