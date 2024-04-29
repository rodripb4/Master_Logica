package ejercicios;

public class Ejercicio6 {

	public String lado(Integer numero) {
		String lado = "";
		
		for(int i=0; i<numero; i++) {
			lado += "*";
		}
		
		return lado;
	}
	
	public String cuadrado(Integer numero) {
		String dibujo = lado(numero) + "\n";
		
		String contenido = "";
		
		for(int i = 0; i < (numero - 2); i++) {
			contenido = "*";
			
			for(int x = 0; x<(numero - 2); x++) {
				contenido += " ";
			}
			
			contenido += "*";
			
			dibujo += contenido + "\n";
		}
		
		dibujo += lado(numero);
		
		return dibujo;
	}
}
