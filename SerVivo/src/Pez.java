public class Pez extends Animal {

    public Pez(String nombre, int edad) {
        super(nombre, edad, "Pez");
    }

    @Override
    public String realizarAccion() {
        return "Se alimenta en el agua";
    }
}
