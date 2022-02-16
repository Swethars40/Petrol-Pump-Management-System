package bootathon1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Salary_Entry_Connection 
{
	public void createconnections(Salary_JavaBean jb)
	{
		DataBaseConnection db = new DataBaseConnection();
		
		String b_id = jb.getB_id();
		String e_id = jb.getE_id();
		String e_name = jb.getE_name();
		String month = jb.getMonth();
		int salary = jb.getSalary();
		
		try
		{
			Connection con = db.getConnection();
	        
	        String q = "insert into Salary_Entry values(?,?,?,?,?)";
	        
	        PreparedStatement pst = con.prepareStatement(q);
	        
	        pst.setString(1,b_id);   
	        pst.setString(2, e_id);
	        pst.setString(3, e_name);
	        pst.setString(4, month);
	        pst.setInt(5, salary);
	      
	        
	        pst.executeUpdate();        		            		    
		    con.setAutoCommit(true);
		    con.close();
		    JOptionPane.showMessageDialog(null, " Success!! ");
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, ex.toString());
		}
	}
}
