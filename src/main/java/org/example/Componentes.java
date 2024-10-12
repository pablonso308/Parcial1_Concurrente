package org.example;


// Clase abstracta que define un Componente
abstract class Componentes {
    protected String nombre;



    public Componentes(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Ejemplos de componentes específicos
class BaseCampana extends Componentes {
    public BaseCampana() {
        super("Base de la Campana");
    }
}

class CupulaCampana extends Componentes {
    public CupulaCampana() {
        super("Cúpula de la Campana");
    }
}

class SoporteCampana extends Componentes {
    public SoporteCampana() {
        super("Soporte de la Campana");
    }
}

class SistemaCalibracion extends Componentes {
    public SistemaCalibracion() {
        super("Sistema de Calibración");
    }
}
