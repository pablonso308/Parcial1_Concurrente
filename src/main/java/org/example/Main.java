package org.example;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.FileInputStream;
import java.io.IOException;

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

        try {
            // Ruta del archivo de configuración de la cuenta de servicio
            FileInputStream serviceAccount = new FileInputStream("src/main/resources/tu-archivo-cuenta-servicio.json");

            // Configuración de Firebase con el archivo de cuenta de servicio
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://parcial1concurrente-96dc8.firebaseio.com") // Cambia por la URL de tu base de datos
                    .build();

            // Inicializar Firebase
            FirebaseApp.initializeApp(options);

            // Ahora puedes acceder a la base de datos
            DatabaseReference database = FirebaseDatabase.getInstance().getReference();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}






