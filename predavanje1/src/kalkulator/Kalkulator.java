package kalkulator;

import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vnesite go prviot broj:");
		double a = input.nextDouble();
		System.out.println("Vnesi ja vtorati broj:");
		double b = input.nextDouble();
		System.out.println("Vnesi operacija (+, -, *, /):");
		String operacija = input.next();
		double c;
		switch (operacija){
		case "+":
			c = a + b;
			System.out.println(a + " " + operacija + " " + b + " = " + c);
			break;
		case "-":
			c = a - b;
			System.out.println(a + " " + operacija + " " + b + " = " + c);
			break;
		case "*":
			c = a * b;
			System.out.println(a + " " + operacija + " " + b + " = " + c);
			break;
		case "/":
			if (b != 0) {
				c = a / b;
				System.out.println(a + " " + operacija + " " + b + " = " + c);
			} else {
				System.out.println("Ne mozhe da se deli so nula!");
			}
			break;
		default:
			System.out.println("Nevalidna operacija!");
		}
		 while (radi) {
	            System.out.println("\n=== MENI KALKULATORA ===");
	            System.out.println("1. Sabiranje");
	            System.out.println("2. Oduzimanje");
	            System.out.println("3. Množenje");
	            System.out.println("4. Dijeljenje");
	            System.out.println("5. Izlaz");
	            System.out.print("Izberi opciju (1-5): ");
	            
	            int izbor = input.nextInt();

	            if (izbor == 5) {
	                System.out.println("Izlaz iz programa. Doviduvanje!");
	                radi = false;
	                break;
	            }

	            System.out.print("Vnesi prvi broj: ");
	            a = input.nextDouble();
	            System.out.print("Vnesi vtori broj: ");
	            b = input.nextDouble();


	           
	                    Scanner input = new Scanner(System.in);
	                    boolean radi = true; // dodano
	                    double a, b, rezultat; // rezultat sada postoji

	                    while (radi) {
	                        System.out.println("\n=== MENI KALKULATORA ===");
	                        System.out.println("1. Sabiranje");
	                        System.out.println("2. Oduzimanje");
	                        System.out.println("3. Množenje");
	                        System.out.println("4. Dijeljenje");
	                        System.out.println("5. Izlaz");
	                        System.out.print("Izberi opciju (1-5): ");
	                        
	                        int izbor = input.nextInt();

	                        if (izbor == 5) {
	                            System.out.println("Izlaz iz programa. Doviduvanje!");
	                            radi = false;
	                            break;
	                        }

	                        System.out.print("Vnesi prvi broj: ");
	                        a = input.nextDouble();
	                        System.out.print("Vnesi vtori broj: ");
	                        b = input.nextDouble();

	                        switch (izbor) {
	                            case 1:
	                                rezultat = a + b;
	                                System.out.println("Rezultat: " + a + " + " + b + " = " + rezultat);
	                                break;
	                            case 2:
	                                rezultat = a - b;
	                                System.out.println("Rezultat: " + a + " - " + b + " = " + rezultat);
	                                break;
	                            case 3:
	                                rezultat = a * b;
	                                System.out.println("Rezultat: " + a + " * " + b + " = " + rezultat);
	                                break;
	                            case 4:
	                                if (b != 0) {
	                                    rezultat = a / b;
	                                    System.out.println("Rezultat: " + a + " / " + b + " = " + rezultat);
	                                } else {
	                                    System.out.println("Greska: ne moze se dijeliti s nulom!");
	                                }
	                                break;
	                            default:
	                                System.out.println("Nevalidna opcija! Pokusaj ponovo.");
	                        }
	                    }

	                    input.close();
	                }
	            

	            }

		input.close();
	}
}
