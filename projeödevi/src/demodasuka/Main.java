package demodasuka;

/*		.....Author......
 * 		.....EGE.........
 * 		.....DANACI......
 * 		.....Date........
 * 		....02.05.2019...
 * 
 * the purpose of doing this work is making a library management system with using java and
 * the making my assigmant with the best way i can...
 * 
 * */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;

import java.util.ArrayList;
import java.util.Random;

public class Main extends JFrame{
	
	
	public Main() {
		initUI();
	}
	
	public void arama(JTextField search,JTextField text,ArrayList<String> arrlist) throws IOException {
		String str;
		//okuma
		FileInputStream fstream = new FileInputStream("docs/kitaplar.txt");
		DataInputStream dstream = new DataInputStream(fstream);
		BufferedReader breader = new BufferedReader(new InputStreamReader(dstream));
		
		
		
		while((str=breader.readLine())!=null) {
			arrlist.add(str);
		}
		breader.close();
		
		//okuma bitti
		
		str=search.getText();
		for (int i = 0; i < arrlist.size(); i++) {
			boolean durdurac = false;
			
			if (durdurac == true) {
				break;
			}
			else {
				if(arrlist.get(i).equals(str)) {
					text.setText(str);
					durdurac=true;
					break;
				}
			
			
				else {
					text.setText("The book has not found! :(");
				}
			}
		}
	}
	
	
	public void rasgeleKitap(JButton a) {//jbutton içeren fonxyon constructor
		
		Random srand = new Random();
		int x = srand.nextInt(4);//1-4 arası random sayı
		ArrayList<String> arrlist = new ArrayList<String>();
		
		x = x+1;
		
		switch (x) {
		case 1:
			a.setText("Water Color");
			a.setIcon(new ImageIcon("img/images.jpg"));
			break;
		case 2:
			a.setText("Popular Science");
			a.setIcon(new ImageIcon("img/images2.jpg"));
			break;
		case 3:
			a.setText("Digital");
			a.setIcon(new ImageIcon("img/images3.jpg"));
			break;
		case 4:
			a.setText("PothoShop");
			a.setIcon(new ImageIcon("img/images4.jpg"));
			break;
		default:
			System.err.println("" + x);
			break;
		}
		
		
		
	}
	
