package ejercicios;

public class Ejercicio {
	
	private Integer result = null;

	public void multiplicacion(int number) {
		
		for(int i = 1; i <= 10; i++) {
			result = null;
			result = i*number;
			
			System.out.println(i + " x " + number + " = " + result);
		}
	}
}
