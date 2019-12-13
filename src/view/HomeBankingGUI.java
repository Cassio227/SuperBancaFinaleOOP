package view;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HomeBankingGUI extends JFrame {
	
	private JPanel pannelloLogin;
	private JPanel pannelloLogged;
	private JButton  confirmLogin;
	private JTextField textFieldUsr;
	private JTextField textFieldPwd;
	private JTextField textFieldImporto;
	private JButton  confirmVersa;
	private JButton  confirmPreleva;

	
	private Dimension dTextLabelAndField; 
	private Container c;
	
	public HomeBankingGUI(){
		this.setTitle("HomeBanking");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600,400);
		this.setLayout(new FlowLayout());
		
		pannelloLogin = new JPanel();
		pannelloLogin.setPreferredSize(new Dimension(this.getWidth()-100, this.getHeight()-100));  
		
		pannelloLogged = new JPanel();
		pannelloLogged.setPreferredSize(new Dimension(this.getWidth()-100, this.getHeight()-100));  
				
		dTextLabelAndField = new Dimension(200,50);		        

		
		c = this.getContentPane();	
		
		
		this.createPannelloLogin();
		this.createPannelloLogged();
		
		this.changePannelloToLogin();
		//this.changePannelloToLogged();
		                             
	}
	
	private void createPannelloLogin() {
		
    	confirmLogin =  new JButton("Conferma");
    	confirmLogin.setPreferredSize(new Dimension(200,50));
		JLabel labelInsDati =  new JLabel("Inserisci usr e pwd");
		labelInsDati.setPreferredSize(dTextLabelAndField);
		
		textFieldUsr = new JTextField();
		textFieldUsr.setPreferredSize(dTextLabelAndField);
		
		textFieldPwd = new JTextField();
		textFieldPwd.setPreferredSize(dTextLabelAndField);		
		
		pannelloLogin.setLayout(new GridLayout(4,1,20,20));
		pannelloLogin.add(labelInsDati);
		pannelloLogin.add(textFieldUsr);
		pannelloLogin.add(textFieldPwd);
		pannelloLogin.add(confirmLogin);  
	}
	
	
	private void createPannelloLogged() {		
		textFieldImporto = new JTextField();
		textFieldImporto .setPreferredSize(dTextLabelAndField);
		
		confirmPreleva =  new JButton("Preleva");
		confirmVersa =  new JButton("Versa");
		
		
		pannelloLogged.setLayout(new GridLayout(3,1,20,20));
		pannelloLogged.add(textFieldImporto);
		pannelloLogged.add(confirmPreleva);
		pannelloLogged.add(confirmVersa);  
	}
	
	
	
	public void changePannelloToLogin() {
		System.out.println("Entro login");
		//if(pannelloLogin == null)
		//	this.createPannelloLogin();
		
		c.removeAll();
		c.remove(pannelloLogged);
		c.add(pannelloLogin);
		c.revalidate();
		c.repaint();
	}
	
	public void changePannelloToLogged() {
		//System.out.println("Entro logged");
		//if(pannelloLogged == null)
		//	this.createPannelloLogged();
		
		c.removeAll();
		c.add(pannelloLogged);
		c.revalidate();
		c.repaint();

	}
	
	
	public static void main(String[] args){
	 	HomeBankingGUI hb = new HomeBankingGUI();
	 	hb.setVisible(true);
	 	Scanner sc =  new Scanner(System.in);
	 	int value = 0;
	 	while(true) {
	 		System.out.println("Hey");
	 		value = sc.nextInt();
		 	if(value == 0)
		 		hb.changePannelloToLogin();
		 	if(value == 1)
		 		hb.changePannelloToLogged();
	 	}
 	}
	
	public JTextField getTextFieldUsr() {
		return textFieldUsr;
	}

	public void setTextFieldUsr(JTextField textFieldUsr) {
		this.textFieldUsr = textFieldUsr;
	}

	public JButton getConfirmLogin() {
		return confirmLogin;
	}

	public JTextField getTextFieldPwd() {
		return textFieldPwd;
	}

	public JTextField getTextFieldImporto() {
		return textFieldImporto;
	}

	public JButton getConfirmVersa() {
		return confirmVersa;
	}

	
	
}
