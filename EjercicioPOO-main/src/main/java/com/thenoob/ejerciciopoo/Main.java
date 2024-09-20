package com.thenoob.ejerciciopoo;

public class Main {
    public static void main(String[] args) {
        TelefonoMovil telefono = new TelefonoMovil();
        telefono.setPrecio(599.99);
        telefono.setMarca("Samsung");
        telefono.setModelo("Galaxy S21");
        telefono.setCapacidadAlmacenamiento(128); // en GB
        telefono.setDuracionBateria(24); // en horas

        System.out.println("Marca: " + telefono.getMarca());
        System.out.println("Modelo: " + telefono.getModelo());
        System.out.println("Precio: " + telefono.getPrecio());
        System.out.println("Capacidad de Almacenamiento: " + telefono.getCapacidadAlmacenamiento() + "GB");
        System.out.println("Duración de la Batería: " + telefono.getDuracionBateria() + " horas");
    }
}