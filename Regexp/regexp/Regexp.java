package regexp;

public class Regexp {
	public static boolean isValidName(String name) {
		return name.matches("[a-z0-9]{8}");
	}


}
