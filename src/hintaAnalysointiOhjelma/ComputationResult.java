package hintaAnalysointiOhjelma;

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
		// TODO Luokan tulostus
		return "";
	}

	public double getKesikarvoSulkemisHinta() {
		return kesikarvoSulkemisHinta;
	}

	public void setKesikarvoSulkemisHinta(ArrayList<PriceTick> paivaHintaRivit) {
		// TODO:
	}

	public double getKesikarvoAvausHinta() {
		return kesikarvoAvausHinta;
	}

	public void setKesikarvoAvausHinta(ArrayList<PriceTick> paivaHintaRivit) {
		// TODO:
	}

	public double getKesikarvoKorkeinHinta() {
		return kesikarvoKorkeinHinta;
	}

	public void setKesikarvoKorkeinHinta(ArrayList<PriceTick> paivaHintaRivit) {
		// TODO:
	}

	public double getKesikarvoMatalinHinta() {
		return kesikarvoMatalinHinta;
	}

	public void setKesikarvoMatalinHinta(ArrayList<PriceTick> paivaHintaRivit) {
		// TODO:
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
