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


