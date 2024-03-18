package stacks;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        //como crear una pila?
        Stack<Integer> pila = new Stack<Integer>();
        System.out.println("Pila vacia: "+pila);
        System.out.println("Esta vacia? "+pila.isEmpty());

        //agregar
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);

        for (Integer pilita: pila){
            System.out.println(pilita);
        }


        pila.pop(); //Eliminar el ultimo registro que entra(en el que esta en el tope de fila
        System.out.println("Esta en el 3"+ pila.search(3));
        System.out.println("Ultimo agregado: "+pila.peek());

        for (Integer pilita: pila){
            System.out.println(pilita);
        }
    }
}
