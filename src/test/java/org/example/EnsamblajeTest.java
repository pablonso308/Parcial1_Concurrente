package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EnsamblajeTest {

    private Ensamblaje ensamblaje;
    @BeforeEach
    public void setUp() {
        InterfazCampanas interfazCampanas = new InterfazCampanas(); // Asegúrate de tener una implementación de InterfazCampanas
        ensamblaje = new Ensamblaje(interfazCampanas);
    }
    @Test
    public void testEnsamblajeInitialization() {
        assertNotNull(ensamblaje, "El ensamblaje debe inicializarse correctamente");
    }
}