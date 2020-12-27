import java.awt.event.*;

import java.util.ArrayList;

import javax.swing.*;

public class GUI {
	public JFrame start = new JFrame();
	public JFrame regeln = new JFrame();
	public ArrayList spieler = new ArrayList();
	
	public GUI() {
		Start();
	}
	
	public void Start() {
		start.setTitle("Start");
		start.setSize(1000, 500); 
		
		JLabel h1 = new JLabel();
		h1.setText("Herzlich wilkommen");
		h1.setBounds(start.getWidth()/2-100, 1, 200, 10);
		
		JLabel h2 = new JLabel();
		h2.setText("Bitte geben sie von allen Mitspielern den Namen ein:");
		h2.setBounds(start.getWidth()/2-200, 30, 300, 20);
		
		final JTextField name1 = new JTextField();
		name1.setBounds(300, 60, 400, 20);
		
		final JTextField name2 = new JTextField();
		name2.setBounds(300, 80, 400, 20);
		
		final JTextField name3 = new JTextField();
		name3.setBounds(300, 100, 400, 20);
		
		final JTextField name4 = new JTextField();
		name4.setBounds(300, 120, 400, 20);
		
		final JTextField name5 = new JTextField();
		name5.setBounds(300, 140, 400, 20);
		
		final JTextField name6 = new JTextField();
		name6.setBounds(300, 160, 400, 20);
		
		final JTextField name7 = new JTextField();
		name7.setBounds(300, 180, 400, 20);
		
		final JTextField name8 = new JTextField();
		name8.setBounds(300, 200, 400, 20);
		
		JButton regeln = new JButton("Regeln");
		regeln.setBounds(start.getWidth()-120, start.getHeight()-140, 100, 100);
		
		start.setLayout(null);
		start.add(h1);
		start.add(h2);
		start.add(name1);
		start.add(name2);
		start.add(name3);
		start.add(name4);
		start.add(name5);
		start.add(name6);
		start.add(name7);
		start.add(name8);
		start.add(regeln);
		start.setVisible(true);
		
		
		regeln.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
            				Regeln();  
                           start.setVisible(false);
                           
            }          
          });
	}

	public void Regeln() {
		regeln.setSize(1000, 500);
		regeln.setTitle("Regeln");
		
		JLabel h1 = new JLabel();
		h1.setText("Regeln");
		h1.setBounds(regeln.getWidth()/2-100, 1, 200, 20);
		
		JButton zur�ck = new JButton("zur�ck");
		zur�ck.setBounds(regeln.getWidth()-120, regeln.getHeight()-140, 100, 100);
		
		regeln.setLayout(null);
		regeln.add(h1);
		regeln.add(zur�ck);
		regeln.setVisible(true);
		
		zur�ck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {  
                           start.setVisible(true);
                           regeln.dispose();
            }          
          });
	} 
}