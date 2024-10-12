package org.example;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class EstacionTrabajo extends Thread {
    private String tipoComponente;
    private DatabaseReference dbRef;

    public EstacionTrabajo(String tipoComponente) {
        this.tipoComponente = tipoComponente;
        this.dbRef = FirebaseDatabase.getInstance().getReference("componentes"); // Referencia a Firebase
    }

    @Override
    public void run() {
        try {
            System.out.println("Produciendo " + tipoComponente + "...");
            Thread.sleep((long) (Math.random() * 5000));  // Simula el tiempo de producción

            // Usa la fábrica para producir el componente y agregarlo al búfer
            Factory.crearComponente(tipoComponente);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
