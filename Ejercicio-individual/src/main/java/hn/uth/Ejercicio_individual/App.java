package hn.uth.Ejercicio_individual;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner scanner;

	public static void main( String[] args )
    {
    	
    	        scanner = new Scanner(System.in);
    	        int opcion;
    	        double radio,lado,base,altura;

    	        do {
    	            System.out.println("Calculadora de áreas");
    	            System.out.println("1. Calcular área de un círculo");
    	            System.out.println("2. Calcular área de un cuadrado");
    	            System.out.println("3. Calcular área de un rectángulo");
    	            System.out.println("4. Calcular área de un triángulo");
    	            System.out.println("0. Salir");

    	            System.out.print("Seleccione una opción: ");
    	            opcion = scanner.nextInt();

    	            switch (opcion) {
    	                case 1:
    	                    System.out.print("Ingrese el radio del círculo: ");
    	                    radio = scanner.nextInt();
    	                    System.out.println("El área del círculo es: " + circulo(radio));
    	                    break;
    	                case 2:
    	                    // Código para calcular el área de un cuadrado
    	                	 System.out.print("Ingrese el radio del cuadrado: ");
     	                    lado = scanner.nextInt();
     	                    System.out.println("El área del cuadrado es: " + cuadrado(lado));
    	                    break;
    	                case 3:
    	                    // Código para calcular el área de un rectángulo
    	                	System.out.print("Ingrese la base del rectangulo: ");
     	                    base = scanner.nextInt();
     	                    System.out.print("Ingrese la altura del rectangulo: ");
    	                    altura = scanner.nextInt();
     	                    System.out.println("El área del rectangulo es: " + rectangulo(base, altura));
    	                    break;
    	                case 4:
    	                    // Código para calcular el área de un triángulo
    	                	System.out.print("Ingrese la base del triangulo: ");
     	                    base = scanner.nextInt();
     	                    System.out.print("Ingrese la altura del triangulo: ");
    	                    altura = scanner.nextInt();
     	                    System.out.println("El área del triangulo es: " + triangulo(base, altura));
    	                    break;
    	                case 0:
    	                    System.out.println("Saliendo...");
    	                    break;
    	                default:
    	                    System.out.println("Opción no válida. Inténtelo de nuevo.");
    	            }
    	        } while (opcion != 0);
    	    }
    	
       
    
    
        public static double circulo(double radio) {
            return Math.PI * radio * radio;
        }
     
        public static double rectangulo(double base, double altura) {
            return base * altura;
        }
        
        public static double cuadrado(double lado) {
            return lado * lado;
        }
        
        public static double triangulo(double base, double altura) {
            return (base * altura) / 2;
        }
}
