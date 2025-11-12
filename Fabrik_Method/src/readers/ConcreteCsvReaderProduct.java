package readers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import business.Artikel;

public class ConcreteCsvReaderProduct extends ReaderProduct{

	@Override
	public int leseAnzahlArtikel() throws IOException {
		BufferedReader ein = new BufferedReader(new FileReader("Artikel.csv"));
		int anzahl = Integer.parseInt(ein.readLine());
		ein.close();
		return anzahl;
		
	}

	@Override
	public Artikel[] leseArtikel() throws IOException {
		BufferedReader ein = new BufferedReader(new FileReader("Artikel.csv"));
		int anzahl = Integer.parseInt(ein.readLine());
		Artikel []artikel = new Artikel[anzahl];
		String []zeile = null;
		for(int i=0;i<artikel.length;i++) {
			
			zeile = ein.readLine().split(";");
			
			artikel[i] = new Artikel(Integer.parseInt(zeile[0]), zeile[1], Double.parseDouble(zeile[2]));
		}
		ein.close();
		
		return artikel;
		
	} 
	

}



