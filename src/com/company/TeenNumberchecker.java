package com.company;

public class TeenNumberchecker {
    public static boolean hasTeen(int x, int y, int z){

        if((x >= 13 && x <= 19) || (y >= 13 &&
                y <= 19)|| (z >= 13 && z <= 19)){
            return true;
        }
        return false;
    }
    public static boolean isTeen(int range){
        if(range >= 13 && range <= 19){
            return true;
        }
        return false;
    }

}
