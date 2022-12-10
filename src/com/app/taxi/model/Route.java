package com.app.taxi.model;

public class Route {

    private String source;
    private String dest;
    private int dist;

    public Route(String source, String dest, int dist) {
        this.source = source;
        this.dest = dest;
        this.dist = dist;
    }

    public String getSource() {
        return source;
    }

    public String getDest() {
        return dest;
    }

    public int getDist() {
        return dist;
    }


}
