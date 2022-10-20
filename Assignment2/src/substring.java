
class substring {

	public substring() {
		// Search Later words in text
	}

	public static void main(String[] args) {
	 System.out.println(fetchLaterWordForAnEnteredChar("Hello World!", "r")); //example 1
	 System.out.println(fetchLaterWordForAnEnteredChar("Hello World!", "o")); //example 2
	 

	}

	public static String fetchLaterWordForAnEnteredChar(String sentence,String letter) {
		int firstIndex= sentence.indexOf(letter);
		return sentence.substring(firstIndex +1);
		
	}

}
