/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author molin
 */
public class Ortogonal extends Tanque {
    //variables de instancia
    double apotema;
    /**
    * @param apotema
    */
    public Ortogonal (double apotema) {
        //super();
        this.apotema=apotema;
    }
    /**
    * @param altura
    * @param apotema
    * @param perimetro
    */
    public double calcularVol(double apotema, double altura, double perimetro){
        double volumen=((perimetro*apotema)/2)*altura;
        return volumen;
    }    
    /**
    * @return
    */
    public double getApo(){
        return apotema;
    }
}
