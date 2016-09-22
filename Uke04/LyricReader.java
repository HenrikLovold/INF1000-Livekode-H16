import java.util.Scanner;
import java.io.File;

class LyricReader {
	public static void main(String[] args) throws Exception {
		Scanner fil = new Scanner(new File("mgp.lyrics"));
		String[] linjer = new String[93];
		
		int teller = 0;
		while(fil.hasNextLine()) {
			linjer[teller] = fil.nextLine();
			teller++;
		}
		
		for(int i = 1; i < linjer.length; i+= 2) {
			System.out.println(linjer[i]);
		}
	}
}