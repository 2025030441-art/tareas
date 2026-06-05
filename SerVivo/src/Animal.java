public abstract class Animal extends SerVivo {

    protected String tipo;

    public Animal(String nombre, int edad, String tipo) {
        super(nombre, edad);
        this.tipo = tipo;
    }
}
