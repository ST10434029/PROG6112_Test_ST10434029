/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog6112_st10434029_paballo_raphadana;

//ST10434029
//Paballo Raphadana
//Question 1 PROG6112 Test

import java.util.Scanner;

public class PROG6112_ST10434029_Paballo_Raphadana {
    
    static int carAccidentsCPT;
    static int carAccidentsJHB;
    static int carAccidentsPE;
    static int motorBikeAccidentsCPT;
    static int motorBikeAccidentsJHB;
    static int motorBikeAccidentsPE;
    
    static String [] Cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};
    static String [][] Accidents = new String [3][2] {    {Cape Town}, {""}
                                                          {Johannesburg}, {""}
                                                          {Port Elizabeth}, {""}
            };
    
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //Cape Town
        System.out.println("Enter the number of car accidents for Cape Town: ");
        carAccidentsCPT = scan.nextInt();
        System.out.println("Enter the number of motor bike accidents for Cape Town: ");
        motorBikeAccidentsCPT = scan.nextInt();
        
        //Johannesburg
        System.out.println("Enter the number of car accidents for Johannesburg: ");
        carAccidentsJHB = scan.nextInt();
        System.out.println("Enter the number of motor bike accidents for Johannesburg: ");
        motorBikeAccidentsJHB = scan.nextInt();
        
        //Port Elizabeth
        System.out.println("Enter the number of car accidents for Port Elizabeth: ");
        carAccidentsPE = scan.nextInt();
        System.out.println("Enter the number of motor bike accidents for Port Elizabeth: ");
        motorBikeAccidentsPE = scan.nextInt();
        
        
    }
    
    public static void generateRoadAccidentData(int carCPT, int bikeCPT, int carJHB, int bikeJHB, int carPE, int bikePE){
       for (int row = 0; row < Cities.length; row++){
           Accidents[row] = carAccidentsCPT;
           for (int col = 0; col < Cities[row].length; col++){
               Accidents[row][col] = 
           }
       }
    }
    
    public static void RoadAccidentReport(){
        String Output = "";
        
       

        //Main Header
        Output += "***************************************************************************\n";
        Output += "ROAD ACCIDENT REPORT \n";
        Output += "***************************************************************************\n";
        
        //Report data
        Output += String.format("%-20s %-20s %-20s ", "", "CAR", "MOTOR BIKE") + "\n";
        for (int x = 0; x < Cities.length; x++){
            Output += String.format("%-20s", Cities[x]);
            for(int y = 0; y < Cites[x].length; y++){
                Output += String.format("%-20s", Accidents[x][y]);
            }
            Output += String.format("%-20s", Accidents[x]);
            Output += "\n";
        }
       
        Output += "***************************************************************************\n";
        System.out.println(Output);
    
        
    }
}
