
public class Twofer {
    public String twofer(String name) {

        if (name != null && name.matches("[a-zA-Z]+") == false && name != "") {
        	return "Only characters are accepted.";
        }

        return String.format("One for %s, one for me.", name != null ? name : "you");
    }
}