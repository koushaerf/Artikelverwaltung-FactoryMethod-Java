package readers;

import java.io.IOException;

public class ConcreteCsvReaderCreator extends ReaderCreator {

	@Override
	public ReaderProduct fabricMethod() throws IOException {
		
		return new ConcreteCsvReaderProduct();
	}
	
	

}
