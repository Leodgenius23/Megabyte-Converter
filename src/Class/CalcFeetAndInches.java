package Class;

public class CalcFeetAndInches {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >= 0){
            if(inches >= 0 && inches <= 12){
                double centimeters = feet/0.032808;
                centimeters += inches/0.39370;
                System.out.println(feet + " feet, " + inches + " inches = "
                        + String.format("%.2f",centimeters)  + " cm");
                return (centimeters);
            }
        }
        System.out.println("Invalid feet or inches parameters");
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
           double feet = (int) inches / 12;
           double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet +
                    "feet and " + remainingInches + " inches");
           return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        return -1;
    }
}
