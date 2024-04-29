package ejercicios;

public class Ejercicio3 {
	
	private Integer contador = 0;
	
	private String palabras [];

	public Integer contadorDePalabras(String palabra, String texto) {
		
		String textoSinComas = texto.replace(",", " ");
		String textoSinPuntos = textoSinComas.replace(".", " ");
		String textoFinal = textoSinPuntos.replace(";", " ");
		
		
		palabras = textoFinal.split(" ");
		
		for(int i = 0; i<palabras.length; i++) {
			if(palabra.equals(palabras[i].toLowerCase())) {
				contador ++;
			}
			//System.out.println(palabras[i].trim());
		}
		
		
		return contador;
	}
}
