/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog6112_st10434029_paballo_raphadana;

/**
 *
 * @author mac
 */
public abstract class RoadAccidents implements iRoadAccidents {
    
    private String vehicleType, City;
    private int totalNumAccidents;

    public RoadAccidents(String vehicleType, String City, int totalNumAccidents) {
        this.vehicleType = vehicleType;
        this.City = City;
        this.totalNumAccidents = totalNumAccidents;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getCity() {
        return City;
    }

    public int getTotalNumAccidents() {
        return totalNumAccidents;
    }
    
    
    
}
