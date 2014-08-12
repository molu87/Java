package ab;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ZamianaStopniTemperatury2 extends JFrame {

	int width = 600;
	int heigth = 300;

	public ZamianaStopniTemperatury2() {

		JLabel lCelsius, lFahrenheit, lKelvin;
		JTextField tCelsius, tFahrenheit, tKelvin;
		JButton bCZamieñ, bFZamieñ, bKZamieñ;

		setSize(width, heigth);
		setTitle("Zamiana Temperatur");
		setLayout(null);

		lCelsius = new JLabel("Stopnie Celsiusza");
		lCelsius.setBounds(20, 20, 150, 20);
		add(lCelsius);

		tCelsius = new JTextField("");
		tCelsius.setBounds(170, 20, 150, 20);
		add(tCelsius);

		lFahrenheit = new JLabel("Stopnie Fahrenheita");
		lFahrenheit.setBounds(20, 60, 150, 20);
		add(lFahrenheit);

		tFahrenheit = new JTextField("");
		tFahrenheit.setBounds(170, 60, 150, 20);
		add(tFahrenheit);

		lKelvin = new JLabel("Stopnie Kelvina");
		lKelvin.setBounds(20, 100, 150, 20);
		add(lKelvin);

		tKelvin = new JTextField("");
		tKelvin.setBounds(170, 100, 150, 20);
		add(tKelvin);

		// klawisze

		bCZamieñ = new JButton("Zamieñ");
		bCZamieñ.setBounds(350, 20, 100, 20);
		add(bCZamieñ);

		bFZamieñ = new JButton("Zamieñ");
		bFZamieñ.setBounds(350, 60, 100, 20);
		add(bFZamieñ);

		bKZamieñ = new JButton("Zamieñ");
		bKZamieñ.setBounds(350, 100, 100, 20);
		add(bKZamieñ);
	}

	public static void main(String[] args) {
		ZamianaStopniTemperatury2 aplikacja = new ZamianaStopniTemperatury2();
		aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplikacja.setVisible(true);

	}

}
