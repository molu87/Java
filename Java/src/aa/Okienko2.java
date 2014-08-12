package aa;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Okienko2 extends JFrame implements ActionListener {

	JButton bPodajDate, bWyj�cie;
	JLabel lWy�wietlDate;

	public Okienko2() {
		setSize(400, 300);
		setTitle("Okienko nr. 1");
		setLayout(null);

		bPodajDate = new JButton("Podaj dat�");
		bPodajDate.setBounds(50, 50, 100, 20);
		add(bPodajDate);
		bPodajDate.addActionListener(this);

		bWyj�cie = new JButton("Wyj�cie");
		bWyj�cie.setBounds(150, 50, 100, 20);
		add(bWyj�cie);
		bWyj�cie.addActionListener(this);
		
		lWy�wietlDate = new JLabel("Data");
		lWy�wietlDate.setBounds(50, 100, 250, 20);
		//lWy�wietlDate.setForeground(Color.BLUE); lub RGB
		lWy�wietlDate.setForeground(new Color(0, 0, 255 ));
		lWy�wietlDate.setFont(new Font("SansSerif", Font.BOLD, 16));
		add(lWy�wietlDate);

	}  

	public static void main(String[] args) {
		Okienko2 okienko = new Okienko2();
		okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okienko.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object �r�d�o = e.getSource(); //pobierz i zapisz sobie jako �r�d�o
		if (�r�d�o== bPodajDate)
		{		
			lWy�wietlDate.setText(new Date().toString());	//(new Date().toGMTString());	
			//System.out.println(new Date());
			
		}
		else if (�r�d�o== bWyj�cie)
		{		
		dispose();	//komenda wyj�cie
		}


	}

}
