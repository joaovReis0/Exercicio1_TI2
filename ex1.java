package ex1;

import java.util.Scanner;

class ex1 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2;
		
		//leitura 
		System.out.println("Informe o primeiro número:");
		num1=sc.nextInt();
		System.out.println("Informe o segundo número:");
		num2 = sc.nextInt();
		
		//somar
		int soma = 0;
		soma = num1+num2;
		
		//saída
		System.out.println("Soma dos números: " + soma);
	}

}
