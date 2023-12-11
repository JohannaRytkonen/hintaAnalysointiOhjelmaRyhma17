package hintaAnalysointiOhjelma;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ComputationResult {
	// TODO: luokka, joka laskee kokonaisuuden. Esim. keskiarvo
	private double kesikarvoSulkemisHinta;
	private double kesikarvoAvausHinta;
	private double kesikarvoKorkeinHinta;
	private double kesikarvoMatalinHinta;

	private double keskihajontaSulkemisHinta;
	private double keskihajontaAvausHinta;
	private double keskihajontaKorkeinHinta;
	private double keskihajontaMatalinHinta;

	@Override
	public String toString() {
		DecimalFormat decimaaliFormatoija = EnvManager.getDesimaaliFormatoija();
		StringBuilder rakentaja = new StringBuilder();
		
		rakentaja.append("Kesikarvo sulkemis hinta: ");
		rakentaja.append(decimaaliFormatoija.format(kesikarvoSulkemisHinta));
		rakentaja.append("\nKesikarvo avaus hinta: ");
		rakentaja.append(decimaaliFormatoija.format(kesikarvoAvausHinta));
		rakentaja.append("\nKesikarvo korkein hinta: ");
		rakentaja.append(decimaaliFormatoija.format(kesikarvoKorkeinHinta));
		rakentaja.append("\nKesikarvo matalin hinta: ");
		rakentaja.append(decimaaliFormatoija.format(kesikarvoMatalinHinta));
		
		rakentaja.append("\nKeskihajonta sulkemis hinta: ");
		rakentaja.append(decimaaliFormatoija.format(keskihajontaSulkemisHinta));
		rakentaja.append("\nKeskihajonta avaus hinta: ");
		rakentaja.append(decimaaliFormatoija.format(keskihajontaAvausHinta));
		rakentaja.append("\nKeskihajonta korkein hinta: ");
		rakentaja.append(decimaaliFormatoija.format(keskihajontaKorkeinHinta));
		rakentaja.append("\nKeskihajonta matalin hinta: ");
		rakentaja.append(decimaaliFormatoija.format(keskihajontaMatalinHinta));
		
		return rakentaja.toString();
	}

	public double getKesikarvoSulkemisHinta() {
		return kesikarvoSulkemisHinta;
	}

	public void setKesikarvoSulkemisHinta(ArrayList<PriceTick> paivaHintaRivit) {
		double ekaSumma = 0;

		for (PriceTick paivanHinta : paivaHintaRivit) {
			ekaSumma += paivanHinta.getSulkemisHinta();
		}

		kesikarvoSulkemisHinta = ekaSumma / paivaHintaRivit.size();
	}

	public double getKesikarvoAvausHinta() {
		return kesikarvoAvausHinta;
	}

	public void setKesikarvoAvausHinta(ArrayList<PriceTick> paivaHintaRivit) {
		double ekaSumma = 0;

		for (PriceTick paivanHinta : paivaHintaRivit) {
			ekaSumma += paivanHinta.getAvausHinta();
		}

		kesikarvoAvausHinta = ekaSumma / paivaHintaRivit.size();
	}

	public double getKesikarvoKorkeinHinta() {
		return kesikarvoKorkeinHinta;
	}

	public void setKesikarvoKorkeinHinta(ArrayList<PriceTick> paivaHintaRivit) {
		double ekaSumma = 0;

		for (PriceTick paivanHinta : paivaHintaRivit) {
			ekaSumma += paivanHinta.getKorkeinHinta();
		}

		kesikarvoKorkeinHinta = ekaSumma / paivaHintaRivit.size();
	}

	public double getKesikarvoMatalinHinta() {
		return kesikarvoMatalinHinta;
	}

	public void setKesikarvoMatalinHinta(ArrayList<PriceTick> paivaHintaRivit) {
		double ekaSumma = 0;

		for (PriceTick paivanHinta : paivaHintaRivit) {
			ekaSumma += paivanHinta.getMatalinHinta();
		}

		kesikarvoMatalinHinta = ekaSumma / paivaHintaRivit.size();
	}

	public double getKeskihajontaSulkemisHinta() {
		return keskihajontaSulkemisHinta;
	}

	public void setKeskihajontaSulkemisHinta(ArrayList<PriceTick> paivaHintaRivit) {
		double ekaSumma = 0;

		for (PriceTick paivanHinta : paivaHintaRivit) {
			ekaSumma += paivanHinta.getSulkemisHinta();
		}

		double ekaKeskarvo = ekaSumma / paivaHintaRivit.size();

		double tokaSumma = 0;

		for (PriceTick paivanHinta : paivaHintaRivit) {
			tokaSumma += Math.pow(paivanHinta.getSulkemisHinta() - ekaKeskarvo, 2);
		}

		double tokaKeskarvo = tokaSumma / paivaHintaRivit.size();

		keskihajontaSulkemisHinta = Math.sqrt(tokaKeskarvo);
	}

	public double getKeskihajontaAvausHinta() {
		return keskihajontaAvausHinta;
	}

	public void setKeskihajontaAvausHinta(ArrayList<PriceTick> paivaHintaRivit) {
		double ekaSumma = 0;

		for (PriceTick paivanHinta : paivaHintaRivit) {
			ekaSumma += paivanHinta.getAvausHinta();
		}

		double ekaKeskarvo = ekaSumma / paivaHintaRivit.size();

		double tokaSumma = 0;

		for (PriceTick paivanHinta : paivaHintaRivit) {
			tokaSumma += Math.pow(paivanHinta.getAvausHinta() - ekaKeskarvo, 2);
		}

		double tokaKeskarvo = tokaSumma / paivaHintaRivit.size();

		keskihajontaAvausHinta = Math.sqrt(tokaKeskarvo);
	}

	public double getKeskihajontaKorkeinHinta() {
		return keskihajontaKorkeinHinta;
	}

	public void setKeskihajontaKorkeinHinta(ArrayList<PriceTick> paivaHintaRivit) {
		double ekaSumma = 0;

		for (PriceTick paivanHinta : paivaHintaRivit) {
			ekaSumma += paivanHinta.getKorkeinHinta();
		}

		double ekaKeskarvo = ekaSumma / paivaHintaRivit.size();

		double tokaSumma = 0;

		for (PriceTick paivanHinta : paivaHintaRivit) {
			tokaSumma += Math.pow(paivanHinta.getKorkeinHinta() - ekaKeskarvo, 2);
		}

		double tokaKeskarvo = tokaSumma / paivaHintaRivit.size();

		keskihajontaKorkeinHinta = Math.sqrt(tokaKeskarvo);
	}

	public double getKeskihajontaMatalinHinta() {
		return keskihajontaMatalinHinta;
	}

	public void setKeskihajontaMatalinHinta(ArrayList<PriceTick> paivaHintaRivit) {
		double ekaSumma = 0;

		for (PriceTick paivanHinta : paivaHintaRivit) {
			ekaSumma += paivanHinta.getMatalinHinta();
		}

		double ekaKeskarvo = ekaSumma / paivaHintaRivit.size();

		double tokaSumma = 0;

		for (PriceTick paivanHinta : paivaHintaRivit) {
			tokaSumma += Math.pow(paivanHinta.getMatalinHinta() - ekaKeskarvo, 2);
		}

		double tokaKeskarvo = tokaSumma / paivaHintaRivit.size();

		keskihajontaMatalinHinta = Math.sqrt(tokaKeskarvo);
	}

}
