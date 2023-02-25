package dev.carlos.designpatters.behavioral.chain.billsDispenser;

public class Dispenser {
	
	public void withdraw(Integer ammount) {
		Integer remaining = ammount;
		System.out.println("Calculando notas para R$" + ammount);
		if(remaining >= 50) {
			int bills = remaining / 50;
			remaining %= 50;
			System.out.println(String.format("- %d notas de R$%d, R$%d sobrando", bills, 50, remaining));
		}
		if(remaining >= 10) {
			int bills = remaining / 10;
			remaining %= 10;
			System.out.println(String.format("- %d notas de R$%d, R$%d sobrando", bills, 10, remaining));
		}
		if(remaining >= 1) {
			int bills = remaining / 1;
			remaining %= 1;
			System.out.println(String.format("- %d notas de R$%d, R$%d sobrando", bills, 1, remaining));
		}
	}
}
