/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;


/**
 *
 * @author Edvin Vasquez
 */
public class Producto {
    
    private String CodigoProducto;
    private String Nombre;
    private double Precio;
    
     public Producto(String codigoProducto, String nombre, double precio) {
        this.CodigoProducto =CodigoProducto;
        this.Nombre = Nombre;
        setprecio(precio); // ulizaremos el setter para poder validar los precios 
     }

    public String getCodigoProducto() {
        return CodigoProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.Precio = Precio;
        } else {
            System.out.println("El precio no puede ser negativo. Se mantiene el precio anterior.");
        }
    }

    public String obtenerDetalles() {
        return "CódigoProducto: " + CodigoProducto + ", Nombre: " + Nombre + ", Precio: " + Precio;
    }

    public static void main(String[] args) {
        producto Producto = new Producto("P001", "Laptop", 1200.50);
        System.out.println(Producto.obtenerDetalles());
        
        Producto.setPrecio(-500); // Intento de asignar un precio negativo
        System.out.println("Precio actualizado: " + Producto.getPrecio());
    }

    
}
