package com.sidgs.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sidgs.model.Customer;
import com.sidgs.utilities.ConnectionProvider;

public class CustomerDao {

	public boolean addCustomer(Customer customer) {
		String sql ="INSERT INTO customer (name,email,password) VALUES(?,?,?)";
		try {
			PreparedStatement ps = ConnectionProvider.getConnection().prepareStatement(sql);
			ps.setString(1, customer.getName());
			ps.setString(2, customer.getEmail());
			ps.setString(3, customer.getPassword());
			if(ps.executeUpdate()>0){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	public Customer authenticate(String username, String password) {
		// TODO Auto-generated method stub
		Customer cus = null;
		String sql = "select * from customer where email=? and password=?";
				try {
					PreparedStatement ps = ConnectionProvider.getConnection().prepareStatement(sql);
					ps.setString(1, username);
					ps.setString(2, password);
					ResultSet rs = ps.executeQuery();
					if(rs.next()){
						cus = new Customer();
				
						cus.setName(rs.getString("name"));
						cus.setEmail(rs.getString("email"));
						cus.setPassword(rs.getString("password"));
						return cus;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return cus;
	}

	

}
