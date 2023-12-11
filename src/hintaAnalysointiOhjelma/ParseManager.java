package hintaAnalysointiOhjelma;

import java.util.ArrayList;

public class ParseManager {
	public static ArrayList<PriceTick> jasennaTiedostorivitOlioiksi(ArrayList<String> tiedostonSisalto) {
		ArrayList<PriceTick> hintaRivit = new ArrayList<>();
		
		for (int i = 1; i < tiedostonSisalto.size(); i++) {
			String rivi = tiedostonSisalto.get(i);
			
			String[] osat = rivi.split(";");
			
			PriceTick paivanHinnat = new PriceTick();
			
			paivanHinnat.setSulkemisHinta(Double.parseDouble(osat[1]));
			paivanHinnat.setAvausHinta(Double.parseDouble(osat[2]));
			paivanHinnat.setKorkeinHinta(Double.parseDouble(osat[3]));
			paivanHinnat.setMatalinHinta(Double.parseDouble(osat[4]));
			
			hintaRivit.add(paivanHinnat);
		}
		
		return hintaRivit;
	}
}
