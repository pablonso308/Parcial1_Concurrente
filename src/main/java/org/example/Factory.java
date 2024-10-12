package org.example;


// La fábrica crea diferentes componentes
class Factory {
    // Método que crea un componente
    public Componentes createComponent(String tipoComponente) {
        switch (tipoComponente) {
            case "Base":
                return new BaseCampana();
            case "Cúpula":
                return new CupulaCampana();
            case "Soporte":
                return new SoporteCampana();
            case "Calibración":
                return new SistemaCalibracion();
            default:
                return null;
        }
    }
}
