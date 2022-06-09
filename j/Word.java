

public class Word {

	public static void main(String[] args) {
		Word word = new Word("Hello World");
		System.out.println(word.isVowel(0));
		System.out.println(word.isVowel(1));
		System.out.println(word.isConsonant(0));
		System.out.println(word.isConsonant(1));
	}
		private String letters;
		
		public Word(String letters) {
			this.letters = letters.toLowerCase();
		}
		//aiueo
		public boolean isVowel(int i) {
			return "aiueo".contains(letters.substring(i, i + 1));
		}
		
		public boolean isConsonant(int i) {
			return !isVowel(i);
		}

	}
