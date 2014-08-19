package akwariumbz;

import java.util.Scanner;
import java.util.logging.Handler;
import java.lang.reflect.Field;

import javax.swing.JOptionPane;

public class FabrykaZwierzatek {
	static Class<?> c;
  
	
char s;
	public static ZwierzeAkwariowe tworzZwierzatko()
			throws ClassNotFoundException, InstantiationException, NoClassDefFoundError,
			IllegalAccessException {
		// rodzaj=r;
		 Zamieniacz z = new Zamieniacz();
		 
		String r = JOptionPane
			.showInputDialog("Jakie zwierze chcesz wprowadziæ? Rybka czy Krewetka?");
      
       //Scanner s=new Scanner(System.in);
       // String r= s.nextLine();
		try {
			c = Class.forName("akwariumbz." + z.zamien(r));
			Field[] tablica = c.getDeclaredFields();
			for (Field f : tablica)
				System.out.println("£adujê klasê " + c.getSimpleName()
						+ " z atrybutami " + f.getName() + " typu "
						+ f.getType().getSimpleName());

			return (ZwierzeAkwariowe) c.newInstance();

		}

		catch (ClassNotFoundException e)

		{
			System.out.println(r + " nie potrafi p³ywaæ");
		}
		catch (NoClassDefFoundError e)

		{
			System.out.println("WIELK¥ LITER¥ ");
		}

		return null;

	}

}
