package com.app.taxi.utility;

import com.app.taxi.model.Route;

import java.util.ArrayList;
import java.util.List;

public class RouteUtility {

    public static List<Route> routeList = new ArrayList<>();

    public static final double minFair = 750;
    public static final double fairPerKm = 5;

    static {
        routeList.add(new Route("pune", "mumbai", 120));
        routeList.add(new Route("pune", "nasik", 200));
        routeList.add(new Route("mumbai", "goa", 120));
        routeList.add(new Route("mumbai", "nasik", 120));
    }

}
