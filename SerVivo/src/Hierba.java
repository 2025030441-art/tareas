public class Hierba extends Planta {

    public Hierba(String nombre, int edad) {
        super(nombre, edad, "Hierba");
    }

    @Override
    public String realizarAccion() {
        return "Crece rapidamente y es pequena";
    }
}