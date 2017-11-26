package com.sidgs.bo;

import com.sidgs.Dao.CustomerDao;
import com.sidgs.exception.ApplicationException;
import com.sidgs.model.Customer;

public class CustomerBo {
	public boolean addCustomer(Customer customer) throws ApplicationException{
		CustomerDao dao = new CustomerDao();  
		if(customer == null){
			throw new ApplicationException("this is not valid");
		}
		if(customer.getName() == null || customer.getName().isEmpty()){
			throw new ApplicationException("invalid user name");
		}
		if(customer.getPassword() == null || customer.getPassword().isEmpty()){
			throw new ApplicationException("invalid password");
		}
		if(customer.getEmail() == null || customer.getEmail().isEmpty()){
			throw new ApplicationException("invalid email");
		}
		
		return dao.addCustomer(customer);
	}

	public Customer authenticate(String username, String password) throws ApplicationException {
		CustomerDao dao = new CustomerDao();
		// TODO Auto-generated method stub
		if(username == null || username.isEmpty()){
			throw new ApplicationException("invalid username");
		}
		if(password == null || password.isEmpty()){
			throw new ApplicationException("password is not correfct");
		}
		return dao.authenticate(username,password);
	}
	

}
