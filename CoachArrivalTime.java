/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coacharrivaltime;

/**
 *
 * @author user
 */
public class CoachArrivalTime {
    public static void main(String[] args) {
        // Given data
        double distanceKm = 10000.0; // Distance from Kabale to Kampala (in kilometers)
        double speedMps = 225.5; // Speed in meters per second

        // Convert distance to meters
        double distanceMeters = distanceKm * 1000.0;

        // Calculate travel time (in seconds)
        double travelTimeSeconds = distanceMeters / speedMps;

        // Convert travel time to hours
        double travelTimeHours = travelTimeSeconds / 3600.0;

        // Arrival time (assuming the coach starts at 09:00 hrs)
        int startHour = 9;
        int arrivalHour = (int) (startHour + travelTimeHours);
        int arrivalMinute = (int) ((travelTimeHours - (int) travelTimeHours) * 60);

        System.out.println("Approximate arrival time in Kampala:");
        System.out.printf("%02d:%02d hrs\n", arrivalHour, arrivalMinute);
        
    }
}

