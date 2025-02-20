package Ej2;
// Ejercicio 2 Prueba nivel Pablo Matta
import java.util.ArrayList;
import java.util.List;

/*
Moviendo ceros
Moviendo ceros al final:
Escribe un algoritmo que reciba un array y mueva todos los ceros al final, manteniendo el orden del resto de elementos.
Ejemplo:
moveZeros([false,1,0,1,2,0,1,3,"a"]) // returns[false,1,1,2,1,3,"a",0,0]
 */

public class Ejercicio2 {

    public static void main(String[] args) {

        // Para probar esto, voy a crear una lista de arrays con distintos tipos de elementos, ya que al ser de tipo Oject el contenido de esta, podemos añadir muchos tipos de datos
        List<Object> listaAFiltrar = new ArrayList<>();
        listaAFiltrar.add(1);
        listaAFiltrar.add(0);
        listaAFiltrar.add(1);
        listaAFiltrar.add(2);
        listaAFiltrar.add(0);
        listaAFiltrar.add(1);
        listaAFiltrar.add(3);
        listaAFiltrar.add("a");

        // Creamos la lista del resultado donde nos va a mutar la lista el metodo creado debajo.

        List<Object> listaFinal = moveZeros(listaAFiltrar);
        System.out.println(listaFinal);


    }


    public static List<Object> moveZeros (List<Object> list) {
        int posicionParaInsertar = 0;

        for (int i = 0; i < list.size(); i++) {
            Object elemento = list.get(i);
            // Ahora voy a comprobar si el elemento es 0
            if (!elemento.equals(0)) {
                // En el caso de no ser 0, lo damos por válido y lo introducimos en la lista en el orden que le toque
                list.set(posicionParaInsertar, elemento);
                if (posicionParaInsertar != i) {
                    list.set(i, 0); // Comprobación en el caso de que la posición a insertar no esté acorde al índice del bucle
                }
                // Incrementamos el índice solo cuando insertamos un número no cero
                posicionParaInsertar++;
            }
        }
        return list;
    }
    }
