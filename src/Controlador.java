import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Carlos Delgado
 * @version 1.0
 */

public class Controlador {
    /**
     * Lista de personas de la aplicacion
     */
    private ArrayList<Persona> listaPersonas;

    /**
     * Constructor de la clase
     */
    public Controlador(){
        this.listaPersonas = new ArrayList<>();
    }

    /**
     * Agrega una nueva persona a la lista
     * @param p persona a agregar
     */
    public void addPersona(Persona p){
        this.listaPersonas.add(p);
    }

    /**
     * Permite obtener una persona de la lista por nombre
     * @param nombre nombre de la persona
     * @return la persona seleccionada, null si no hay nadie con ese nombre
     */
    public Persona getPersona(String nombre){
        Iterator<Persona> ite = this.listaPersonas.iterator();
        Persona p;
        while(ite.hasNext()){
            p = ite.next();
            if (p.getNombre().equals(nombre)){
                return p;
            }
        }
        return null;
    }

    public void run(){

        //se crean e insertan dos nuevas personas
        Persona carlos = new Persona("Carlos");
        Persona javier = new Persona("Javier");
        this.listaPersonas.add(carlos);
        this.listaPersonas.add(javier);

        //se insertan tres autos para la persona Carlos
        for(int i=0; i<3; ++i){
            Auto a = new Auto("100"+i,2000+i,10000+i);
            a.calculeImpuesto();
            this.getPersona("Carlos").addAuto(a);
        }

        //se insertar un auto para la persona Javier
        Auto a = new Auto("C1009",2006,10000000);
        this.getPersona("Javier").addAuto(a);

        //consulta de los autos de Carlos
        ArrayList<Auto> autos = this.getPersona("Carlos").getAutos();
        Iterator<Auto> ite = autos.iterator();
        Auto auto;
        while(ite.hasNext()){
            auto = ite.next();
            System.out.println("Placa: " + auto.getPlaca()
                    + " Año: " + auto.getAño() + " Valor: " + auto.getValorFiscal()
                    + " Impuesto: " + auto.getImpuestoAnual());
        }
    }

    public static void main(String[] args){
        Controlador control = new Controlador();
        control.run();
    }
}
