import java.util.Random;
class Mgp {
	public static void main(String[] args) {
		Random r = new Random();

		Deltaker s = new Deltaker("Stiffy", "Respekt");
		Deltaker m = new Deltaker("Mathea-Mari", "#online");
		Deltaker b = new Deltaker("Blacksheeps", "Oro jaska, beana");

		System.out.println("Årets deltakere er:");
		s.skrivInfo();
		m.skrivInfo();
		b.skrivInfo();

		System.out.println("Start stemming!!");

		for(int i = 0; i < 1000000; i++) {
			int stemme = r.nextInt();
			if((stemme % 3) == 0) {
				s.giStemme();
			} else if ((stemme % 3) == 1) {
				m.giStemme();
			} else {
				b.giStemme();
			}
		}

		System.out.println("Resultater:\n");
		s.skrivInfo();
		s.skrivStemmer();

		m.skrivInfo();
		m.skrivStemmer();

		b.skrivInfo();
		b.skrivStemmer();

	}
}
