/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tausistopstime;

/**
 *
 * @author user
 */
public class TausiStopsTime {
    public static void main(String[] args) {
        int totalDistanceKm = 10000;
        int passengerStopDistanceKm = 150;
        int refuelingStopDistanceKm = 200;

        // Calculate the number of passenger stops
        int passengerStops = totalDistanceKm / passengerStopDistanceKm;

        // Calculate the number of refueling stops
        int refuelingStops = totalDistanceKm / refuelingStopDistanceKm;

        // Total stops (sum of passenger and refueling stops)
        int totalStops = passengerStops + refuelingStops;

        System.out.println("Total stops from Kampala to Kabale: " + totalStops);
    }
}
