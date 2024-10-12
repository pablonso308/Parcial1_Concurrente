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
            // Simulamos tiempo de producción
            Thread.sleep((long) (Math.random() * 5000));

            // Creamos el componente
            Componentes componente = new Componentes(tipoComponente);

            // Subimos el componente a Firebase
            dbRef.child(tipoComponente).setValueAsync(componente);
            System.out.println(tipoComponente + " subido a Firebase.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
