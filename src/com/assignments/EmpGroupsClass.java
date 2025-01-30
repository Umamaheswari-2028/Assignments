package com.assignments;

public class EmpGroupsClass {

	//EmpGroups that contains two arrays to store the employee names and IDs
	String [] empNames;
	int [] empIDs;
	
	//Retrieve the data from the Employees class, store it in these arrays, 
	//and finally print each employee name along with their corresponding ID.
	//Example: Employee Name: Bharath, Employee ID: 1234

	
	
	public static void main(String[] args) {
	//Retrieve the data from the Employees class, store it in these arrays,	
	
		//EmployeesClass(DataType) emp (Variable)= new(keyword) along with ClassName ()Paranthesis
		  EmployeesClass obj = new EmployeesClass();
	            
        //print each employee name along with their corresponding ID
	           
	        String empName1 = "Uma";
	        String empName2 = "Sun";
	        String empName3 = "Ram";

	        int empID1 = 1234;
	        int empID2 = 1235;
	        int empID3 = 1236;

	        // Printing employee details
	        System.out.println("Employee Name: " + empName1 + ", Employee ID: " + empID1);
	        System.out.println("Employee Name: " + empName2 + ", Employee ID: " + empID2);
	        System.out.println("Employee Name: " + empName3 + ", Employee ID: " + empID3);
	}

}