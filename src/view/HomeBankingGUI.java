package view;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HomeBankingGUI extends JFrame {
	private JPanel pannelloLogin;
	private JPanel pannelloGestione;
	private JButton  confirmLogin;
	private JTextField textFieldUsr;
	private JTextField textFieldPwd;
	private JTextField textFieldImporto;
	private JButton  confirmVersa;
	
	Dimension dTextLabelAndField; 
	Container c;
	
	public HomeBankingGUI(){
		this.setTitle("HomeBanking");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600,400);
		this.setLayout(new FlowLayout());
		
		pannelloLogin = new JPanel();
		pannelloLogin.setPreferredSize(new Dimension(this.getWidth()-100, this.getHeight()-100));  
		c = this.getContentPane();
		
		this.createPannelloLogin();
		this.changePannelloToLogin();
		                             
	}
	
	public void createPannelloLogin() {
		
		dTextLabelAndField = new Dimension(200,50);		        
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
	
	
	public void changePannelloToLogin() {
		
		c.removeAll();
		c.add(pannelloLogin);

	}
	
	public void changePannelloToLogged() {
		c.removeAll();
		c.add(pannelloGestione);
	}
	
	
	public static void main(String[] args){
	 	HomeBankingGUI hb = new HomeBankingGUI();
	 	hb.setVisible(true);
	}
	
	
	
}
