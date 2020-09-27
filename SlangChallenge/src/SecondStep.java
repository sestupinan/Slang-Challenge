import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SecondStep {
	
	public static ArrayList<String> calculateNGrams(String text, int n) {
		ArrayList<String> nGrams = new ArrayList<String>();
		char[] characters = text.toCharArray();
		for (int i = 0; i < characters.length; i++) {
			
		}
		return nGrams;
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		n = Integer.parseInt(br.readLine());
		String word = br.readLine();
		ArrayList<String> rta = calculateNGrams(word, n);
		
	}
}
