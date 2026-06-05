public abstract class Planta extends SerVivo {

    protected String tipo;

    public Planta(String nombre, int edad, String tipo) {
        super(nombre, edad);
        this.tipo = tipo;
    }
}
