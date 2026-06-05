public class Arbusto extends Planta {

    public Arbusto(String nombre, int edad) {
        super(nombre, edad, "Arbusto");
    }

    @Override
    public String realizarAccion() {
        return "Crece con varios tallos";
    }
}