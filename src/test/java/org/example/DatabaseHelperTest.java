package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseHelperTest {

    private DatabaseHelper dbHelper;

    @BeforeEach
    public void setUp() {
        dbHelper = new DatabaseHelper();
    }

    @Test
    public void testDatabaseHelperInitialization() {
        assertNotNull(dbHelper, "El DatabaseHelper debe inicializarse correctamente");
    }
}