
public class DMVSimulator {

	public static void main(String[] args) {
		int userNumber = (int)(Math.random() * 100 + 101);
		System.out.println("Welcome to the DMV. \nYour number is " + userNumber + 
				". \nPlease wait until your number is called.");
		
		int currentNumber = userNumber + 1;
		while (!(currentNumber == userNumber)) {
			if (currentNumber <= 200) {
				System.out.println("Calling number " + currentNumber);
				currentNumber++;
			}
			else {
				currentNumber = 100;
				System.out.println("Calling number " + currentNumber);
				currentNumber++;
			}
		}
		System.out.println("Calling number " + userNumber);

		int miracle = (int)(Math.random() * 100);
		if (miracle == 1) {
			System.out.println("Your paperwork is in order, you are all set.");
		}
		else {
			System.out.println("You don't even have the required paperwork, get outta my sight you shmuck. HAHAHAHAHAHA");
		}

	}
}
