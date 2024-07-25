import java.util.Scanner;

public class TiposDatos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int edad;
        boolean empleado = true;
        
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();

        entrada.nextLine();
        
        System.out.print("Ingrese su salario mensual: ");
        double salario = entrada.nextDouble();
       

        System.out.print("Ingrese genero (M/F): ");
        char genero = entrada.next().charAt(0);
        
        
        double salarioAnual= salario*12;
        
        
        System.out.println("\nDatos personales");
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario Mensual: "+ salario);
        System.out.println("Empleado: " + empleado);
        System.out.println("Salario Anual: " + salarioAnual);

        entrada.close();
    }
}
