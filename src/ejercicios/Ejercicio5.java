package ejercicios;

public class Ejercicio5 {

	public void tantoPorCiento(Integer porciento, Integer numero) {
		Double porcentaje = (double) (numero * porciento) / 100;
		
		System.out.println("El " + porciento + "% de "+ numero + " es: "+porcentaje);
	}
}