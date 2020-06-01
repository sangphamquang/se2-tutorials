package tut09se2.singleton;

//Create the FIT class with getInstance method()
public class FIT {

    private static FIT instance = null;
    public String text;

    private FIT() {
        text = "Faculty of Information Technology - Hanoi University";
    }

    // TO-DO: Implement the getInstance method
    public static FIT getInstance() {
        if (instance == null) {
            instance = new FIT();
        }
        return instance;
    }

    // TO-DO: Implement 2 below methods
    public String toUpper() {
        // Set the given text to upper case
        return text.toUpperCase();

    }

    public String toLower() {
        // Set the given text to lower case
        return text.toLowerCase();
    }
}