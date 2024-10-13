package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testMainMethodExecution() {
        assertDoesNotThrow(() -> Main.main(new String[]{}), "El método main no debería lanzar excepciones");
    }
}