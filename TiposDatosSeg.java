import java.util.Scanner;

public class TiposDatosSeg {
	
	  public static void main(String[] args) {
		  // Declaración de variables
	        String nombre;
	        double peso;
	        double altura;

	        
	        Scanner entrada = new Scanner(System.in);

	        
	        System.out.print("Ingrese su nombre: ");
	        nombre = entrada.nextLine();

	        
	        System.out.print("Ingrese su peso en kilogramos: ");
	        while (!entrada.hasNextDouble()) {
	            System.out.println("Por favor, ingrese un número válido para el peso.");
	            entrada.next(); 
	        }
	        peso = entrada.nextDouble();

	        
	        entrada.nextLine();

	        
	        System.out.print("Ingrese su altura en metros: ");
	        while (!entrada.hasNextDouble()) {
	            System.out.println("Por favor, ingrese un número válido para la altura.");
	            entrada.next(); 
	        }
	        altura = entrada.nextDouble();

	        
	        double imc = peso / (altura * altura);

	        
	        String categoria;
	        if (imc < 18.5) {
	            categoria = "Bajo peso";
	        } else if (imc >= 18.5 && imc < 24.9) {
	            categoria = "Normal";
	        } else if (imc >= 25 && imc < 29.9) {
	            categoria = "Sobrepeso";
	        } else {
	            categoria = "Obesidad";
	        }

	        
	        System.out.printf("\n"+nombre+", su IMC es: "+ imc);
	        System.out.println("\nCategoría: " + categoria);

	        
	        entrada.close();
	}

}
