package aula200_menor_tres;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num3, num1, num2, menor;
		
		System.out.print("Primeiro valor: ");
		num1 = sc.nextInt();
		System.out.print("Segundo valor: ");
		num2 = sc.nextInt();
		System.out.print("Terceiro valor: ");
		num3 = sc.nextInt();
		
		if(num1 < num2 && num1 < num3) {
			menor = num1;
		}else if(num2 < num3) {
			menor = num2;
		}else {
			menor = num3;
		}
		
		System.out.println(" MENOR = " + menor);
		
		

	}

}
