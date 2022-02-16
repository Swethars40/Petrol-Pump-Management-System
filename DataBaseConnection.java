package bootathon1;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class DataBaseConnection 
{
	Connection con;
	public Connection getConnection()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
	        con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","project1","ppms");		
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null, ex.toString());
		}
		return con;
	}

}
