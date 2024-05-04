package b6_java_homeowork_oop_atm_machine;
import java.math.BigDecimal;
import java.util.Scanner;


public class ATMMachineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------- Hello to ATM App -----");
		Card card1 = new Card("VINH", "001", "123", 2000.00);
		Card card2 = new Card("JOHN", "002", "456", 3000.00);
		Card card3 = new Card("DAVID", "003", "789",4000.000);
		
		
		
		// CardList will add all of cards inside
//		System.out.println(card1.toString());
		
		// user input the card number and pin number
		Card[] cardList = {card1, card2,card3};
		
		// show card list and ask the user input card number and pin
		int cardIndex = isValidateCardAndPINReturnCardIndex(cardList);
		System.out.println(cardIndex);
		// ask user user select option after login successful
//		showCardNumAndGetUserSelectedOption(cardIndex, cardList);
		
		// reduce HARDCODE 
		final int VIEW_BALANCE = 1; // constant - can not change 
		final int DEPOSIT = 2;
		final int WITHDRAW = 3;
		final int TRANSFER = 4;
		final int LOGOUT = 5;
		
		int option = showCardNumAndGetUserSelectedOption(cardIndex, cardList);

		 // switch case
		do {
			switch (option) {
			
			case VIEW_BALANCE: {
//				System.out.println(cardList[cardIndex]);
				System.out.println("Your Balance: " + cardList[cardIndex].getBalance());
				option = showCardNumAndGetUserSelectedOption(cardIndex, cardList); // ask user input option 
				break;
			}
			
			case DEPOSIT: {
				getUserDespositeAmountAndUpdateBalanceAmount(cardIndex, cardList);
				option = showCardNumAndGetUserSelectedOption(cardIndex, cardList); // ask user input option 
				
				break;
			}
			
			case WITHDRAW: {
				getUserWithdrawAmountAndUpdateBalanceAmount(cardIndex, cardList);
				option = showCardNumAndGetUserSelectedOption(cardIndex, cardList); // ask user input option 
				break;
			}
			case TRANSFER: {
			
				transfer(cardIndex, cardList);
				option = showCardNumAndGetUserSelectedOption(cardIndex, cardList); // ask user input option 
				break;
			}
			case LOGOUT: {
				System.out.println("Your Logout Successfully");
				cardIndex = isValidateCardAndPINReturnCardIndex(cardList);
				System.out.println("cardIndex: " + cardIndex);
				option = showCardNumAndGetUserSelectedOption(cardIndex, cardList);
				break;
			}
		
			default:
				break;
			}
		}while(true);
		

		
		
	}

		
		
	
	
	
	// check card is valid or not
	public static int isValidateCardAndPINReturnCardIndex(Card[] cardList) {
		
		boolean isValid = false;
		int cardIndex = 0;
		System.out.println("Card List: ");
		for(int i = 0; i < cardList.length; i++) {
			System.out.println(i + 1 + " :" + cardList[i].cardNumber);
		}
		
		// INFINITIVE LOOP if user input wrong cardNumber and Password
		do
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("===== MAIN MENU =======");
			System.out.print("Please input card number: ");
			String cardNumber = scanner.nextLine();
			System.out.print("Please input pin number: ");
			String pin = scanner.nextLine();
			
			// Check the CardNumber user input valid or not
			for(int i = 0; i < cardList.length; i++) {
				if(cardNumber.equals(cardList[i].cardNumber) && pin.equals(cardList[i].pin)) {
					cardIndex = i;
					isValid = true;
				}
				
			}
			
			// return the mess if unvalid card
			if(isValid == false) {
				System.out.println("--- LGOIN UNSUCCESSFUL ! Please input again ---");
			}
			
		}while(isValid == false);
		
		return cardIndex;
		
//		System.out.println("Please select a course view detail !!!");
//		Scanner scanner = new Scanner(System.in);
//		return scanner.nextInt() - 1; // user select 2 mean course[1] index
	}
	
	// ask the user select the option if login successful
	public static int showCardNumAndGetUserSelectedOption(int cardIndex, Card[] cardList) {
		System.out.println("o0o === YOUR CURRENT LOGIN CARD: " +  cardList[cardIndex].cardNumber + " === o0o");
		System.out.println("----- OPTION ---------");
		System.out.println("1. View Blance");
		System.out.println("2. Deposite");
		System.out.println("3. Withdraw");
		System.out.println("4. Transfer");
		System.out.println("5. Logout");
		System.out.print("Please select an option: ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt(); // user select 2 mean course[1] index
	}
	
	// DEPOSIT option
	
	public static void getUserDespositeAmountAndUpdateBalanceAmount(int cardIndex, Card[] cardList) {
	
		System.out.print("Please input the ammount to deposit: ");
		Scanner scanner = new Scanner(System.in);
		double amountDeposite = scanner.nextDouble();
		cardList[cardIndex].setBalance(1,amountDeposite);
		System.out.println("Your balance have been updated !");
	
	}
	
	// WITHDRAW option
	
	public static void getUserWithdrawAmountAndUpdateBalanceAmount(int cardIndex, Card[] cardList) {
	
		System.out.print("Please input the ammount to deposit: ");
		Scanner scanner = new Scanner(System.in);
		double amountWithDraw = scanner.nextDouble();
		cardList[cardIndex].setBalance(2, amountWithDraw);
		System.out.println("Your balance have been updated !");
	
	}
	
	// Transfer
	public static int getUserTransferAccountIndex(Card[] cardList) {
		// Check the CardNumber user input valid or not
		int transferAccountIndex = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input card number: ");
		String cardNumber = scanner.nextLine();
		for(int i = 0; i < cardList.length; i++) {
			if(cardNumber.equals(cardList[i].cardNumber)) {
				transferAccountIndex = i;
			}
			
		}
		return transferAccountIndex;
	}
	// TRANSFER
	public static void transfer(int cardIndex, Card[] cardList) {
		int transferAccountIndex = getUserTransferAccountIndex(cardList);
		System.out.println("Your are tranfer for " + cardList[transferAccountIndex].cardNumber);
		System.out.print("Please input the ammount for transfer: ");
		Scanner scanner = new Scanner(System.in);
		double amountTranfer = scanner.nextDouble();
		// - amount in account transfer
		cardList[cardIndex].setBalance(2, amountTranfer);
		
		// update: + account for account transfer 
		cardList[transferAccountIndex].setBalance(1, amountTranfer);
		
		System.out.println("Your are transfer successfully ");
		
	}
	

}
