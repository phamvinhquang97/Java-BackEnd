package b6_java_homeowork_oop_atm_machine;
import java.math.BigDecimal;

public class Card {
	// FIELD
	String holderName;
	String cardNumber;
	String pin;
	private double balance;
	// Card List will contain the list of card
		
	@Override
	public String toString() {
		return "Card\n- holderName: " + holderName + "\n- cardNumber: " + cardNumber +"";
	}
	
	// ---- CONSTRUCTOR ------
	public Card(String holderName, String cardNumber, String pin, double balance) {
		super();
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.pin = pin;
		this.balance = balance;

	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(int option, double ammount) {
		switch (option) {
		case 1:
			this.balance += ammount;
			break;
		case 2:
			this.balance -= ammount;
			break;
		default:
			break;
		}
	}
	

	
	// GETTER AND SETTER
	
	
	//  --------- METHOD --------------
	
	// Check the user input cardNumber and Pin
//	public void checkCardNumberandAskUserInputAgainIfUnvalid() {
//		
//	}
	
	
	
}
