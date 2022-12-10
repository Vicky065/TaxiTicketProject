package com.app.taxi;

import com.app.taxi.service.TaxiFairService;
import com.app.taxi.service.impl.TaxiFairServiceImpl;

public class TaxiTicketMain {

    public static void main(String[] args) {
        TaxiFairService taxiFairService = new TaxiFairServiceImpl();

        int numberOfTraveller = 2;
        String source = "mumbai";
        String dest = "pune";


        taxiFairService.getTicketDetails(numberOfTraveller, source, dest);
    }


}
