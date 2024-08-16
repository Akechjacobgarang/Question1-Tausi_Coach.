/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.returntraveltimecalculator;

/**
 *
 * @author user
 */
public class ReturnTravelTimeCalculator {
    public static void main(String[] args) {
        int totalDistanceKm = 10000;
        double trainSpeedKmPerHour = 250.0;
        int refuelingStopDistanceKm = 200;
        int stopDurationMinutes = 5;

        // Calculate travel time (excluding stops)
        double travelTimeHours = totalDistanceKm / trainSpeedKmPerHour;

        // Calculate total time (including refueling stops)
        int totalRefuelingStops = totalDistanceKm / refuelingStopDistanceKm;
        int totalStopTimeMinutes = totalRefuelingStops * stopDurationMinutes;
        double totalTimeHours = travelTimeHours + totalStopTimeMinutes / 60.0;

        System.out.println("Total travel time from Kabale to Kampala (return journey): " + totalTimeHours + " hours");
    }
}

