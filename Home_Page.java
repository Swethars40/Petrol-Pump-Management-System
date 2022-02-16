package bootathon1;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Home_Page extends JPanel implements ActionListener
{
	JButton btn_login;
	JPasswordField pf_pass;
	JTextField tf_user;
	JLabel jl_user, jl_pass, jl_title, jl_quote1, jl_quote2, jl_quote3,jl_quote4;
	String user = "admin";
	String pass = "admin@4120";
	JLabel lbl_heading;
	
	JTabbedPane tp;
	
	Home_Page(JTabbedPane tabbedPane)
	{
		setLayout(null);
		setSize(1600, 830);
		setVisible(true);
		
		this.tp = tabbedPane;
		
		ImageIcon background = new ImageIcon(getClass().getResource("temp.jpg"));
		JLabel fr = new JLabel(background);
		fr.setBounds(0, -220, 1400, 800);
		
		ImageIcon logo1 = new ImageIcon(getClass().getResource("logo_violet1-rb.png"));
		JLabel log1 = new JLabel(logo1);
		log1.setBounds(300,205,100,130);
		fr.add(log1);
		
		ImageIcon logo2 = new ImageIcon(getClass().getResource("logo_violet2-rb.png"));
		JLabel log2 = new JLabel(logo2);
		log2.setBounds(350,210,700,130);
		fr.add(log2);
		
		ImageIcon logo3 = new ImageIcon(getClass().getResource("home2.png"));
		JLabel log3 = new JLabel(logo3);
		log3.setBounds(450,600,400,1000);
		fr.add(log3);
		
		jl_quote1 = new JLabel("'Sometimes it takes a ");
		jl_quote1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		jl_quote1.setBounds(1000, 600, 300, 35);
		fr.add(jl_quote1);
		
		jl_quote2 = new JLabel(" Whole tankful of Fuel ");
		jl_quote2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		jl_quote2.setBounds(1000, 670, 300, 35);
		fr.add(jl_quote2);
		
		jl_quote3 = new JLabel(" Before you can ");
		jl_quote3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		jl_quote3.setBounds(1000, 740, 300, 35);
		fr.add(jl_quote3);
		
		jl_quote4 = new JLabel(" Think Straight' ");
		jl_quote4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		jl_quote4.setBounds(1000, 800, 300, 35);
		fr.add(jl_quote4);

		jl_user = new JLabel("Username");
		jl_user.setFont(new Font("Cambria", Font.BOLD, 25));
		jl_user.setBounds(100, 600, 150, 30);
		fr.add(jl_user);

		jl_pass = new JLabel("Password");
		jl_pass.setFont(new Font("Cambria", Font.BOLD, 25));
		jl_pass.setBounds(100, 650, 150, 30);
		fr.add(jl_pass);

		tf_user = new JTextField();
		tf_user.setBounds(320, 600, 150, 30);
		fr.add(tf_user);
		
		pf_pass = new JPasswordField();
		pf_pass.setEchoChar('*');
		pf_pass.setBounds(320, 650, 150, 30);
		fr.add(pf_pass);

		btn_login = new JButton("Login");
		btn_login.setBounds(100, 750, 100, 30);
		fr.add(btn_login);
		
		btn_login.addActionListener(this);
		
		
//		lbl_heading=new JLabel("PETRO SOFT STATION");
//		lbl_heading.setBounds(550, 50, 700, 30);
//		lbl_heading.setFont(new Font("Times_Roman", Font.BOLD, 35));
//		add(lbl_heading);
		
		
		add(fr);
	}

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		Object obj_source = ae.getSource();

		if (obj_source == btn_login) 
		{
			try 
			{
				String Username = tf_user.getText();
				String Password = pf_pass.getText();
				if(user.equals(Username) && pass.equals(Password))
				{
					JOptionPane.showMessageDialog(null, "Logged-in Successfully!!");
					tp.setEnabledAt(1,true);
					tp.setEnabledAt(2,true);
					tp.setEnabledAt(3,true);
					tp.setEnabledAt(4,true);
					tp.setEnabledAt(5,true);
					tp.setEnabledAt(6,true);					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "OOPs!! Wrong Username or Password");
				}
			}
			 
			 catch (Exception e) 
			{ 
				 JOptionPane.showMessageDialog(this, e.toString()); 
			}		 
		}
	}	
}
