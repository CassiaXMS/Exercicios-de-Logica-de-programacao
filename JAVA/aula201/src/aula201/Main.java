package aula201;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X,Y;
		
		System.out.println(" Digite dois numeros: ");
		X = sc.nextInt();
		Y = sc.nextInt();
		
		while(X != Y){
			if(X < Y) {
				System.out.println(" Crescente! ");
			}else {
				System.out.println(" Descrescente! ");
			}
			System.out.println(" Digite outro dois numeros: ");
			X = sc.nextInt();
			Y = sc.nextInt();
		};

	}

}
