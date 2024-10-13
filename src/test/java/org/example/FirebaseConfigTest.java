package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirebaseConfigTest {

    private FirebaseConfig firebaseConfig;

    @BeforeEach
    public void setUp() {
        firebaseConfig = new FirebaseConfig();
    }

    @Test
    public void testFirebaseConfigInitialization() {
        assertNotNull(firebaseConfig, "FirebaseConfig debe inicializarse correctamente");
    }
}