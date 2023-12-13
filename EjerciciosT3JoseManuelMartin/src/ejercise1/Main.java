package ejercise1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 //creamos la variable opcion
	       int opcion;
	       //imprimimos el menu dentro de un do para crear el bucle
	       do {
	            System.out.println("Menú de operaciones:");
	            System.out.println("1. Suma");
	            System.out.println("2. Resta");
	            System.out.println("3. Multiplicación");
	            System.out.println("4. División");
	            System.out.println("5. Máximo");
	            System.out.println("6. Mínimo");
	            System.out.println("0. Salir");
	            //pedimos la opcion
	            System.out.print("Seleccione una opción: ");
	            opcion = sc.nextInt();
	            //creamos un if para crear el bucle en caso de que la opcion elegida sea erronea
	            if (opcion >= 1 && opcion <= 6) {
	            //si la opcion es valida se le piden los dos numero
	                System.out.print("Ingrese el primer número: ");
	                double num1 = sc.nextDouble();
	                System.out.print("Ingrese el segundo número: ");
	                double num2 = sc.nextDouble();
	                //creamos un swich con sus respectivos break para poder seguir 
	                switch (opcion) {
	                    case 1:
	                    	//en cada caso llamaremos a la correspondiente funcion de la clase operaciones
	                        System.out.println("Resultado: " + ClaseOperaciones.suma(num1, num2));
	                        break;
	                    case 2:
	                        System.out.println("Resultado: " + ClaseOperaciones.resta(num1, num2));
	                        break;
	                    case 3:
	                        System.out.println("Resultado: " + ClaseOperaciones.multiplicacion(num1, num2));
	                        break;
	                    case 4:
	                        if (num2 != 0) {
	                            System.out.println("Resultado: " + ClaseOperaciones.division(num1, num2));
	                        } else {
	                            System.out.println("Error: No se puede dividir por cero.");
	                        }
	                        break;
	                    case 5:
	                        System.out.println("Resultado: " + ClaseOperaciones.max(num1, num2));
	                        break;
	                    case 6:
	                        System.out.println("Resultado: " + ClaseOperaciones.min(num1, num2));
	                        break;
	                }
	                //aqui esta el caso de la opcion elegina no sea valida
	            } else if (opcion != 0) {
	                System.out.println("No entiendo esa opcion. Introduce una opcion correcta");
	            }
	        //aqui cerramos el do while con la opcion de que no sea 0 en caso de  que sea 0 se sale
	        } while (opcion != 0);

	        System.out.println("Salir");

	}

}
