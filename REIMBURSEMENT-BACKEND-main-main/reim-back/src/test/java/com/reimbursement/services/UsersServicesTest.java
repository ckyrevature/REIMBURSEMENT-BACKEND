package com.reimbursement.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.reimbursement.dao.UsersDAOImpl;
import com.reimbursement.models.User;

@ExtendWith(MockitoExtension.class)
public class UsersServicesTest {
	
	
	@Mock
	private UsersDAOImpl userDAO;
	
	@InjectMocks
	private UserServices usersServices = new UserServicesImpl();
	
	@Test
	public void test_userLogon() throws SQLException {
//		User u = new User();
//		u.setEmail("abc@xyz.com");
//		u.setFirstName("CDF");
//		when(userDAO.checkLogin("abc", "pwd")).thenReturn(u);
//		
//		User input = new User();
//		input.setUserName("abc");;
//		input.setUserPassword("pwd");
//		User u1 = usersServices.userLogon(input);
//		assertEquals("CDF", u1.getFirstName());
//		assertEquals("abc@xyz.com", u1.getEmail());
//		
//
//		User input1 = new User();
//		input1.setUserName("abc");;
//		input1.setUserPassword("pwd1");
//		User u2 = usersServices.userLogon(input1);
//		assertNull(u2);
	}

}
