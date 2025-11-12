package business;



import java.io.IOException;

import readers.ConcreteCsvReaderCreator;
import readers.ReaderCreator;
import readers.ReaderProduct;
import wrriters.ConcreteTxtWriterProduct;
import wrriters.ConcreteWriterCreator;
import wrriters.WriterCreator;
import wrriters.WriterProduct;


public class ArtikelModel {
	
	private Artikel[] artikel = new Artikel[100];
	private int anzahlArtikel;
	
	
	public int getAnzahlArtikel() {
		return anzahlArtikel;
	}

	public void setAnzahlArtikel(int anzahlArtikel) {
		this.anzahlArtikel = anzahlArtikel;
	}

	public void leseArtikelAusCsvDatei() throws IOException{
		
		ReaderCreator readerCreator = new ConcreteCsvReaderCreator();
		ReaderProduct reader = readerCreator.fabricMethod();
		this.anzahlArtikel = reader.leseAnzahlArtikel();
		this.artikel = reader.leseArtikel();
		
	}
	
	public void schreibeArtikelInTxtDatei()throws IOException{
		
		WriterCreator writerCreator = new ConcreteWriterCreator();
		ConcreteTxtWriterProduct writer = (ConcreteTxtWriterProduct) writerCreator.factoryMethod("txt");
		writer.schreibeArtikel(this.getAnzahlArtikel(), this.artikel);
		
		
	}
	public void schreibeArtikelInKonsole() throws IOException {
		WriterCreator writerCreator = new ConcreteWriterCreator();
		WriterProduct writer = writerCreator.factoryMethod("console");
		writer.schreibeArtikel(this.getAnzahlArtikel(), this.artikel);
	}

}
