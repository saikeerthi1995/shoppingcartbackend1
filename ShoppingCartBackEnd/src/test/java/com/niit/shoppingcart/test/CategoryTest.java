package com.niit.shoppingcart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

public class CategoryTest {
	   public static void main(String[]args) {
		   @SuppressWarnings({ "resource" })
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
		 context.scan("com.niit.shoppingcart");
		 context.refresh();
		 
		CategoryDAO categoryDAO = (CategoryDAO)  context.getBean("categoryDAO");
		  
		 Category category = (Category) context.getBean("category");
		 category.setId("CG121");
		 category.setName("CGName");
		 category.setDescription("CGDesc1");
	
		 categoryDAO.saveOrUpdate(category);

		 
		 
		   
		if( categoryDAO.get("CG120") ==null)

		  {
			  System.out.println("Category does not exist");
		  }
		  else
		  {
			  System.out.println("Category exist .. the details are ..");
			  System.out.println();
		  }
			
			
			
		}

	

		 
		 
		 
		 
		 
		 
	   }



