package bootathon1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Tabbed_Panel 
{
	JFrame frame;
	JPanel p1;
	Tabbed_Panel()
	{
		frame= new JFrame("Petrol Pump Management System");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane();
		
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		
		p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		JPanel p5=new JPanel();
		JPanel p6=new JPanel();
		JPanel p7=new JPanel();
		
		tabbedPane.setBounds(50,50,1600,830);
		
		tabbedPane.add("",new Home_Page(tabbedPane));
		tabbedPane.add("",new Item_Entry());
		tabbedPane.add("",new Employee_Entry());
		tabbedPane.add("",new Sales_Entry());
		tabbedPane.add("",new Salary_Entry());
		tabbedPane.add("",new View_Report());
		tabbedPane.add("",new Logout(tabbedPane));		
		
		
		JLabel jl_p1 = new JLabel("Home Page");
		jl_p1.setFont(new Font("Times New Roman",Font.BOLD,25));
		jl_p1.setPreferredSize(new Dimension(170, 30));
		jl_p1.setHorizontalAlignment(0);
		tabbedPane.setTabComponentAt(0, jl_p1);
		
		JLabel jl_p2 = new JLabel("Item Entry");
		jl_p2.setFont(new Font("Times New Roman",Font.BOLD,25));
		jl_p2.setPreferredSize(new Dimension(170, 30));
		jl_p2.setHorizontalAlignment(0);
		tabbedPane.setTabComponentAt(1, jl_p2);
		tabbedPane.setEnabledAt(1,false);
		
		JLabel jl_p3 = new JLabel("Employee Entry");
		jl_p3.setFont(new Font("Times New Roman",Font.BOLD,25));
		jl_p3.setPreferredSize(new Dimension(190, 30));
		jl_p3.setHorizontalAlignment(0);
		tabbedPane.setTabComponentAt(2, jl_p3);  
		tabbedPane.setEnabledAt(2,false);
		
		JLabel jl_p4 = new JLabel("Sales Entry");
		jl_p4.setFont(new Font("Times New Roman",Font.BOLD,25));
		jl_p4.setPreferredSize(new Dimension(170, 30));
		jl_p4.setHorizontalAlignment(0);
		tabbedPane.setTabComponentAt(3, jl_p4);  
		tabbedPane.setEnabledAt(3,false);
		
		JLabel jl_p5= new JLabel("Salary Entry");
		jl_p5.setFont(new Font("Times New Roman",Font.BOLD,25));
		jl_p5.setPreferredSize(new Dimension(170, 30));
		jl_p5.setHorizontalAlignment(0);
		tabbedPane.setTabComponentAt(4, jl_p5);  
		tabbedPane.setEnabledAt(4,false);
		
		JLabel jl_p6 = new JLabel("View Report");
		jl_p6.setFont(new Font("Times New Roman",Font.BOLD,25));
		jl_p6.setPreferredSize(new Dimension(170, 30));
		jl_p6.setHorizontalAlignment(0);
		tabbedPane.setTabComponentAt(5, jl_p6);  
		tabbedPane.setEnabledAt(5,false);
		
		JLabel jl_p7 = new JLabel("Logout");
		jl_p7.setFont(new Font("Times New Roman",Font.BOLD,25));
		jl_p7.setPreferredSize(new Dimension(170, 30));
		jl_p7.setHorizontalAlignment(0);
		tabbedPane.setTabComponentAt(6, jl_p7); 
		tabbedPane.setEnabledAt(6,false);
		
		frame.add(tabbedPane, BorderLayout.CENTER);
		frame.setSize(1600, 830);
		frame.setVisible(true);
		}
	
	public static void mian(String args[])
	{
		Tabbed_Panel tp = new Tabbed_Panel();
	}
	
}