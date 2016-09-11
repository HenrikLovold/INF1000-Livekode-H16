import java.util.Scanner;

class Eksempel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String navn = sc.nextLine();
		
		siNavn(navn);
		siHeiTil(navn);
		siHadetTil(navn);
		
	}
		
	public static void siNavn(String bjarne) {
		System.out.println("Du heter " + bjarne);
	}
	
	public static void siHeiTil(String arne) {
		System.out.println("Hei " + arne);
	}
	
	public static void siHadetTil(String fjodor) {
		System.out.println("ha det bra " + fjodor);
	}
}