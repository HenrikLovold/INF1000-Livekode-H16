class Deltaker {
	private String navn;
	private String sang;
	private int stemmer;

	public Deltaker(String navn, String sang) {
		this.navn = navn;
		this.sang = sang;
		this.stemmer = 0;
	}

	public void skrivInfo() {
		System.out.println("Artist: " + navn + " sang: " + sang);
	}

	public void skrivStemmer() {
		System.out.println("Antall stemmer: " + stemmer);
	}

	public void giStemme() {
		this.stemmer++;
	}
}
