public class Reptil extends Animal {

    public Reptil(String nombre, int edad) {
        super(nombre, edad, "Reptil");
    }

    @Override
    public String realizarAccion() {
        return "Se alimenta de pequenos animales";
    }
}
