package ejercicios;

public class Ejercicio2 {
	
	private String textoInvertido = "";
	
	private char letra;
	
	public Boolean comprobarPalindromo(String texto) {
		
		for(int i = 0; i <texto.length(); i++) {
			letra = texto.charAt(i);
			textoInvertido = letra+textoInvertido;
		}
		
		if(texto.equalsIgnoreCase(textoInvertido)) {
			return true;
		} else {
			return false;
		}
	}

}
