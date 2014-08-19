package mojeKlasy;

public class Mleko implements INapoj{

	@Override
	public void przygotuj() {
		System.out.println("Przygotowuje Mleko");
	}
	@Override
	public void wypij() {
		System.out.println("Pije Mleko");
	}
	@Override
	public String toString(){
		return "mleczko";
	}
}
