public class Arbol extends Planta {

    public Arbol(String nombre, int edad) {
        super(nombre, edad, "Arbol");
    }

    @Override
    public String realizarAccion() {
        return "Crece alto y produce sombra";
    }
}
