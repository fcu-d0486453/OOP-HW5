package fcu.iecs.oop.pokemon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Pokemon EigSev = new Pokemon("GGDaDa", 87);
		Pokemon SevEig = new Pokemon("XiaoGG", 8787);

		Scanner sc = new Scanner(System.in);
		String order;
		while (true) {
			System.out.print("Player One: " + EigSev.getName());
			System.out.println("  || CP = " + EigSev.getCp());
			System.out.print("Player Two: " + SevEig.getName());
			System.out.println("  || CP = " + SevEig.getCp());

			System.out.println("=====Start Fight!=====");
			GYM.fight(EigSev, SevEig);
			System.out.println("=================================");

			System.out.println("Do you want to continue fighting?(Y/N)");

			order = sc.nextLine();
			if (order.equals("Y") || order.equals("y"))
				continue;
			else
				break;
		}
		System.out.println("End");

		sc.close();
	}

}
