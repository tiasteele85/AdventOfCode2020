package advent2020_2_1;

public class Password {
	//password class to store password requirements and password 
	//also allow methods to set and call from objects created
	int min;//store minimum value for char evaluation
	int max;//store maximum value for char evaluation
	char letter;//store required char presents
	String userPassword;//current user password
	
	public Password() {
		min = 0;
		max = 0;
		letter = 'a';
		userPassword = "default";
	}
	
	public Password(int min, int max, char letter, String userPassword) {
		this.min = min;
		this.max = max;
		this.letter = letter;
		this.userPassword = userPassword;
	}
	
	public void setMin(int min) {
		this.min = min;
	}
	
	public void setMax(int max) {
		this.max = max;
	}
	
	public void setLetter(char letter) {
		this.letter = letter;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}	
	
	public int getMin() {
		return min;
	}
	
	public int getMax() {
		return max;
	}

	public char getLetter() {
		return letter;
	}

	public String getUserPassword() {
		return userPassword;
	}

	@Override
	public String toString() {
		return "Password [min=" + min + ", max=" + max + ", letter=" + letter + ", userPassword=" + userPassword + "]";
	}
	
	
	
	
}
