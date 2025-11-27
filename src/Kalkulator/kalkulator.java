package Kalkulator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class kalkulator {

	private JFrame frame;
	private JTextField textField;
	
	double prvi;
	double drugi;
	String rjesenje;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kalkulator window = new kalkulator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public kalkulator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btnNewButton.setBounds(10, 60, 64, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btnNewButton_1.setBounds(95, 60, 64, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btnNewButton_2.setBounds(186, 60, 64, 39);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prvi = Double.parseDouble(textField.getText());
	            rjesenje = "+";
	            textField.setText("");
	            
			}
		});
		btnNewButton_3.setBounds(275, 60, 64, 39);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btnNewButton_4.setBounds(10, 109, 64, 39);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btnNewButton_5.setBounds(95, 109, 64, 39);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btnNewButton_6.setBounds(186, 109, 64, 39);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("-");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prvi = Double.parseDouble(textField.getText());
	            rjesenje = "-";
	            textField.setText("");
			}
		});
		btnNewButton_7.setBounds(275, 109, 64, 39);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_4_1 = new JButton("7");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btnNewButton_4_1.setBounds(10, 158, 64, 39);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("8");
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btnNewButton_4_2.setBounds(95, 158, 64, 39);
		frame.getContentPane().add(btnNewButton_4_2);
		
		JButton btnNewButton_4_3 = new JButton("9");
		btnNewButton_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btnNewButton_4_3.setBounds(186, 158, 64, 39);
		frame.getContentPane().add(btnNewButton_4_3);
		
		JButton btnNewButton_4_4 = new JButton("*");
		btnNewButton_4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prvi = Double.parseDouble(textField.getText());
				rjesenje = "*";
				textField.setText("");
			}
		});
		btnNewButton_4_4.setBounds(275, 158, 64, 39);
		frame.getContentPane().add(btnNewButton_4_4);
		
		JButton btnNewButton_4_5 = new JButton("C");
		btnNewButton_4_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_4_5.setBounds(10, 207, 64, 39);
		frame.getContentPane().add(btnNewButton_4_5);
		
		JButton btnNewButton_4_6 = new JButton("0");
		btnNewButton_4_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
			}
		});
		btnNewButton_4_6.setBounds(95, 207, 64, 39);
		frame.getContentPane().add(btnNewButton_4_6);
		
		JButton btnNewButton_4_7 = new JButton("=");
		btnNewButton_4_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drugi = Double.parseDouble(textField.getText());
			   
				
				
				
				
				double rez = 0;
				
				switch (rjesenje) {
				case "+": rez = prvi + drugi; break;
				case "-": rez = prvi - drugi; break;
				case "*": rez = prvi * drugi; break;
				case "/": rez = prvi / drugi; break;
				}
				textField.setText(String.valueOf(rez));
			}
		});
		btnNewButton_4_7.setBounds(186, 207, 64, 39);
		frame.getContentPane().add(btnNewButton_4_7);
		
		JButton btnNewButton_4_8 = new JButton("/");
		btnNewButton_4_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prvi = Double.parseDouble(textField.getText());
				rjesenje = "/";
				textField.setText("");
			}
		});
		btnNewButton_4_8.setBounds(275, 207, 64, 39);
		frame.getContentPane().add(btnNewButton_4_8);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 240, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
