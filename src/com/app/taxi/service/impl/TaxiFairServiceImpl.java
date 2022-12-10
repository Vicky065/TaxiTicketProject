package com.app.taxi.service.impl;

import com.app.taxi.model.Route;
import com.app.taxi.service.TaxiFairService;
import com.app.taxi.utility.RouteUtility;

public class TaxiFairServiceImpl implements TaxiFairService {

    @Override
    public void getTicketDetails(int numberOfTraveller, String source, String dest) {
        int dist = 0;
        double fair = 0;

        for (Route route : RouteUtility.routeList) {
            if ((route.getSource().equals(source.toLowerCase()) && route.getDest().equals(dest.toLowerCase())) ||
                    (route.getSource().equals(dest.toLowerCase()) && route.getDest().equals(source.toLowerCase()))) {
                dist = route.getDist();
                break;
            }
        }
        if (dist == 0) {
            System.out.println("Invalid Source or Destination");
        } else {
            if (dist <= 100) {
                fair = numberOfTraveller * RouteUtility.minFair;
            } else {
                fair = numberOfTraveller * (RouteUtility.minFair + (dist - 100) * RouteUtility.fairPerKm);
            }
            printTicketDetails(source, dest, numberOfTraveller, dist, fair);
        }

    }

    private void printTicketDetails(String source, String dest, int numberOfTraveller, int dist, double fair) {
        System.out.println("Taxi Ticket\n--------------\nSource: " + source + "\nDestination: " + dest +
                "\nKms: " + dist + "\nNo.of Traveller: " + numberOfTraveller +
                "\nTotal: " + fair);
    }
}
