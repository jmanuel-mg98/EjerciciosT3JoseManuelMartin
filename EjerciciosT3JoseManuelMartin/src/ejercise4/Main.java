package ejercise4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//creamos el scanner para los valores de las variables
		Scanner sc = new Scanner(System.in);
      	//pedimos al usuario el radio y lo recogemos en la variable
        System.out.print("Ingrese el radio de la base del cilindro: ");
        double radio = sc.nextDouble();
      	//pedimos al usuario la altura y lo recogemos en la variable
        System.out.print("Ingrese la altura del cilindro: ");
        double altura = sc.nextDouble();
        //imprimimos el menu creando su respectiva variable
        int opcion;
        //lo metemos en un do while para poder crear el bucle y salir

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Calcular Volumen");
            System.out.println("2. Calcular Área");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            //creamos un switch para cada uno de los casos llamando a las funciones de la otra clase
            //cerramos cada opcion con el break para poder seguir 
            switch (opcion) {
                case 1:
                    System.out.println("Volumen del cilindro: " + Cilindro.volumen(radio, altura));
                    break;
                case 2:
                    System.out.println("Área del cilindro: " + Cilindro.area(radio, altura));
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
	            //en el defaul ponemos el caso de opcion erronea
                default:
	                System.out.println("No entiendo esa opcion. Introduce una opcion correcta");
                    break;
            }
	    //indicamos en el while la salida del bucle
        } while (opcion != 0);

	}

}
