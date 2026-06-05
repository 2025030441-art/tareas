public class Main {
    public static void main(String[] args) {

        SerVivo h = new Hierba("Pasto ", 1);
        SerVivo a = new Arbol("Roble ", 10);
        SerVivo p = new Pez("Pez Globo ", 2);
        SerVivo m = new Mamifero("Leon ", 5);

        System.out.println(h.getNombre() + h.realizarAccion());
        System.out.println(a.getNombre() + a.realizarAccion());
        System.out.println(p.getNombre() + p.realizarAccion());
        System.out.println(m.getNombre() + m.realizarAccion());
    }
}