package org.example;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InterfazCampanasTest {

    private InterfazCampanas interfaz;

    @BeforeEach
    public void setUp() {
        interfaz = new InterfazCampanas();
    }

    @Test
    public void testInterfazInitialization() {
        assertNotNull(interfaz, "La interfaz debe inicializarse correctamente");
    }

    // Agrega más tests según la funcionalidad de esta clase
}
