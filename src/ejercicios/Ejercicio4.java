package ejercicios;

public class Ejercicio4 {

	public void invertir(String texto) {
		String invertido = "";
		
		for(int i=0; i<texto.length(); i++) {
			char letra = texto.charAt(i);
			invertido = letra + invertido;
		}
		
		System.out.println(invertido);
	}
}
