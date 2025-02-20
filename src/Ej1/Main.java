package Ej1;

// Prueba de nivel Pablo Matta
import java.util.Scanner;


/*
EJERCICIO 1: SUma de digitos
Encuentra la suma de los dígitos de todos los números de 1 a N (Ambos incluidos)
Ejemplos:
# N = 4 1
+ 2 + 3 + 4 = 10
# N = 10
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + (1 + 0) = 46
# N = 12
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + (1 + 0) + (1 + 1) + (1 + 2) = 51
 */

public class Main {
    public static void main(String[] args) {

        // Creamos la clase scanner, que nos pedira la entrada por teclado (Consola)
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numnero");
        // Almacenamos el numero que ingresamos en la variable n de tipo int
        int n = sc.nextInt();
        // Cierro la conexxion del scanner para evitar futuros problemas y cortar la comunicacion maquina -  usuario
        sc.close();

        // llamada al metodo el cual nos va a devolver toda la informacion
        devolverNumeros(n);

    }

    public static void devolverNumeros(int n) {
        int sumatotal = 0; // aqui guardaremos la suma total

        System.out.print("N = " + n + "\n");

        for (int i = 1; i <= n; i++) {
            int numeroAlmacenado = i;
            boolean esPrimerDigito = true;

            if (i > 9) System.out.print("(");
            while (numeroAlmacenado > 0) {
                if (!esPrimerDigito) System.out.print(" + ");
                System.out.print(numeroAlmacenado % 10);
                sumatotal += numeroAlmacenado % 10;
                numeroAlmacenado /= 10;
                esPrimerDigito = false;
            }
            if (i > 9) System.out.print(")");
            if (i < n) System.out.print(" + ");
        }
        System.out.println(" = " + sumatotal);
    }

}