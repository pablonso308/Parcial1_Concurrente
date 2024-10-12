package org.example;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.FirebaseDatabase;
import java.io.FileInputStream;
import java.io.IOException;

public class FirebaseConfig {
    public static void inicializarFirebase() throws IOException {
        // Ruta al archivo JSON de configuración de Firebase
        FileInputStream serviceAccount = new FileInputStream("ruta/al/archivo/google-services.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://<tu-proyecto>.firebaseio.com") // URL de la base de datos
                .build();

        FirebaseApp.initializeApp(options);
    }
}

