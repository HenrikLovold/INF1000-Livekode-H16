import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

class MGP {
	public static void main(String[] args) throws Exception {
		ArrayList<Søker> søkere = new ArrayList<Søker>();
		
		Scanner sc = new Scanner(new File("deltakere.txt"));
		while(sc.hasNextLine()){
			String n = sc.nextLine();
			String l = sc.nextLine();
			String v = sc.nextLine();
			Søker ny = new Søker(n, l, v);
			søkere.add(ny);
		}
		
		for(int i = 0; i < søkere.size(); i++) {
			System.out.println("Søker:");
			System.out.println("Navn: " + søkere.get(i).hentNavn());
			System.out.println("Sang: " + søkere.get(i).hentSang());
			søkere.get(i).spillVideo(30, 45);
			System.out.println("");
		}
	}
}
