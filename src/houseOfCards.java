public class houseOfCards extends Series {

	String character;

	public void setSeries(String name, String channel) {
		character = character + "(mod)";

	}

	public void setCharacter (String charac){
		character = charac;
	}

	public String getCharacter () {
		return character;
	}
}