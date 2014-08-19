package mojeKlasy;

public class Kawa implements INapoj{

	@Override
	public void przygotuj() {
		System.out.println("Przygotowuje Kawe");
	}
	@Override
	public void wypij() {
		System.out.println("Pije Kawe");
	}
	@Override
	public String toString(){
		return "kawka";
	}
}
