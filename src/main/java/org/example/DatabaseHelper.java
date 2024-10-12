package org.example;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DatabaseHelper {

    // Subir el componente producido a Firebase
    public static void subirComponenteAFirebase(String tipoComponente) {
        DatabaseReference dbRef = FirebaseDatabase.getInstance().getReference("componentes");

        // Asigna el valor de estado al componente
        dbRef.child(tipoComponente).setValueAsync("Componente producido");
    }
}
