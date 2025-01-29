package com.assignments;

public class Assignment2Arrays {

	public static void main(String[] args) {
		
		// Problem: Multi-Dimensional Array Practice
		
		//Create a 3D array to represent the following data:
		    //Semesters as the first dimension.
		    // Subjects and Marks as the second dimension.
			//Actual values for Subject Names and Marks as the third dimension.
		
		// Step 1: Create 3D arrays for subject names and marks
		
		 String[][][] subjectnames = {

	{  //Semester 1 Subject Names	
		{"Mathematics I"},{"Physics"},{"Chemistry"},{"Computer Programming"},{"Engineering Drawing"},{"Basic Electrical Eng."}
	},
	{  //Semester 2 Subject Names
		{"Mathematics II"},{"Mechanics"},{"Environmental sci"},{"Basic Electronics"},{"Engineering Physics"},{"Engineering Graphics"}
	},
	{  //Semester 3 Subject Names
		{"Data Structures"},{"Discrete Mathematics"},{"Digital Electronics"}, {"Operating Systems"}, {"Signals and Systems"},{"Object-Oriented Prog"}
	},
	{  //Semester 4 Subject Names
		{"Algorithms"}, {"Computer Networks"},{"Database Systems"}, {"Microprocessors"},{"Communication Eng"}, {"Software Engineering"}
	},
	{  //Semester 5 Subject Names
		{"Probability & Stats"},{"Machine Learning"},{"Compiler Design"},{"Theory of Computation"}, {"Embedded Systems"}, {"Computer Graphics"}
	}
};
	
         int[][][] Marks = {
        		 
     { //Semester 1 marks 		 
    	 {78, 85, 91, 74,88, 79} 
     },
     { //Semester 2 marks
    	 {82, 77, 93, 69,84, 90}
     },
     { //Semester 3 marks
    	 {88, 81, 76, 92, 85, 78}
     },
     { //Semester 4 marks
    	 {91, 73, 89, 80, 76, 87}
     },
     { //Semester 5 marks
    	 {86, 88, 84, 95, 73, 90}
     }
     
 };
         
   //From the array:
         //Print Semester 3 - Subject 4 and Subject 5 Names.
         System.out.printf("Semester 3- Subject 4: %s%n", subjectnames[2][3][0]);
         System.out.printf("Semester 3- Subject 5: %s%n", subjectnames[2][4][0]);
  
         //Print Semester 5 - Subject 3 and Subject 6 marks      
         System.out.printf("Semester 5- Subject 3: %d%n",Marks[4][0][2]);
         System.out.printf("Semester 5-Subject 6: %d%n", Marks[4][0][5]);
       
        
}
	
};
	
	
	
	
	
