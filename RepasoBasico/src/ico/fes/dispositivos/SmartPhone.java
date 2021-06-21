/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.dispositivos;

/**
 *
 * @author Aleja
 */
public class SmartPhone {
    private String marca;
    private String modelo;
    private String color;
    private float tamanio;

    public SmartPhone() {
    }

    public SmartPhone(String m, String mod, String c, float t) {
        this.marca = m;
        this.modelo = mod;
        this.color = c;
        this.tamanio = t;
    }

    public SmartPhone(String m) {
        this.marca = m;
    }

    public SmartPhone(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "SmarthPhone{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tamanio=" + tamanio + '}';
    }
     
    public boolean encender(){
        System.out.println("Encendiendo el equipo "+ this.marca );
        return true; 
    }
    
    /**
     * El metodo llamar simula el funcionamiento del programa de telefono en un smartPhone, esto gracias a la posibilidad de la abstraccion.
     * @param numeroDestino
     * @return int que representa el numero de minutos que duro la llamada.
     */
    public int llamar(int numeroDestino){
        System.out.println("Lamando al numero "+ numeroDestino);
        return 60;
    }
    
    public void tomarFoto(){
        System.out.println("Tomando foto ...");
    }
    
}
