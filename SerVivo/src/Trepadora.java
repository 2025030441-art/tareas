public class Trepadora extends Planta {

    public Trepadora(String nombre, int edad) {
        super(nombre, edad, "Trepadora");
    }

    @Override
    public String realizarAccion() {
        return "Crece apoyandose en otras superficies";
    }
}
