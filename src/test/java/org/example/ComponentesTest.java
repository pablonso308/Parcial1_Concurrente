package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComponentesTest {

    private Componentes componentes;

  @BeforeEach
public void setUp() {
    componentes = new Componentes("ComponenteTest");
}

    @Test
    public void testComponentesInitialization() {
        assertNotNull(componentes, "Los componentes deben inicializarse correctamente");
    }
}