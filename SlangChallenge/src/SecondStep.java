import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;

public class SecondStep {
	
	/**
	 * Calculates the n-grams of a word
	 * @param text Word used to calculate the n-grams
	 * @param n Size of grouping for n-grams to be calculated
	 * @return List of n-grams
	 */
	public static ArrayList<String> calculateNGrams(String text, int n) {
		ArrayList<String> nGrams = new ArrayList<String>();
		int textLength = text.length();
		//Iterate over the word, until i<=textLength-n to avoid IndexOutOfBounds. Complexity:  O(n)
		for (int i = 0; i <= textLength-n; i++) {
			//For each letter in the word, get the substring from i to i+n. Complexity: O(1)
			nGrams.add(text.substring(i, i+n));
		}	
		//Global complexity: O(n)
		return nGrams;
	}
	
	/**
	 * Calculates the most frequent Ngram in a list
	 * @param nGrams ArrayList with the list of the Ngrams
	 * @return Most frequent Ngram
	 */
	public static String mostFrequentNGram(ArrayList<String> nGrams) {
		String answer = "";
		int maxReps = 0;
		Hashtable<String, Integer> hashTable = new Hashtable<String, Integer>();
		//Iterates over each of the items of the list of n-grams. 
		//Complexity: O(n) where n is the length of the list
		for (String string : nGrams) {
			//Checks if the word is already in the hash table. 
			if(!hashTable.containsKey(string))
			{
				//If it is not, adds the word and sets the number of repetitions to 1.
				//Complexity: Average=O(1), Worst case=O(n)
				hashTable.put(string, 1);
			}
			else 
			{
				//If it is, adds 1 to the number of repetitions of the word.
				//Complexity: Average=O(1), Worst case=O(n)
				hashTable.put(string, hashTable.get(string)+1);
				if(hashTable.get(string)>maxReps) {
					//Checks if the word has more repetitions than maxReps. If yes, the answer is replaced with said word.
					maxReps = hashTable.get(string);
					answer = string;
				}
			}
		}
		//Global complexity: Average=O(n) Worst case=O(n**2)
		return answer;
	}
	
	/**
	 * Main function
	 * @param args
	 * @throws IOException Error reading input
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Number of n grams:");
		int n = 0;
		n = Integer.parseInt(br.readLine());
		System.out.println("Word for the n-grams:");
		String word = br.readLine();
		ArrayList<String> nGrams = calculateNGrams(word, n);
		String ans = mostFrequentNGram(nGrams);
		System.out.println("Most frequent n-gram calculated:");
		System.out.println(ans);
		
	}
}
