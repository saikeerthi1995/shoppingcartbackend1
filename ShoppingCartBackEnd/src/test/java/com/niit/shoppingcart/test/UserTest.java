
package com.niit.shoppingcart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;

public class UserTest {
	   public static void main(String[]args) {
		   @SuppressWarnings({ "resource" })
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
		 context.scan("com.niit.shoppingcart");
		 context.refresh();
		 
		 UserDAO userDAO = (UserDAO)  context.getBean("userDAO");
		  
		 User user = (User) context.getBean("user");
		 user.setId("UR120");
		 user.setName("URName120");
		 user.setPassword("UR107");
		 user.setMail("abc@gmail.com");
		 user.setMobile("1234567891");
		 user.setAddress("hyd");
		 
	
		 userDAO.saveOrUpdate(user);
		 
		System.out.println("no of users present");
	   }
}
		 
		   