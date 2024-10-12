package org.example;


// La fábrica crea diferentes componentes
class Factory {
    public static Componentes crearComponente(String tipo) {
        switch (tipo) {
            case "Base":
                return new BaseCampana();
            case "Cúpula":
                return new CupulaCampana();
            case "Soporte":
                return new SoporteCampana();
            case "Calibración":
                return new SistemaCalibracion();
            default:
                throw new IllegalArgumentException("Tipo de componente desconocido: " + tipo);
        }
    }
}
