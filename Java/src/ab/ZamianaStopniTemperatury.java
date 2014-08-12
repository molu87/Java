package ab;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ZamianaStopniTemperatury extends JFrame implements ActionListener {

	JLabel lCelsius, lFahrenheit;
	JTextField tCelsius, tFahrenheit;
	JButton bZamieñ;
	double tempCelsius;
	double tempFahrenheit;

	public ZamianaStopniTemperatury() {

		setSize(400, 400);
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

		bZamieñ = new JButton("Zamieñ");
		bZamieñ.setBounds(20, 100, 100, 20);
		add(bZamieñ);
		bZamieñ.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
        tempCelsius = Double.parseDouble(tCelsius.getText());
        //mo¿e try catch
        tempFahrenheit = 32 + (9.0/5.0) * tempCelsius;
        tFahrenheit.setText(String.valueOf(tempFahrenheit));
        
	}

	public static void main(String[] args) {
		ZamianaStopniTemperatury aplikacja = new ZamianaStopniTemperatury();
		aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplikacja.setVisible(true);

	}

}
