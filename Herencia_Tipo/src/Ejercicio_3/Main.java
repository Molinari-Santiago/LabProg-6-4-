package Ejercicio_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    	ArrayList<Personaje> personajes = new ArrayList<>();
        
    	Posicion p1 = new Posicion(3, 3);
    	Posicion p2 = new Posicion(4, 8);
    	Posicion p3 = new Posicion(0, 9);
    	
    	personajes.add(new Caballero("Yo", 10, p1));
    	personajes.add(new Mago("Mago", 10, p2));
    	personajes.add(new Ogro("KAKA", 10, p3));
        
		System.out.println(p1.getPosx() + " y " + p1.getPosy() + "antes");
    	p1.incrementaPos(1, 5);
    	
    	System.out.println(p2.getPosx() + " y " + p2.getPosy()  + "antes");
    	p2.setXY(10, 80);
    	
    	System.out.println(p3.getPosx() + " y " + p3.getPosy()  + "antes");
    	p3.incrementaPos(3, 0);
    	
    	for (Personaje p : personajes) {
    		p.RepresentacionEnConsola();
        }
    }
}
