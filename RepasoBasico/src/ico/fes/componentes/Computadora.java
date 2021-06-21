/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author Aleja
 */
public class Computadora {
    private int marca;
    private int modelo;
    
    private CPU procesador;
    private Monitor monitor;
    private Teclado teclado;
    private Mouse mouse;

    public Computadora() {
    }

    public Computadora(int marca, int modelo, CPU procesador, Monitor monitor, Teclado teclado, Mouse mouse) {
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public CPU getProcesador() {
        return procesador;
    }

    public void setProcesador(CPU procesador) {
        this.procesador = procesador;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
    

    

    
    
    
}
