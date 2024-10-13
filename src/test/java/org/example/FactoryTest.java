package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactoryTest {

    private Factory factory;

    @BeforeEach
    public void setUp() {
        factory = new Factory();
    }

    @Test
    public void testFactoryInitialization() {
        assertNotNull(factory, "La fábrica debe inicializarse correctamente");
    }
}

