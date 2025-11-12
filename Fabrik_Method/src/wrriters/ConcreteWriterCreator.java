package wrriters;

public class ConcreteWriterCreator extends WriterCreator{

	@Override
	public WriterProduct factoryMethod(String typ) {
		
		if(typ.equals("txt")) {
			return new ConcreteTxtWriterProduct();
		}
		else {
			return new ConcreteKonsoleWriterProduct();
		}
	}
	

}
