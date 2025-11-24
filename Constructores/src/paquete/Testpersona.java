package paquete;

public class Testpersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Santiago");
        Persona p2 = new Persona("Lucia", 20);
        Persona p3 = new Persona("Martin", 17, "martin@mail.com");

        p1.setEdad(25);
        p1.setEmail("santi@mail.com");

        System.out.println("=== PERSONAS ===");
        System.out.println(p1);
        System.out.println("¿" + p1.getNombre() + " es mayor? " + p1.sosMayor());
        System.out.println("Repeticiones de 'a' en " + p1.getNombre() + ": " + p1.repeticionesDeLetra('a'));

        System.out.println();

        System.out.println(p2);
        System.out.println("¿" + p2.getNombre() + " es mayor? " + p2.sosMayor());

        System.out.println();

        System.out.println(p3);
        System.out.println("¿" + p3.getNombre() + " es mayor? " + p3.sosMayor());
    }
}
