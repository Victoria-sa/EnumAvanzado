package com.cursoceatController;

import java.util.Scanner;

import com.cursoceat.model.Iva;



public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector= new Scanner(System.in);
		int opcion = 6;
	
		do {
			System.out.println("** Indique e articulo a Pagar **");
			System.out.println("   1. Aceite de Oliva ");					
			System.out.println("   2. Leche ");
			System.out.println("   3. Cerveza ");
			System.out.println("   4. Mascarilla Quirurjica ");
			System.out.println("   5. Queso ");
			System.out.println("   6. Salir ");
			System.out.println("  Indique su opcion -> ");
			opcion=lector.nextInt();
			double precio=0;
			if (opcion!=6) {
				System.out.println("indique el Precio -> ");//leemos con codigo de barras	
		 precio=lector.nextDouble();
			
			
				
			}
			switch (opcion) {
			case 1-> {			
		    	Iva impuesto=Iva.OTROS;
		    	calcularTotal(precio,impuesto.getPorcentaje());
			}
			case 2-> {
				Iva impuesto=Iva.ALIMENTACION;
				calcularTotal(precio, impuesto.getPorcentaje());
			}
			case 3-> {
				Iva impuesto=Iva.NORMAL;
				calcularTotal(precio, impuesto.getPorcentaje());
				
			}
			case 4-> {
				Iva impuesto=Iva.MEDICINAS;
				calcularTotal(precio, impuesto.getPorcentaje());
				
			}
			case 5-> {
				Iva impuesto=Iva.EXCENTO;
				calcularTotal(precio, impuesto.getPorcentaje());
				
			}
			case 6-> {
				System.out.println(" Chao ...Chao...");
			}
			default->System.out.println(" Error de Entrada ");
			}
			
			
			
			
		}while(opcion!=6);
			
		
		
		
	}
	static void calcularTotal(double precio,double porcentaje) {
		double iva=(porcentaje +100) / 100;
		System.out.printf("El importe a pagar es %.2f", precio*iva);
		System.out.println();
	}
		
		
		

	}


