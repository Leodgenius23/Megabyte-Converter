package com.company;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int megabytes = kiloBytes/1024;
            int remaingingKilobytes = kiloBytes%1024;
            System.out.println(kiloBytes + " kB = " + megabytes +
                    " MB " + " and " + remaingingKilobytes + " KB");
        }

    }
}
