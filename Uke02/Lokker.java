class Lokker {
	public static void main(String[] args) {
		
		int tidSomHarGatt = 0;
		
		while(tidSomHarGatt < 15) {
			System.out.println("Fortsett stemmingen!!!");
			tidSomHarGatt++;
		}
		
		String[] top4 = new String[4];
		
		top4[0] = "To Smaa Karer";
		top4[1] = "2U";
		top4[2] = "@lek";
		top4[3] = "Malin Reitan";
		
		System.out.println("Vinnerene er.....øøøh");
		
		int plass = top4.length-1;
		
		while(plass >= 0) {
			System.out.println("Paa plass " + (plass+1) + " er: " + top4[plass]);
			plass--;
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}