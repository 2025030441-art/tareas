public class Anfibio extends Animal {

    public Anfibio(String nombre, int edad) {
        super(nombre, edad, "Anfibio");
    }

    @Override
    public String realizarAccion() {
        return "Se alimenta en agua y tierra";
    }
}