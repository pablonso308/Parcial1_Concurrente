package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BufferCompartidoTest {

    private BufferCompartido buffer;

    @BeforeEach
    public void setUp() {
        buffer = new BufferCompartido();
    }

    @Test
    public void testBufferInitialization() {
        assertNotNull(buffer, "El buffer compartido debe inicializarse correctamente");
    }

}