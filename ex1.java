package ex1;

import java.util.Scanner;

class ex1 {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int num1, num2;
		
		//leitura 
		System.out.println("Informe o primeiro n�mero:");
		num1=sc.nextInt();
		System.out.println("Informe o segundo n�mero:");
		num2 = sc.nextInt();
		
		//somar
		int soma = 0;
		soma = num1+num2;
		
		//sa�da
		System.out.println("Soma dos n�meros: " + soma);
	}

}
