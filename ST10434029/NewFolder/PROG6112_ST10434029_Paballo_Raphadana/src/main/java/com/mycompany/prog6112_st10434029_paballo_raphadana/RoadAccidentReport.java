/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_st10434029_paballo_raphadana;

/**
 *
 * @author mac
 */
public class RoadAccidentReport extends RoadAccidents{

    public RoadAccidentReport(String vehicleType, String City, int totalNumAccidents) {
        super(vehicleType, City, totalNumAccidents);
    }

    @Override
    public int getAccidentTotal() {
        return super.getTotalNumAccidents();
    }

    @Override
    public String getCity() {
        return super.getCity();
    }
    
    @Override
    public String getAccidentVehicleType() {
        return super.getVehicleType();
    }
    
    public void printAccidentReport(){
        String Header = "";
        
        //Header
        Header += "VEHICLE ACCIDENT REPORT\n";
        Header += "********************************************\n";
        
        System.out.println(Header);
        System.out.println("VEHICLE TYPE: " + getAccidentVehicleType());
        System.out.println("CITY: " + getCity());
        System.out.println("ACCIDENT TOTAL: " + getAccidentTotal());
        System.out.println("********************************************\n");
    }
    
}
