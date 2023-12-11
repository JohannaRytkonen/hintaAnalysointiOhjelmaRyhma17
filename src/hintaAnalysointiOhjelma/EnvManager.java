package hintaAnalysointiOhjelma;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class EnvManager {
	public static DecimalFormat getDesimaaliFormatoija() {
		DecimalFormatSymbols fomatointiSymbolit = new DecimalFormatSymbols();
		fomatointiSymbolit.setDecimalSeparator('.');
		
		return new DecimalFormat("0.00", fomatointiSymbolit);
	}
}
