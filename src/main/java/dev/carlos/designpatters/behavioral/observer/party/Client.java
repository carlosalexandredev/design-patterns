package dev.carlos.designpatters.behavioral.observer.party;


import dev.carlos.designpatters.behavioral.observer.party.characters.Doorman;
import dev.carlos.designpatters.behavioral.observer.party.characters.Wife;

public class Client {

	public static void main(String[] args) {
		Doorman reception = new Doorman();
		Wife wife = new Wife(reception);
		
		wife.startPartyIfPossible();
		
		System.out.println("5 minutes later...");
		wife.startPartyIfPossible();
		
		System.out.println("5 minutes later...");
		wife.startPartyIfPossible();
		
		System.out.println("5 minutes later...");
		wife.startPartyIfPossible();
		
		System.out.println("5 minutes later...");
		wife.startPartyIfPossible();
		
		System.out.println("Husband is comming");
		reception.setStatus(true);
		
		System.out.println("5 minutes later...");
		wife.startPartyIfPossible();
	}
}
