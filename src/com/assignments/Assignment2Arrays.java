package com.assignments;

public class Assignment2Arrays {

	public static void main(String[] args) {
		
		// Problem: Multi-Dimensional Array Practice
		
		//Create a 3D array to represent the following data:
		    //Semesters as the first dimension.
		    // Subjects and Marks as the second dimension.
			//Actual values for Subject Names and Marks as the third dimension.
		
		// Step 1: Create 3D arrays for subject names and marks
		
		 String[][][] subjectMarks = {

	{  //Semester 1 Subject Names and Marks	
		{"Mathematics I", "78"}, {"Physics", "85"},{"Chemistry", "91"},
		{"Computer Programming", "74"},{"Engineering Drawing","88"},{"Basic Electrical Eng","79"}
	},
	{  //Semester 2 Subject Names and Marks 
		{"Mathematics II", "82"},{"Mechanics","77"},{"Environmental sci","93"},
		{"Basic Electronics","69"},{"Engineering Physics","84"},{"Engineering Graphics","90"}
	},
	{  //Semester 3 Subject Names and Marks
		{"Data Structures","88"},{"Discrete Mathematics","81"},{"Digital Electronics","76"}, 
		{"Operating Systems","92"}, {"Signals and Systems","85"},{"Object-Oriented Prog","78"}
	},
	{  //Semester 4 Subject Names and Marks
		{"Algorithms","91"}, {"Computer Networks","73"},{"Database Systems","89"}, 
		{"Microprocessors","80"},{"Communication Eng","76"}, {"Software Engineering","87"}
	},
	{  //Semester 5 Subject Names and Marks
		{"Probability & Stats","86"},{"Machine Learning","88"},{"Compiler Design","84"},
		{"Theory of Computation","95"}, {"Embedded Systems","73"}, {"Computer Graphics","90"}
	}
};
	
     //From the array:
         //Print Semester 3 - Subject 4 and Subject 5 Names and //Print Semester 5 - Subject 3 and Subject 6 marks  
         System.out.println("Semester 3- Subject 4:" + subjectMarks[2][3][0]);
         System.out.println("Semester 3- Subject 5:" + subjectMarks[2][4][0]);
         System.out.println("Semester 5- Subject 3:" + subjectMarks[4][2][1]);
         System.out.println("Semester 5- Subject 6:" + subjectMarks[4][5][1]);
           
         
       
        
}
	
};
	
	
	
	
	
