package com.jdbc.connectivity.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@RequestMapping("myconnection")
	public ArrayList<customer> showdetails() throws ClassNotFoundException, SQLException {
		System.out.println("jdbc connected");
		Class.forName("com.mysql.jdbc.Driver");                     
	     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	     System.out.println("connection establish");
	     
	     Statement state = con.createStatement();
	     String sql="select * from customer";
	     
	     ArrayList<customer> al=new ArrayList<>();
	     customer co= null;
	     ResultSet rs=state.executeQuery(sql);
	     while (rs.next()) {
	    	int cid= rs.getInt(1);
	    	String name= rs.getString(2);
	    	int amount= rs.getInt(3);
	    	 String city=rs.getString(4);
	    	 
	    	 co=new customer(cid, name, amount, city);
	    	 al.add(co);
	     }
	     
	    return al;
	}
	
	@PostMapping("setempolyee")
	public String setcustomer(@RequestBody Empolyee emp) throws SQLException, ClassNotFoundException {
		int empid=emp.getEmpid();
    	String name= emp.getName();
    	 String company=emp.getCompany();
    	 String query = "insert into empolyee (empid,name,company)values (?,?,?)";
    	 Class.forName("com.mysql.jdbc.Driver");                     
	     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
	     PreparedStatement ps = con.prepareStatement(query);
	     ps.setInt(1, empid);
	     ps.setString(2,name);
	     ps.setString(3, company);
	     int num=ps.executeUpdate();
	     System.out.println(emp.toString());
	     System.out.println(num+ "rows inserted");
	     ps.close();
	     con.close();
	     return"Empolyee set";
	}
	
}
