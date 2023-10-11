package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o seu nome");
		String nome = entrada.nextLine();
		
		entrada.close();
		}

}
