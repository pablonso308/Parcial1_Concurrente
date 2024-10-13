package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstacionTrabajoTest {

    private EstacionTrabajo estacionTrabajo;

    @BeforeEach
    public void setUp() {
        estacionTrabajo = new EstacionTrabajo(  "tipoComponente");
    }

    @Test
    public void testEstacionInitialization() {
        assertNotNull(estacionTrabajo, "La estación de trabajo debe inicializarse correctamente");
    }
}