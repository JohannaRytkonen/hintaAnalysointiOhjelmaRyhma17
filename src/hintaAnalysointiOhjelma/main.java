package hintaAnalysointiOhjelma;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// lukee hintatiedot tiedostosta ja laskee keskiarvon
		Scanner lukija = new Scanner(System.in);
		
		System.out.print("Tidedosto polku: ");
		String polku = lukija.nextLine();
		
		ArrayList<PriceTick> hintaRivit = ParseManager.jasennaTiedostorivitOlioiksi(FileManager.tiedostonLuku(polku));
		
		ComputationResult computationResult = new ComputationResult();
		
		computationResult.setKesikarvoSulkemisHinta(hintaRivit);
		computationResult.setKesikarvoAvausHinta(hintaRivit);
		computationResult.setKesikarvoKorkeinHinta(hintaRivit);
		computationResult.setKesikarvoMatalinHinta(hintaRivit);
		
		computationResult.setKeskihajontaSulkemisHinta(hintaRivit);
		computationResult.setKeskihajontaAvausHinta(hintaRivit);
		computationResult.setKeskihajontaKorkeinHinta(hintaRivit);
		computationResult.setKeskihajontaMatalinHinta(hintaRivit);
		
		System.out.println(computationResult.toString());
	}

}
