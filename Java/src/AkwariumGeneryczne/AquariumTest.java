package AkwariumGeneryczne;

public class AquariumTest {

	public static void main(String[] args) {
		
		Aquarium<Turtle> mojeakwarium = new Aquarium<Turtle>();
		mojeakwarium.addAnimal(new Turtle());
		mojeakwarium.addAnimal(new Fish());
		mojeakwarium.ktoJestWAquarium();
		
	}
}
