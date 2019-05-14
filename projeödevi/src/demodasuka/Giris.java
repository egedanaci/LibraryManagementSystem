package demodasuka;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

	
	
public abstract class Giris extends JFrame{
		
		private JPanel panel1 ;
		private JButton enteredvariable;
		private JTextField  ID;
		private JPasswordField  Password;
		public JTextField  testing;
		public JTextField  test;
		private boolean controller = false;
		
		public Giris() throws IOException {
			Scanner scan=new Scanner(System.in);
			String str;
			ArrayList<String> strlist=new ArrayList<String>();
			String eraser="";
			
			FileInputStream fStream = new FileInputStream("docs/userdatas.txt");
			DataInputStream dStream = new DataInputStream(fStream);
			BufferedReader bReader = new BufferedReader(new InputStreamReader(dStream));
			
			while((str=bReader.readLine())!=null) {
				strlist.add(str);
			}
			
			File file = new File("docs/userdatas.txt");
			FileWriter fw = new FileWriter(file); 
			BufferedWriter bw = new BufferedWriter(fw);
			
			
			
			
			for(int i=0; i<strlist.size(); i++) {
				bw.write(strlist.get(i));
				bw.newLine();
			
			
			}
			bw.close();
			bReader.close();
			
			
			
			panel1 = new JPanel();
			panel1.setBackground(Color.LIGHT_GRAY);
			setSize(800,600);
			setLayout(new GridLayout(3,5));
			
			test = new JTextField();
			testing = new JTextField();
			
			ID = new JTextField("ID");
			Password = new JPasswordField("Password");
			
			enteredvariable = new JButton("ENTER");
			enteredvariable.setLocation(0, 3);
			
			enteredvariable.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					for (int i = 0; i < strlist.size()-1; i++) {
						test.setText(strlist.get(i));
						testing.setText(strlist.get(i+1));
						
						
						if(ID.getText().equals(test.getText()) && Password.getText().equals(testing.getText())) {
							controller = true;
							if(controller==true) {
								JFrame anayer = new Main(); 
								
							}
							
							
						}
					}
				}
			});
			
			
		
			
			add(ID);
			add(Password);
			add(enteredvariable);
			
			
		}
		
			
	}

	

