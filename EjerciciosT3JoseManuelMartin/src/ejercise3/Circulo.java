package ejercise3;

public class Circulo {
	//importamos las variables del main y realizamos una funcion para cada operacion del menu 
		//devuelve el resultado llamamos a la funcion PI para el calculo 
	public static double circunferencia(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double area(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}
