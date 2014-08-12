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

	JButton bPodajDate, bWyjœcie;
	JLabel lWyœwietlDate;

	public Okienko2() {
		setSize(400, 300);
		setTitle("Okienko nr. 1");
		setLayout(null);

		bPodajDate = new JButton("Podaj datê");
		bPodajDate.setBounds(50, 50, 100, 20);
		add(bPodajDate);
		bPodajDate.addActionListener(this);

		bWyjœcie = new JButton("Wyjœcie");
		bWyjœcie.setBounds(150, 50, 100, 20);
		add(bWyjœcie);
		bWyjœcie.addActionListener(this);
		
		lWyœwietlDate = new JLabel("Data");
		lWyœwietlDate.setBounds(50, 100, 250, 20);
		//lWyœwietlDate.setForeground(Color.BLUE); lub RGB
		lWyœwietlDate.setForeground(new Color(0, 0, 255 ));
		lWyœwietlDate.setFont(new Font("SansSerif", Font.BOLD, 16));
		add(lWyœwietlDate);

	}  

	public static void main(String[] args) {
		Okienko2 okienko = new Okienko2();
		okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okienko.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object Ÿród³o = e.getSource(); //pobierz i zapisz sobie jako Ÿród³o
		if (Ÿród³o== bPodajDate)
		{		
			lWyœwietlDate.setText(new Date().toString());	//(new Date().toGMTString());	
			//System.out.println(new Date());
			
		}
		else if (Ÿród³o== bWyjœcie)
		{		
		dispose();	//komenda wyjœcie
		}


	}

}
