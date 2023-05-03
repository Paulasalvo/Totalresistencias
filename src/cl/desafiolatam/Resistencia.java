package cl.desafiolatam;
import java.util.Scanner;
public class Resistencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	System.out.println("Ingrese resistencia 1");	
	double resistencia1 = capturaResistencia();
	
	System.out.println("Ingrese resistencia 2");	
	double resistencia2 = capturaResistencia();
	
	System.out.println("Ingrese resistencia 3");	
	double resistencia3 = capturaResistencia();
	
	double resistenciatotal= 1/(1/resistencia1+1/resistencia2+1/resistencia3);
	
	System.out.printf("la resistencia total es igual a: %f", resistenciatotal );
	}

	public static double capturaResistencia() {
	
		Scanner sc = new Scanner (System.in);
		double resistencia; 
		do {
			resistencia = sc.nextDouble();
			if(resistencia > 0) {
				break;
				
			}
			System.out.println("Resistencia debe ser mayor a cero");	
		}while(true);
		return resistencia;
	}
	
}
