package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EmployeeDetails {

	public static void main(String[] args) {
		
		//Employee ID: E001, E002, E003
		//Name: Alice Green, Bob Johnson, Carol White
		//Age: 30,35,28
		//Gender: Female, Male, Female
		// Department: Engineering, Marketing Manager, Sales Executive
		//Position: Software Engineer, Marketing Manager, Sales Executive
		//Salary: 75,000, 85,000, 65,000
		// Email: alice@example.com, bob@example.com, carol@example.com
		//Contact Number: 9876543213, 9876543214, 9876543215
		
  //Store Above data using Java Collections and Print the email highlighted in Red from collections
		
		 
		 Map<String,String>row1 = new HashMap<String,String>();
		 row1.put("EmployeeId", "E001");
		 row1.put("Name", "Alice Green");
		 row1.put("Age", "30");
		 row1.put("Gender", "Female");
		 row1.put("Department", "Engineering");
		 row1.put("Position", "Software Engineer");
		 row1.put("Salary", "75,000");
		 row1.put("Email", "alice@example.com");
		 row1.put("Contact Number", "9876543213");
	
		 Map<String,String>row2 = new HashMap<String,String>();
		 row2.put("EmployeeId", "E002");
		 row2.put("Name", "Bob Johnson");
		 row2.put("Age", "35");
		 row2.put("Gender", "Male");
		 row2.put("Department", "Engineering");
		 row2.put("Position", "Marketing Manager");
		 row2.put("Salary", "85,000");
		 row2.put("Email", "bob@example.com");
		 row2.put("Contact Number", "9876543214");
		 
		 
		 Map<String,String>row3 = new HashMap<String,String>();
		 row3.put("EmployeeId", "E003");
		 row3.put("Name", "Carol White");
		 row3.put("Age", "28");
		 row3.put("Gender", "Female");
		 row3.put("Department", "Sales Executive");
		 row3.put("Position", "Sales Executive");
		 row3.put("Salary", "65,000");
		 row3.put("Email", "carol@example.com");
		 row3.put("Contact Number", "9876543215");
		 
		 List<Map<String,String>>data = new ArrayList<Map<String,String>>();
		 data.add(row1);
		 data.add(row2);
		 data.add(row3);
		
		 
		 String email = data.get(1).get("Email");
	     System.out.println("Bob's Email: " + email);
		
		
		
		
		
		
		
		
	}

	

}
