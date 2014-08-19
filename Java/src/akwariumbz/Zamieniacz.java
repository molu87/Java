package akwariumbz;

public class Zamieniacz {

	public String zamien(String r) {

		char literki[] = r.toCharArray();

		for (int i = 0; i < literki.length; i++) {
			literki[i] = Character.toLowerCase(literki[i]);

		}

		
		literki[0] = Character.toUpperCase(literki[0]);

		String zamienione = new String(literki);

		return zamienione;
	}
}
