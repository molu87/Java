package AkwariumGeneryczne;

import java.util.ArrayList;

public class Aquarium<T> { //<Z extends Animal> gdy zawê¿amy dopuszczalny typ
	ArrayList<T> animals = new ArrayList<>();
/*
	public Aquarium() {
	}*/

	public void addAnimal(T nazwa) {
		animals.add(nazwa);
	}

	public void ktoJestWAquarium() {
		for (T s : animals) {
			System.out.println("W Akwarium jest:" + s);
		}
	}
}
