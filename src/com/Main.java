package com;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		
		int num;
		int ans;
		String[] rGames = {"P.T: Silent Hills", "Layers of Fear", "Outlast", "Phasmofobia", "Little Nightmares"};
		String[] orGames = {"Aka Manto", "The Caregiver", "Missing Children", "Night Delivery", "Yuki Onna"};
		String[] ocGames = {"Nun Massacre", "BloodWash", "Stay Out of The House", "Murder House", "Night Shift"};
		
		
		String[] cGames = {"Sekiro: Shadows Die Twice", "The Last of Us", "Death Stranding", "Resident Evil 3 Remake", "Red Dead Redemption 2"};
		String[] ncGames = {"Payday 2", "Grand Theft Auto V", "Saints Row: The Third", "Just Cause 3"};
		
		String[] owGames = {"Minecraft", "Terraria", "Stardew Valley", "The Forest", "Don't Starve"};
		String[] nowGames = {"Fall Guys: Ultimate Knockout", "Pummel Party", "Golf With Your Friends", "Project Winter"};
		
		
		System.out.println("Descubra o jogo que mais combina com voc�!");
		System.out.println("Prefere jogos de terror, a��o, ou mais casuais? (1)(2)(3)");
		
		num = sc.nextInt();
		switch(num) {
			
			case 1:
				System.out.println("Jogos com gr�ficos realistas ou est�tica retr�? (1)(2)");
				num = sc.nextInt();
				if(num == 1) {
					ans = rand.nextInt(5);
					System.out.println("Jogo recomendado: " + rGames[ans]);
				}
				else if(num == 2) {
					System.out.println("Jogos com est�tica oriental ou ocidental? (1)(2)");
					num = sc.nextInt();
					if(num == 1) {
						ans = rand.nextInt(5);
						System.out.println("Jogo recomendado: " + orGames[ans]);
					}
					else if(num == 2) {
						ans = rand.nextInt(5);
						System.out.println("Jogo recomendado: " + ocGames[ans]);
					}
				}
				break;
			
			case 2:
				System.out.println("Jogos com hist�ria cinematogr�fica? (1)Sim (2)N�o");
				num = sc.nextInt();
				if(num == 1) {
					ans = rand.nextInt(5);
					System.out.println("Jogo recomendado: " + cGames[ans]);
				}
				else if(num == 2) {
					ans = rand.nextInt(4);
					System.out.println("Jogo recomendado: " + ncGames[ans]);
				}
				break;
				
			case 3:
				System.out.println("Jogos de sobreviv�ncia em um mundo aberto? (1)Sim (2)N�o");
				num = sc.nextInt();
				if(num == 1) {
					ans = rand.nextInt(5);
					System.out.println("Jogo recomendado: " + owGames[ans]);
				}
				else if(num == 2) {
					ans = rand.nextInt(4);
					System.out.println("Jogo recomendado: " + nowGames[ans]);
				}
				break;
		}
		
	}
	
}
