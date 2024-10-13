package org.example;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DatabaseHelper {

    public static void subirComponenteAFirebase(String componente) {
        try {
            DatabaseReference dbRef = FirebaseDatabase.getInstance().getReference("componentes");

            // Subir el componente a Firebase
            dbRef.push().setValueAsync(componente);
            System.out.println("Componente " + componente + " subido exitosamente a Firebase.");
        } catch (Exception e) {
            System.err.println("Error al subir el componente " + componente + " a Firebase: " + e.getMessage());
        }
    }
}
