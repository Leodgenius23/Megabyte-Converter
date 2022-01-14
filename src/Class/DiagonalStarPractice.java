package Class;

public class DiagonalStarPractice {
    public static void printStar(int number){
        for(int i=1;i < number;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=i;j<=number;j++){
                System.out.print(" ");
            }
            //Side stars
            for(int j=i;j<=number;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
