/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mgarciaz
 */
public class Automovil {
    private Integer id;
    private String placaAutomovil;
    private String marcaAutomovil;
    private String lineaAutomovil;
    private Integer modelo;
    private String color;
    private Automovil next;
    private Automovil back;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Automovil getNext() {
        return next;
    }

    public void setNext(Automovil next) {
        this.next = next;
    }

    public Automovil getBack() {
        return back;
    }

    public void setBack(Automovil back) {
        this.back = back;
    }

    @Override
    public String toString() {
        return "Automovil{" + "id=" + id + ", placa=" + placa + ", marca=" + marca + ", linea=" + linea + ", modelo=" + modelo + ", color=" + color + '}';
    }
    
}
