class Søker {
	private String navn;
	private String sang;
	private String video;
	
	public Søker(String navn, String sang, String video) {
		this.navn = navn;
		this.sang = sang;
		this.video = video;
	}
	
	public String hentNavn() {
		return navn;
	}
	
	public String hentSang() {
		return sang;
	}
	
	public void spillVideo(int fra, int til) {
		System.out.println("Spiller " + video + " fra " 
							+ fra + " til " + til);
	}	
}