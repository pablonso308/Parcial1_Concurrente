package org.example;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.FileInputStream;
import java.io.IOException;

public class FirebaseConfig {
    public static void inicializarFirebase() throws IOException {
        // Carga del archivo de credenciales JSON
        FileInputStream serviceAccount = new FileInputStream("src/main/resources/google-services.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://parcial1concurrente-96dc8.firebaseio.com") // Usa tu URL de Firebase
                .build();

        FirebaseApp.initializeApp(options);
        System.out.println("Firebase inicializado correctamente.");
    }
}
