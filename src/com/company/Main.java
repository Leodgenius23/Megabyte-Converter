package com.company;

public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        System.out.println("Area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("Height = " + wall.getHeight());
        System.out.println("Area = " + wall.getArea());


    }

//    public static boolean canPack(int bigCount, int smallCount, int goal){
//        if(bigCount < 0 || smallCount < 0 || goal < 0){
//            return false;
//        }
//        int bigCountTotal = bigCount * 5;
//        int Total = bigCountTotal + smallCount;
//
//        if(Total == goal){
//            return true;
//        }else if(bigCountTotal % goal != 0){
//            while(bigCountTotal > goal){
//                bigCountTotal -= 5;
//            }
//        }
//        int Value = goal - bigCountTotal;
//        if(smallCount >= Value){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
}