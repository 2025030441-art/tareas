public class Mamifero extends Animal {

    public Mamifero(String nombre, int edad) {
        super(nombre, edad, "Mamifero");
    }

    @Override
    public String realizarAccion() {
        return "Alimenta a sus crias";
    }
}