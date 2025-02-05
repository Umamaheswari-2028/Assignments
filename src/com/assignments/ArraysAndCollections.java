package com.assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArraysAndCollections {

	public static void main(String[] args) {
		
//1.Create a list of the top 5 most populated countries in the world and print 2nd Country
		
		//Array:
		
		String[] countryNames =new String[5];
		countryNames[0]= "China";
		countryNames[1]= "India";
		countryNames[2]= "United States";
		countryNames[3]= "Indonesia";
		countryNames[4]= "Pakistan";
		
		System.out.println("2nd Country Name is:"+ countryNames[1]);
		
		
       //Collections: List
		
		List<String> countryNames1 = new ArrayList<String>();
		countryNames1.add("China");
		countryNames1.add("India");
		countryNames1.add("United States");
		countryNames1.add("Indonesia");
		countryNames1.add("Pakistan");
		
		System.out.println("2nd Country Name is:"+countryNames1.get(1));
		System.out.println(countryNames1);
		
//2.Create a set of the top 10 most visited tourist attractions in the world and print out its size.		
	
	//Array:
		
	String[] touristAttractions = new String[10];
	touristAttractions[0] = "The Great Wall of China ";
	touristAttractions[1] = "Machu Picchu";
	touristAttractions[2] = "Eiffel Tower";
	touristAttractions[3] = "Colosseum";
	touristAttractions[4] = "Statue of Liberty";
	touristAttractions[5] = "Disney Parks";
	touristAttractions[6] = "Taj Mahal";
	touristAttractions[7] = "Louvre Museum";
	touristAttractions[8] = "Times Square";
	touristAttractions[9] = "Burj Khalifa";
	
	System.out.println("Number of Tourist Attractions:"+ touristAttractions.length);
	
	
	//Collections: Set
	
	Set<String> touristAttractions1 = new LinkedHashSet<String>();
	touristAttractions1.add("The Great Wall of China ");
	touristAttractions1.add("Machu Picchu");
	touristAttractions1.add("Eiffel Tower");
	touristAttractions1.add("Colosseum");
	touristAttractions1.add("Statue of Liberty");
	touristAttractions1.add("Disney Parks");
	touristAttractions1.add("Taj Mahal");
	touristAttractions1.add("Louvre Museum");
	touristAttractions1.add("Times Square");
	touristAttractions1.add("Burj Khalifa");
	
	System.out.println("Number of Tourist Attractions:"+ touristAttractions1.size());
	System.out.println(touristAttractions1);
	
	
//3. Create a map of the 5 largest cities in the United States and their populations.
	
	//Array: "New York", "Los Angeles", "Chicago", "Houston", "Phoenix" 
	//8419600, 3980400, 2716000, 2328000, 1690000
	
	String[] cities = new String[5];
	cities[0] =  "New York";
	cities[1] =  "Los Angeles";
	cities[2] =  "Chicago";
	cities[3] =  "Houston";
	cities[4] =  "Phoenix" ;
	
	int[] populations = new int[5];
	populations[0] = 8419600;
	populations[1] = 3980400;
	populations[2] = 2716000;
	populations[3] = 2328000;
	populations[4] = 1690000;
	
	System.out.println("Largest city in the United States and their population is:" + cities[0] + populations[0]);
	
	//Collections: Map
	
	Map<String,Integer>citiesAndPopulations = new HashMap<String,Integer>();
	citiesAndPopulations.put("New York", 8419600);
	citiesAndPopulations.put("Los Angeles",3980400 );
	citiesAndPopulations.put("Chicago",2716000 );
	citiesAndPopulations.put("Houston",2328000 );
	citiesAndPopulations.put("Phoenix",1690000);
	
	System.out.println(citiesAndPopulations);
	
//4.Create an array of 10 random integers and print out the sum of 3rd and 5th Value.
	int[] randomIntegers = new int[10];
	randomIntegers[0]= 28;
	randomIntegers[1]= 67;
    randomIntegers[2]= 35;
	randomIntegers[3]= 86;
    randomIntegers[4]= 91;
    randomIntegers[5]= 85;
    randomIntegers[6]= 46;
    randomIntegers[7]= 11;
    randomIntegers[8]= 9;
    randomIntegers[9]= 4;
	
    int sum = randomIntegers[2] + randomIntegers[4];
    System.out.println("The Sum of 3rd and 5th value: " + sum);
    
    
 //5. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
	
    List<String>highestGrossingMovies = new ArrayList<String>();
    highestGrossingMovies.add("Avatar");
    highestGrossingMovies.add("AvengersEndgame ");
    highestGrossingMovies.add("The Way of Water");
    highestGrossingMovies.add("Titanic");
    highestGrossingMovies.add("Star Wars");
    
    System.out.println("The Third movie on the list is:"+ highestGrossingMovies.get(2));
    System.out.println(highestGrossingMovies);
    
	}

}
