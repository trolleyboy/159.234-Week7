package tutorial7.task1;

/**
 * Keyboard
 */
public class Keyboard {

    // attributes

    // constructors

    // methods
    public static void inputCharacter() {
        byte[] buffer = new byte[1];
        char inputChar;
        try {
            System.out.print("Please enter a character: ");
            System.in.read(buffer);
            inputChar = (char)buffer[0];
            System.out.println("Typed character: " + inputChar);
            System.in.read(new byte[System.in.available()]);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } 
    }

    public static void inputString() {
        byte[] buffer = new byte[128];
        String inputString;
        try {
            System.out.print("Please enter a string: ");
            System.in.read(buffer);
            inputString = new String(buffer).trim();
            System.out.println("String: " + inputString);
            System.in.read(new byte[System.in.available()]);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }   
    }

    public static void inputInt() {
        byte[] buffer = new byte[128];
        int inputInteger;
        try {
            System.out.print("Please enter an integer: ");
            System.in.read(buffer);
            String inputString = new String(buffer).trim();
            inputInteger = Integer.parseInt(inputString);
            System.out.println("Integer: " + inputInteger);
            System.in.read(new byte[System.in.available()]);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("That wasn't an integer. Start again!");
        }
    }

    public static void inputDouble() {
        byte[] buffer = new byte[256];
        double inputDouble;
        try {
            System.out.print("Please enter a double: ");
            System.in.read(buffer);
            String inputString = new String(buffer).trim();
            inputDouble = Double.parseDouble(inputString);
            System.out.println("Double: " + inputDouble);
            System.in.read(new byte[System.in.available()]);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("That wasn't a double. Start again!");
        }
    }

}