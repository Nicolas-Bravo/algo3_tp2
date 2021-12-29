package edu.fiuba.algo3.modelo;


public class CalculadorDistancias {

    private double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }
      
    private double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }

    public double distancia(Coordenadas coordenadas1, Coordenadas coordenadas2, String unit) {
        double lat1 = coordenadas1.latitud();
        double lon1 = coordenadas1.longitud();
        double lat2 = coordenadas2.latitud();
        double lon2 = coordenadas2.longitud();

        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
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
}
