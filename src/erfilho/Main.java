package erfilho;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scam = new Scanner(System.in);
		
		// Quantidade colocada na mesa pelo usuário
		System.out.println("Digite sua quantidade: ");
		int user = scam.nextInt();
		
		// Aposta total do usuário
		System.out.println("Digite sua aposta: ");
		int res = scam.nextInt();
		
		// Quantidade máxima de aposta do robô
		int max_robot = 3;
		
		// Quantidade colocada na mesa pelo robô
		int robot = rand.nextInt(max_robot);
		
		// Quantidade apostada pelo robô
		int robot_aposta = rand.nextInt(max_robot*2);
		
		if(res == (robot+user)) {
			System.out.println("Você ganhou, total de: " + (robot+user));
		} else if (robot_aposta == (robot+user)) {
			System.out.println("Robô ganhou, total de: " + (robot+user));
		} else {
			System.out.println("Ninguém ganhou, total de: " + (robot+user) + "\nRobô apostou: " + robot_aposta);
		}
		
		scam.close();
		
	}
}
