public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "Thank God it's Tuesday";
		System.out.println(message);
		countLetters(message);
	}

	private void countLetters(String message) {
		int letters = message.length;
		weirdPrediction(letters);
	}

	private void weirdPrediction(int days) {
		System.out.println("Your birthday is in " + days + " days.");
	}
}
