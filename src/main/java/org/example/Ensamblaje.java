package org.example;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

class Ensamblaje extends Thread {
    private DatabaseReference dbRef;

    public Ensamblaje() {
        this.dbRef = FirebaseDatabase.getInstance().getReference("componentes");
    }

    @Override
    public void run() {
        try {
            System.out.println("Esperando que todos los componentes estén listos...");

            // Escuchar cambios en Firebase
            dbRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                        String componente = snapshot.getValue(String.class);
                        System.out.println("Ensamblando componente: " + componente);
                    }
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                    System.err.println("Error al leer Firebase: " + databaseError.getMessage());
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

