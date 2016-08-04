
package com.niit.shoppingcart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;

public class SupplierTest {
	   @SuppressWarnings("static-access")
	public static void main(String[]args) {
		   @SuppressWarnings({ "resource" })
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext();
		 context.scan("com.niit.shoppingcart");
		 context.refresh();
		 
		 SupplierDAO supplierDAO = (SupplierDAO)  context.getBean("supplierDAO");
		  
		 Supplier supplier = (Supplier) context.getBean("supplier");
		 supplier.setId("SP120");
		 supplier.setName("SPName");
		 supplier.setAddress("HYD");
		 
		supplierDAO.saveOrUpdate(supplier);
		 

	   }
}
		 
		   
		/* if(   ((SupplierDAO) supplierDAO).get("SP120") ==null)

		  {
			  System.out.println("Supplier does not exist");
		  }
		  else
		  {
			  System.out.println("Supplier exist .. the details are ..");
			  System.out.println();
		  }
			
			
			
		}*/

	

		 
		 
		 
		 
		 
		 
	

	   

