package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        //¿Como crear una arraylist?
        //Estamos declarando una variable lista de tipo list que sera de tipo persona
        //A la variable lista le asignamos una nueva instancia de ArrayList que contiene objetos de tipo Persona
        List<Persona> lista = new ArrayList<Persona>();

        //cuando declaramos list estamos utilizando la interfaz de list como tipo de variable, esto
        //va a permitir que los datos que se almacenen en la instancia de ArrayList tenga todos los comportamientos definidos en la interfaz List pero con la implementación específica proporcionada por ArrayList.

        //¿Como agregar objetos a ese array list? con add
        lista.add(new Persona(1,"felipe",22));
        lista.add(new Persona(2,"Sara",23));
        lista.add(new Persona(3,"Luisina",9));

        //Como recorrer el arrayList
        //recorrer por indice
        System.out.println("---------------Con for Clasico----------------");
        for (int i=0; i<lista.size(); i++){
            System.out.println("Prueva: "+lista.get(i).getNombre());
        }

        System.out.println("----------------For each--------------");

        //Y si no quiero recorre por indice? utilizo un for Each

        //Que signifca un forEach: Por cada uno

        //por cada Persona que se representa como perso,(cada objeto de Persona) que este dentro de la lista
        for (Persona perso: lista){
            System.out.println("Prueba: "+ perso.getNombre());
        }
    }
}
