package com.prueba.ejemplo;
import java.util.Scanner;

public class caso1 {

	public static void main(String[] args) {
		int int_Valor1=0,int_Valor2=0,resto=0 ;
		float fl_Valor1=0,suma=0,division=0;
		String str_Valor1="",str_Valor2="",concatenacion="";
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
		System.out.print("teclea una cadena de caracteres2: ");
		str_Valor2=teclado.nextLine();
		System.out.printf("%1d %2d %3f %4s %5S \n",int_Valor1,int_Valor2,fl_Valor1,str_Valor1,str_Valor2);	
		suma = int_Valor1+int_Valor2+fl_Valor1;
		System.out.printf("La suma de los 3 numero es: %1f \n",suma);
		if(int_Valor1>int_Valor2){
			System.out.printf("El numero mayor es: %1d \n",int_Valor1);
		}
		else if (int_Valor1==int_Valor2){
			System.out.printf("Los valores enteros son iguales \n");
		}
		else{
			System.out.printf("El numero mayor es: %1d \n",int_Valor2);
		}
		resto=int_Valor1%int_Valor2;
		division= fl_Valor1 /resto;
		System.out.printf("la division del resto de los dos enteros con el float es: %1f \n",division);
		concatenacion= str_Valor1 + str_Valor2;
		System.out.printf("%1s",concatenacion); 
	}
}

