package ejercise4;

public class Cilindro {
	//importamos las variables del main y realizamos una funcion para cada operacion del menu 
	//devuelve el resultado llamamos a la funcion PI para el calculo 
	public static double volumen(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    public static double area(double radio, double altura) {
        return 2 * Math.PI * radio * (radio + altura);
    }

}
