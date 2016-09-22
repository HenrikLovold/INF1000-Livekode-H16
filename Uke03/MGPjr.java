import java.util.Scanner;

class MGPjr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tall = Integer.parseInt(sc.nextLine());
		
		while(tall != 0) {
			avgiStemme(tall);
			tall = Integer.parseInt(sc.nextLine());
		}
	}
	
	public static void avgiStemme(int nr) {
		String[] artister = {"The Real Five", "Stiffy", "To små karer"};
		System.out.println("Registrert en stemme til " + artister[nr-1]);
	}
}