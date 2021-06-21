/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasobasico;

import ico.fes.dispositivos.SmartPhone;

/**
 *
 * @author Aleja
 */
public class RepasoBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SmartPhone cel1 = new SmartPhone("Samsung");
        
        SmartPhone cel2 = new SmartPhone("Huawei", "P40", "gris", 5.5f);
        SmartPhone cel3 = new SmartPhone("Apple","iPhone 8 Plus");
        SmartPhone cel4 = new SmartPhone();
        System.out.println( cel1 );
        System.out.println( cel2 );
        
        //uso de metodos de acceso
        cel1.setModelo("galaxy note 10");
        System.out.println(cel1);
        
        System.out.println("Marca del cel:" + cel1.getMarca() );
        
        
        
    }
    
}
