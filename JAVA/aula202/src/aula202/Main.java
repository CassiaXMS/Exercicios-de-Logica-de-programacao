package aula202;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X,Y, i, troca,impar = 0 ;
		
		System.out.println("Digite dois numeros: ");
		X = sc.nextInt();
		Y = sc.nextInt();
		
		if(X > Y) {
			troca = X;
			X = Y;
			Y = troca;
		}

		for(i=X +1 ; i<Y; i++) {
			if(i % 2 != 0) {
				impar = impar + i;
			}
		}
		System.out.println(" SOMA IMPARES = " + impar);
	}

}
