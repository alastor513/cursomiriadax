package com.prueba.ejemplo;
import java.util.Scanner;

public class caso1 {

	public static void main(String[] args) {
		int int_Valor1=0,int_Valor2=0 ;
		float fl_Valor1=0;
		String str_Valor1="",str_Valor2="";
		Scanner teclado = new Scanner(System.in);
		System.out.print("teclea un valor1 entero: ");
		int_Valor1=teclado.nextInt();
		System.out.print("teclea un valor2 entero: ");
		int_Valor2=teclado.nextInt();
		System.out.print("teclea un numero flotante: ");
		fl_Valor1=teclado.nextInt();
		System.out.print("teclea una cadena de caracteres1: ");
		teclado.nextLine();
		str_Valor1=teclado.nextLine();
		System.out.print("teclea una cadena de caracteres1: ");
		str_Valor2=teclado.nextLine();
		System.out.printf("%1d %2d %3f %4s %5S",int_Valor1,int_Valor2,fl_Valor1,str_Valor1,str_Valor2);	
		
		
	}

}
