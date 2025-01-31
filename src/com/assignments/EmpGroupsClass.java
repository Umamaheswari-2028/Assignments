package com.assignments;

public class EmpGroupsClass {

	//EmpGroups that contains two arrays to store the employee names and IDs
	 
    String[] empNames = {"Uma", "Sun", "Ram"}; 
    int[] empIDs = {1234, 1235, 1236};
	
   public static void main(String[] args) {
	      //Retrieve the data from the Employees class, store it in these arrays,	
	
		  //EmployeesClass(DataType) obj (Variable)= new(keyword) along with ClassName ()Paranthesis
		     EmployeesClass obj = new EmployeesClass();
	            
        //print each employee name along with their corresponding ID
		    
		    
	        // Printing employee details
		     System.out.println("Employee Name: " + obj.empName1 + ",Employee ID:"+ obj.empID1);
		     System.out.println("Employee Name: " + obj.empName2 + ", Employee ID:" + obj.empID2);
		     System.out.println("Employee Name: " + obj.empName3 + ", Employee ID:" + obj.empID2);
		     
	}

}