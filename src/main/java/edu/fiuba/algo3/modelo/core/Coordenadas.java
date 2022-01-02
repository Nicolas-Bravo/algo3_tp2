package edu.fiuba.algo3.modelo.core;

public class Coordenadas {

    private double latitud;
    private double longitud;

    public Coordenadas(double lat, double lng){
        this.latitud = lat;
        this.longitud = lng;
    }

    public double distanciaCon(Coordenadas destino, String unit){
        double lat2 = destino.latitud();
        double lon2 = destino.longitud();

        double theta = this.longitud - lon2;
        double dist = Math.sin(deg2rad(this.latitud)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(this.latitud)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        if (unit.equals("K")) {
            dist = dist * 1.609344;
        } else if (unit.equals("N")) {
            dist = dist * 0.8684;
        }

        return dist;

    }

    private double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    private double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }

    public double latitud() {
        return this.latitud;
    }

    public double longitud() {
        return this.longitud;
    }
}
