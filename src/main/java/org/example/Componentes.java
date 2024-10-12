package org.example;

// Clase abstracta que define un Componente
class Componentes {
    protected String nombre;
    private boolean ensamblado; // Marca si ya se usó en el ensamblaje

    public Componentes(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public boolean isEnsamblado() {
        return ensamblado;
    }

    public void setEnsamblado(boolean ensamblado) {
        this.ensamblado = ensamblado;
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





