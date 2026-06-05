public class Ave extends Animal {

    public Ave(String nombre, int edad) {
        super(nombre, edad, "Ave");
    }

    @Override
    public String realizarAccion() {
        return "Se alimenta y puede volar";
    }
}