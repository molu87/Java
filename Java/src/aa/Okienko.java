package aa;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Okienko extends JFrame implements ActionListener {


	JButton bPodajDate, bWyj�cie;
	JLabel lWy�wietlDate;
	
	public Okienko()
	{
		setSize(400,300);
		setTitle("Okienko nr. 1");
		setLayout(null);
		
		bPodajDate= new JButton ("Podaj dat�");
		bPodajDate.setBounds(50, 50, 100, 20);
		add(bPodajDate);
		bPodajDate.addActionListener(this);
		
		bWyj�cie = new JButton("Wyj�cie");
		bWyj�cie.setBounds(150, 50, 100, 20);
		//add(lWy�wietlDate);
	}
	
	public static void main(String[] args)
	{
		Okienko okienko =new Okienko();
		okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okienko.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		System.out.println(new Date());
		
		
		
		
		
	}
	
}
