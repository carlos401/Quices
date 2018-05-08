import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Carlos Delgado Rojas
 * @version 1.0
 */

/**
 * Esta clase simula Persona
 */
public class Persona {
    /**
     * Atributo genérico de persona
     */
    private String nombre;

    /**
     * Lista de autos asociada a la persona
     */
    private ArrayList<Auto> autos;

    /**
     * Constructor de clase
     * @param nombre nombre de la persona creada
     */
    public Persona(String nombre){
        this.nombre = nombre;
        this.autos = new ArrayList<Auto>(); //crea array list de tamaño desconocido
    }

    /**
     * Método permite obtener el nombre de la persona
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método permite agregar un nuevo auto a la lista de autos de la persona
     * @param auto nuevo auto por agregar
     */
    public void addAuto(Auto auto){
        this.autos.add(auto);
    }

    /**
     * Método permite eliminar un auto de la lista de autos
     * @param placa número de placa del auto a eliminar
     * @return true si se eliminó el carro, caso contrario false
     */
    public boolean deleteAuto(String placa){
        Iterator<Auto> ite = this.autos.iterator(); //creo un iterador para recorrer la lista
        Auto auto; //variable para copiar cada auto en las iteraciones
        while(ite.hasNext()){ //mientras la lista no haya llegado al final
            auto = ite.next(); //copio el auto
            if (auto.getPlaca().equals(placa)){ //si el auto copiado tiene la placa que quiero eliminar
                return this.autos.remove(auto); //borrelo
            }
        }
        return false; //caso donde no se encontró el auto
    }

    /**
     * Permite la consulta de los autos
     * @return
     */
    public ArrayList<Auto> getAutos() {
        return autos;
    }
}
