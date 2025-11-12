package wrriters;

import java.io.IOException;

import business.Artikel;

public class ConcreteKonsoleWriterProduct extends WriterProduct{

	@Override
	public void schreibeArtikel(int anzahlArtikel, Artikel[] artikel) throws IOException {
		System.out.println("Anzahl vorhandene Artikel : "+anzahlArtikel);
		System.out.println();
		for(int i=0;i<anzahlArtikel;i++) {
			System.out.println("ArtikelNummer : "+artikel[i].getArtikelnummer());
			System.out.println("ArtikelName : "+artikel[i].getArtikelname());
			System.out.println("BasisPreis : "+artikel[i].getBasispreis());
			System.out.println();
		}
		
	}
	

}
