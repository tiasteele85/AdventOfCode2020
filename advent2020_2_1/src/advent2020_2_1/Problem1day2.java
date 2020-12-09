package advent2020_2_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Problem1day2 {

	public static void main(String[] args) {
		Path passwordRules = Paths.get("passwords.txt");
		try {			
			List<String>fileLines = Files.readAllLines(passwordRules);	//read in lines from txt to List				
			List<Password> allPasswordObjs = new ArrayList<Password>(fileLines.size()); //create arraylist of password objs
			
			//fill password Arraylist
			for(String line: fileLines){
				allPasswordObjs.add(createPasswordObject(line));
			}
			
			int tally = 0;//int to tally passwords that follow rule
			//test each password for rule validation
			for(int i = 0; i < allPasswordObjs.size(); i++) {
				if(allPasswordObjs.get(i).getUserPassword().contains(String.valueOf(allPasswordObjs.get(i).getLetter())) ) {
					int charCount = countLettersInString(allPasswordObjs.get(i).getUserPassword(),allPasswordObjs.get(i).getLetter());
					if(charCount >= allPasswordObjs.get(i).getMin() && charCount <= allPasswordObjs.get(i).getMax()) {
						tally++;
						//System.out.println(tally);
					}
				}
			}
			
			System.out.println(tally);
				
			
		} catch (IOException e) {		
			e.printStackTrace();
		}
		
		

	}
	
	//method to turn input file lines to usable object
	public static Password createPasswordObject(String line)
	{
		//password object to return
		Password password = new Password();
		String[] segments = line.split(" ");
		String numToString = segments[0];//collect numbers
		String[] numSegments = numToString.split("-");//split based on encoding 
		password.setMin(Integer.parseInt(numSegments[0]));//parse individual ints based on dataset min always first number
		password.setMax(Integer.parseInt(numSegments[1]));//parse individual ints
		password.setLetter(segments[1].charAt(0));//set test letter
		password.setUserPassword(segments[2]);//password to test letter against
				
		//return password object		
		return password;
	}
	
	//function to count character matching
	public static int countLettersInString(String word, char test) {
		int count = 0;//tabulate number of occurrences
		
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == test) {
				count++;				
			}
		}
		
		return count;
	}

}