	public final void initUI() {
		
		ArrayList<String> arrlist = new ArrayList<String>();
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextField output2 = new JTextField("Type in...");
		output2.setBounds(220, 50, 700, 30);
		
		JTextField output = new JTextField();
		output.setEditable(false);
		output.setBounds(10, 50, 200, 500);
		
		JButton exitbutton = new JButton("exit");
		exitbutton.setBounds(1000, 50, 75, 35);
		exitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		//kitapbutonları
		JButton bir= new JButton();
		rasgeleKitap(bir);
		bir.setBounds(250, 130, 125, 50);
		bir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(bir.getText());
				
			}
		});
		
		JButton iki= new JButton();
		rasgeleKitap(iki);
		iki.setBounds(250, 190, 125, 52);
		iki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(iki.getText());
				
			}
		});
		
		JButton uc= new JButton();
		rasgeleKitap(uc);
		uc.setBounds(395, 130, 125, 52);
		uc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(uc.getText());
				
			}
		});
		
		JButton dort= new JButton();
		rasgeleKitap(dort);
		dort.setBounds(395, 190, 125, 52);
		dort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(dort.getText());
				
			}
		});
		
		JButton bes= new JButton();
		rasgeleKitap(bes);
		bes.setBounds(540, 130, 125, 52);
		bes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(bes.getText());
				
			}
		});
		
		JButton alti= new JButton();
		rasgeleKitap(alti);
		alti.setBounds(540, 190, 125, 52);
		alti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(alti.getText());
				
			}
		});
		
		JButton yedi= new JButton();
		rasgeleKitap(yedi);
		yedi.setBounds(680, 130, 125, 52);
		yedi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(yedi.getText());
				
			}
		});
		
		JButton sekiz= new JButton();
		rasgeleKitap(sekiz);
		sekiz.setBounds(680, 190, 125, 52);
		sekiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(sekiz.getText());
				
			}
		});
		
		JButton dokuz= new JButton();
		rasgeleKitap(dokuz);
		dokuz.setBounds(820, 130, 125, 52);
		dokuz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(dokuz.getText());
				
			}
		});
		
		JButton sifir = new JButton();
		rasgeleKitap(sifir);
		sifir.setBounds(820, 190, 125, 52);
		sifir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(sifir.getText());
				
			}
		});
		//***************************************************************************//kitaplık üst raf bitti
		JButton k10= new JButton();
		rasgeleKitap(k10);
		k10.setBounds(250, 270, 125, 52);
		k10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(k10.getText());
				
			}
		});
		
		JButton k11= new JButton();
		rasgeleKitap(k11);
		k11.setBounds(250, 330, 125, 52);
		k11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(k11.getText());
				
			}
		});
		
		
		JButton k40= new JButton();
		rasgeleKitap(k40);
		k40.setBounds(820, 270, 125, 52);
		k40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(k40.getText());
				
			}
		});
		
		JButton k41= new JButton();
		rasgeleKitap(k41);
		k41.setBounds(820, 330, 125, 52);
		k41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(k41.getText());
				
			}
		});
		//******************************************************************//orta raf bitti
		

		JButton bir1= new JButton();
		rasgeleKitap(bir1);
		bir1.setBounds(250, 410, 125, 52);
		bir1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(bir1.getText());
				
			}
		});
		
		JButton iki1= new JButton();
		rasgeleKitap(iki1);
		iki1.setBounds(250, 470, 125, 52);
		iki1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(iki1.getText());
				
			}
		});
		
		JButton uc1= new JButton();
		rasgeleKitap(uc1);
		uc1.setBounds(395, 410, 125, 52);
		uc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(uc1.getText());
				
			}
		});
		
		JButton dort1= new JButton();
		rasgeleKitap(dort1);
		dort1.setBounds(395, 470, 125, 52);
		dort1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(dort1.getText());
				
			}
		});
		
		JButton bes1= new JButton();
		rasgeleKitap(bes1);
		bes1.setBounds(540, 410, 125, 52);
		bes1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(bes1.getText());
				
			}
		});
		
		JButton alti1= new JButton();
		rasgeleKitap(alti1);
		alti1.setBounds(540, 470, 125, 52);
		alti1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(alti1.getText());
				
			}
		});
		
		JButton yedi1= new JButton();
		rasgeleKitap(yedi1);
		yedi1.setBounds(680, 410, 125, 52);
		yedi1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(yedi1.getText());
				
			}
		});
		
		JButton sekiz1= new JButton();
		rasgeleKitap(sekiz1);
		sekiz1.setBounds(680, 470, 125, 52);
		sekiz1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(sekiz1.getText());
				
			}
		});
		
		JButton dokuz1= new JButton();
		rasgeleKitap(dokuz1);
		dokuz1.setBounds(820, 410, 125, 52);
		dokuz1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(dokuz1.getText());
				
			}
		});
		
		JButton sifir1 = new JButton();
		rasgeleKitap(sifir1);
		sifir1.setBounds(820, 470, 125, 52);
		sifir1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(sifir1.getText());
				
			}
		});
		
		//kitap butonları bitti
		
		JButton searchbutton = new JButton("Search");
		searchbutton.setBounds(920, 50, 75, 35);
		searchbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					arama(output2, output, arrlist);
				} catch (IOException e1) {
					e1.printStackTrace();
					e1.getMessage();
				}                                                                                                                                                                                                                                                                                                                                        
			}
		});
		
		JButton buybutton = new JButton("BUY");
		buybutton.setBounds(10, 560,  120, 30);
		buybutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(output.getText()!=null) {
				output.setText(output.getText()+" kitabı alındı");
				
				
				
				}
			}
		});
		
		JButton rentbutton = new JButton("RENT");
		rentbutton.setBounds(10, 600,  120, 30);
		rentbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(output.getText()!=null) {
				output.setText(output.getText()+" kitabı kiralandı");
				}
			}
		});
		
		JButton addbook = new JButton("Add Book");
		addbook.setBounds(140, 600, 100, 30);
		addbook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					File file = new File("docs/kitaplar.txt");//yazmak için
					FileWriter fw = new FileWriter(file,true);
					BufferedWriter bw = new BufferedWriter(fw);
					
					bw.newLine();
					bw.write(output2.getText());//Type in... yeri
					bw.close();
					
				}catch(Exception e){
					e.getMessage();
				}
				output.setText("book is added");
				output2.setText("");
				
			}
		});
		
		
				
				
			
		
		
		
		//images
				JLabel backgraund;
				
				ImageIcon img = new ImageIcon("img/107.jpg");
				
				backgraund = new JLabel("",img,JLabel.CENTER);
				backgraund.setBounds(0, 0, 1200,700);
				
				
		
		
		panel.add(bir);
		panel.add(iki);
		panel.add(uc);
		panel.add(dort);
		panel.add(bes);
		panel.add(alti);
		panel.add(yedi);
		panel.add(sekiz);
		panel.add(dokuz);
		panel.add(sifir);
		
		panel.add(k10);
		panel.add(k11);
		panel.add(k40);
		panel.add(k41);
		
		panel.add(bir1);
		panel.add(iki1);
		panel.add(uc1);
		panel.add(dort1);
		panel.add(bes1);
		panel.add(alti1);
		panel.add(yedi1);
		panel.add(sekiz1);
		panel.add(dokuz1);
		panel.add(sifir1);
		
		panel.add(searchbutton);
		panel.add(output);
		panel.add(exitbutton);
		panel.add(output2);
		
		panel.add(buybutton);
		panel.add(rentbutton);
		panel.add(addbook);
		
		
		panel.add(backgraund);
		
		
		setTitle("MyLibrary");
		setSize(1200, 700);
		setVisible(true);
		setLocationRelativeTo(null);//bastığında ortada çıksın diye
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//kapatma yerinde kapatmıyo
	}
	
	
	
	public static void main(String[] args) throws IOException {
		JFrame girissayfasi = new Giris() {
		};
		
		girissayfasi.setSize(300,150);
		girissayfasi.setTitle("user login");
		girissayfasi.setVisible(true);
		girissayfasi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		girissayfasi.setLayout(new GridLayout(3,5));//giriş sayfasını 3 e böldü
		girissayfasi.setLocationRelativeTo(null);
		
		//Main bastir = new Main();
		
	}

}
