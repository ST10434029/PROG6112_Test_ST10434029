/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_st10434029_paballo_raphadana;

//Question 2 of PROG6112 Test


import java.util.Scanner;


public class RunApplication {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the accident vehicle type:");
        String vehicleType = scan.nextLine();
        
        System.out.println("Enter the city for the vehicle accidents: ");
        String City = scan.nextLine();
        
        System.out.println("Enter the total Car accidents for Cape Town: ");
        int totalAccidents = scan.nextInt();
        
        RoadAccidentReport roadAccidents = new RoadAccidentReport(vehicleType, City, totalAccidents);
        
        roadAccidents.printAccidentReport();
    }
    
}
