package org.example;

import org.example.ayudas.Licor;
import org.example.modelos.Cliente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        Licor licoruno = new Licor();
        Licor licordos = new Licor("Whisky Buchanans Deluxe", "Whisky", "Diageo", LocalDate.of(2000, 07, 30), 40.6);

        Cliente clienteUno = new Cliente();
        Cliente clienteDos = new Cliente("SANTIAGO", "291029310", 60, "Calle 2b # 81a-30 torre 9 apto 4333", "BenitoCamelas@gmail.com");

        //accediendo a los atributos
        System.out.println(licoruno.getNombre());
        System.out.println(licordos.getNombre());

    }
}