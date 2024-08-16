/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.traveltime;

/**
 *
 * @author user
 */
public class TravelTime {
    public static void main(String[] args) {
        int totalDistanceKm = 10000;
        double trainSpeedKmPerHour = 250.0;
        int stopDurationMinutes = 5;

        // Calculate travel time 
        double travelTimeHours = totalDistanceKm / trainSpeedKmPerHour;
        int passengerStopDistanceKm = 150;
        int refuelingStopDistanceKm = 200;

        // Calculate total time (including stops)
        int totalStops = totalDistanceKm / passengerStopDistanceKm + totalDistanceKm / refuelingStopDistanceKm;
        int totalStopTimeMinutes = totalStops * stopDurationMinutes;
        double totalTimeHours = travelTimeHours + totalStopTimeMinutes / 60.0;

        System.out.println("Total travel time from Kampala to Kabale: " + totalTimeHours + " hours");
    }
}


