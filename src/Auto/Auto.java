/**
 * @author Carlos Delgado Rojas
 * @version 1.0
 */

package Auto;

/**
 * Esta clase simula Auto
 */
public class Auto {
    /**
     * Placa del auto
     */
    private String placa;

    /**
     * Año de fabricación
     */
    private int año;

    /**
     * Valor fiscal
     */
    private double valorFiscal;

    /**
     * Impuesto anual calculado
     */
    private double impuestoAnual;

    /**
     * Constructor de la clase Auto
     * @param placa número de placa asociado
     * @param año año de fabricación
     * @param valor valor fiscal del auto
     */
    public Auto(String placa, int año, double valor){
        this.placa = placa;
        this.año = año;
        this.valorFiscal = valor;
        this.impuestoAnual = 0.0; //atributo será calculado
    }

    /**
     * Método que permite calcular el valor del atributo impuestoAnual
     */
    public void calculeImpuesto(){
        if(this.año < 1998){
            this.impuestoAnual = this.valorFiscal * 0.2;
        } else if(this.año < 2008){
            this.impuestoAnual = this.valorFiscal * 0.15;
        } else {
            this.impuestoAnual = this.valorFiscal * 0.05;
        }
    }

    /**
     * Método que permite obtener la placa del vehículo
     * @return el número de placa del vehículo
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Permite realizar cambio de placa
     * @param placa nuevo número de placa
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Permite obtener el año de fabricación del auto
     * @return el año de fabricación
     */
    public int getAño() {
        return año;
    }

    /**
     * Permite obtener el valor fiscal actual del auto
     * @return el valor fiscal del auto
     */
    public double getValorFiscal() {
        return valorFiscal;
    }

    /**
     * Permite actualizar el valor fiscal del auto
     * @param valorFiscal nuevo valor fiscal
     */
    public void setValorFiscal(double valorFiscal) {
        this.valorFiscal = valorFiscal;
    }

    /**
     * Permite obtener el impuesto del auto
     * @return el impuesto anual
     */
    public double getImpuestoAnual() {
        return impuestoAnual;
    }
}
