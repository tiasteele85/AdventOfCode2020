package advent2020_1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem1day1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("number.txt"); //find path for file
		Scanner numbers = new Scanner(path); //scanner object to assist in parsing ints
		ArrayList<Integer>nums = new ArrayList<Integer>(); //integar List to store parsed ints
		
		//Fill arraylist
		while (numbers.hasNext()) {
		    if (numbers.hasNextInt()) {
		        nums.add(numbers.nextInt());
		    } else {
		        numbers.next();
		    }
		}
		
		int magicNumber = 2020;//sum needed to test condition
		
		//find number equal to magicNumber
		for(int i = 0; i < nums.size(); i++){
			//first loop to run through first position
			for(int j = i; j < nums.size(); j++ )
				//test two numbers to equal magic number 				
			if(nums.get(i) + nums.get(j) == magicNumber) {
				System.out.println(nums.get(i) + " " + nums.get(j));
				System.out.println((nums.get(i) * nums.get(j) ));
				break;
			}else {
				continue;
			}					
			
		}
		
		
		
		
		
		
		
	}

}
