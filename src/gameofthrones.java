public class gameofthrones {

	String character;
	int importance;
	

	public String prediction () {

		int prob = (int) (Math.random() * 10);
		if (prob < 5 && importance > 5)
			{ 
				System.out.println(character + " will be dead this season"); }
		else {
			System.out.println(character + " will live this season"); 

		}	
		return ("valhar morgulis");
	} 
}