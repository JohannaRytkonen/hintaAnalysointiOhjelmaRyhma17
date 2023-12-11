package hintaAnalysointiOhjelma;

public class PriceTick {
	// TODO: Luokka ottaa ylös tarvittavat tiedot laskentaan
	
	private double sulkemisHinta;
	
	public double getSulkemisHinta() {
		return sulkemisHinta;
	}
	public void setSulkemisHinta(double sulkemisHinta) {
		this.sulkemisHinta = sulkemisHinta;
	}
	
	
	private double avausHinta;
	
	public double getAvausHinta() {
		return avausHinta;
	}
	public void setAvausHinta(double avausHinta) {
		this.avausHinta = avausHinta;
	}
	
	
	
	private double korkeinHinta;
	
	public double getKorkeinHinta() {
		return korkeinHinta;
	}
	public void setKorkeinHinta(double korkeinHinta) {
		this.korkeinHinta = korkeinHinta;
	}
	
	
	private double matalinHinta;

	public double getMatalinHinta() {
		return matalinHinta;
	}
	public void setMatalinHinta(double matalinHinta) {
		this.matalinHinta = matalinHinta;
	}
}
