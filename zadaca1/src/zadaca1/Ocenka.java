package zadaca1;

import java.util.Scanner; 
public class Ocenka {
	public static void main(String[] args){
		
		double max = 0, bodovi = 0, procent = 0;
		Scanner tastatura = new Scanner (System.in); 
		System.out.println ("Vnesete go maksimalnit broj na bodovi na testot") ;
		max = tastatura.nextDouble();
		System.out.println ("Veneset go brojot na bodovi koi gi dobil studentot");
		bodovi=tastatura.nextDouble();
		procent=bodovi/max*100;
		if(bodovi>max){
			System.out.println ("Studentot gi nadimal standartite, no za zal tolko poeno ne moze da dobie");
			System.exit (0);
		}
		if (procent<51){
			System.out.println ("Studentot padnal");
		}
		else if (procent<=60 && procent >=51){
	    System.out.println("Studentot dobil 6");
		} 


else if (procent<=70 && procent >=61) {
	System.out.println ("Studentot dobil 7");
}
else if (procent<=80 && procent >=71) {
	System.out.println ("Studentot dobil 8");
}
else if (procent<=90 && procent >=81) {
	System.out.println ("Studentot dobil 9");
}
else if (procent<=100 && procent >=91) {
	System.out.println ("Studentot dobil 10");
}
	}
}

