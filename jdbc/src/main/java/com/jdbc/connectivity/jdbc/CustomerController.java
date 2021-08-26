package com.jdbc.connectivity.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
}
