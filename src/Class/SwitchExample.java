package Class;

public class SwitchExample {
    public static void testing(char letter) {
        switch (letter) {
            case 'A':
                System.out.println("Letter A was found");
                break;
            case 'B':
                System.out.println("Letter B was found");
                break;
            case 'C':
                System.out.println("Letter C was found");
                break;
            case 'D':
                System.out.println("Letter D was found");
                break;
            case 'E':
                System.out.println("Letter E was found");
                break;
            default:
                System.out.println("Letter Not Found");
                break;
        }
    }
}
