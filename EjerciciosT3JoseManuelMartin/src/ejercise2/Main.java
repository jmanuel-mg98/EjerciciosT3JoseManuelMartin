package ejercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//creamos el scanner para los valores de las variables
		Scanner sc = new Scanner(System.in);
		//cramos las variable
		double alto,ancho;
		//pedimos al usuario el ancho y la altura
        System.out.print("Ingrese el ancho del rectángulo: ");
        ancho = sc.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        alto = sc.nextDouble();
        //imprimimos el menu creando su respectiva variable
        int opcion;
        //lo metemos en un do while para poder crear el bucle y salir
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Calcular Perímetro");
            System.out.println("2. Calcular Área");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            //creamos un switch para cada uno de los casos llamando a las funciones de la otra clase
            //cerramos cada opcion con el break para poder seguir 
            switch (opcion) {
                case 1:
                    System.out.println("Perímetro del rectángulo es: " + Rectangulo.perimetro(ancho, alto));
                    break;
                case 2:
                    System.out.println("Área del rectángulo es: " + Rectangulo.area(ancho, alto));
                    break;
                case 0:
                    System.out.println("Salir");
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

