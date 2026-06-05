public abstract class SerVivo {
    protected String nombre;
    protected int edad;

    public SerVivo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract String realizarAccion();
    public String getNombre() {
        return nombre;
    }
}