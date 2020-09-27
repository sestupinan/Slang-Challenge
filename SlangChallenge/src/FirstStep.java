import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;



public class FirstStep {
	
	public static ArrayList<String> calculateNGrams(String text, int n) {
		ArrayList<String> nGrams = new ArrayList<String>();
		
		
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
