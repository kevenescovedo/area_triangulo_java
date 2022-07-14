package area_triangullo.com;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
	 System.out.println("-----------------------------------------------");	
     System.out.println("Programa que Calcula a Área de um triângulo ");
     System.out.println("-----------------------------------------------");	
     System.out.println("Digite a unidade de medida da base e altura do triângulo  ex (mm, cm, m, km):  ");
     String unidade_medida = scanner.next();
     System.out.println("Digite a altura do triângulo: ");
    double altura = scanner.nextDouble();
     
     System.out.println("Digite a base do triângulo: ");
     double base = scanner.nextDouble();
     double area =  calcular_area_trianulo(base, altura); 
     System.out.println("O seu triângulo tem de área: " + area + " " + unidade_medida + "²");
     
     
	}
	public static double calcular_area_trianulo(double base, double altura) {
		return (base * altura ) / 2;
	}

}
