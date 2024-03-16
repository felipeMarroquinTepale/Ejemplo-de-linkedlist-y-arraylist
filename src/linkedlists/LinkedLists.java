package linkedlists;

import arraylists.Persona;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {

        List<Persona> lista = new LinkedList<Persona>();

        //agregar al final de la lista
        lista.add(new Persona(1,"felipe",22));
        lista.add(new Persona(2,"Sara",23));
        lista.add(new Persona(3,"Luisina",9));

        //agregar al principio
        lista.add(0,new Persona(1,"1 tercero",22));
        lista.add(0,new Persona(2,"1segundo",23));
        lista.add(0,new Persona(3,"1tercero",9));


        System.out.println("----------------For each--------------");

        //por cada Persona que se representa como perso,(cada objeto de Persona) que este dentro de la lista
        for (Persona perso: lista){
            System.out.println("Prueba: "+ perso.getNombre());
        }
    }
}
