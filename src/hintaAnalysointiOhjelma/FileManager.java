package hintaAnalysointiOhjelma;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileManager {
	public static ArrayList<String> tiedostonLuku(String tiedostoPolku) {
		try {
			ArrayList<String> rivit = new ArrayList<>();
			
			FileReader fr = new FileReader(tiedostoPolku);
			BufferedReader br = new BufferedReader(fr);
			
			String rivi;
			while((rivi = br.readLine()) != null) {
				rivit.add(rivi);
			}
			
			br.close();
			fr.close();
			
			return rivit;
		} catch (Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}
}
