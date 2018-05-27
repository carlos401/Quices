/**
 * UNIVERSIDAD DE COSTA RICA
 * ESCUELA DE CIENCIAS DE LA COMPUTACIÓN E INFORMÁTICA
 * SOLUCIÓN AL QUIZ SOBRE VECTORES
 * PROGRAMACIÓN I - I - 2018
 * @author Carlos Delgado Rojas
 */


package Muestra;

public class Muestra {

    //puntos de interés asociados a una muestra
    private PuntoDeInteres[] puntosDeInteres;

    //mes dado
    private int mes;

    // 1. Implementar el constructor de la clase muestra
    public Muestra(int mes){
        this.puntosDeInteres = new PuntoDeInteres[31];
        this.mes = mes;
    }

    //2. Implementar el método add
    public void add(PuntoDeInteres p){
        if (p.getMes() == this.mes){
            this.puntosDeInteres[p.getDiaMes()-1] = p;
        }
    }

    //3. Implementar el método muestre
    public void muestre(){
        for (int index = 0; index<31; index++){
            if(this.puntosDeInteres[index]!=null){
                System.out.println(this.puntosDeInteres[index].getData());
            }
        }
    }
}
