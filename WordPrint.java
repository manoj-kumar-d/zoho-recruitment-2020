package round.one;

public class WordPrint {

	public static void main(String[] args) {
		printWord("WELCOME");
		printWord("WATER");
	}
	
	private static void printWord(String word) {
		
		char[] characters = word.toCharArray();
		
		int length = word.length();
		
		//assuming only odd letter count
		int midIndex =  (word.length() / 2);
		boolean flag = false;
		int a= 0;
		for(int i=0;i<length;i++) {
			System.out.println(" ");
			for(int j = midIndex; j<(midIndex+i) && j<length; j++) {
				System.out.print(characters[j]);
				if(j==(length-1)) {
					flag = true;
					a++;
				}
			}
			if(flag) {
				for(int k = 0; k < a;k++) {
					System.out.print(characters[k]);
				}
			}
		}
		
		
	}
}
