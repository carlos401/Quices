/**
 * UNIVERSIDAD DE COSTA RICA
 * ESCUELA DE CIENCIAS DE LA COMPUTACIÓN E INFORMÁTICA
 * SOLUCIÓN AL QUIZ SOBRE VECTORES
 * PROGRAMACIÓN I - I - 2018
 * @author Carlos Delgado Rojas
 */

package Muestra;

public class PuntoDeInteres {
    private double longitud;
    private double latitud;
    private String fecha;
    private double oxigenoDisuelto;
    private double nitrogenoAmoniacal;
    private double demandaBioquimicaOxigeno;

    public PuntoDeInteres(double longitud, double latitud,
                          String fecha, double oxigenoDisuelto,
                          double nitrogenoAmoniacal,
                          double demandaBioquimicaOxigeno) {
        this.longitud = longitud;
        this.latitud = latitud;
        this.fecha = fecha;
        this.oxigenoDisuelto = oxigenoDisuelto;
        this.nitrogenoAmoniacal = nitrogenoAmoniacal;
        this.demandaBioquimicaOxigeno = demandaBioquimicaOxigeno;
    }

    public int getMes(){
        //subhilera que empieza en pos 5 y termina en pos 7
        return (Integer.parseInt(this.fecha.substring(5,7))-1);
    }

    public int getDiaMes(){
        //subhilera que empieza en pos 8 y termina en pos 10
        return (Integer.parseInt(this.fecha.substring(8,10))-1);
    }

    public String getData(){
        return "Lo = " + this.longitud+ "La = " + this.latitud +
                "Fec = " + this.fecha + "OD = " + this.oxigenoDisuelto +
                "Nit = " + this.nitrogenoAmoniacal + "DBO = " +
                this.demandaBioquimicaOxigeno;
    }
}
