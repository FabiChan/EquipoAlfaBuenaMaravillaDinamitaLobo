//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Mes.java
//  @ Date : 17/10/2021
//  @ Author : 
//
//
import java.io.*;
import java.util.*;
import java.text.*;

//clase mes
class Mes {
	private String nombre;
	private double temperatura;
	
	public Mes(String nombre, double temperatura) {
		setNombre(nombre);
		setTemperatura(temperatura);
	}
	//metodos set y get
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setTemperatura(double temperatura) {
		this.temperatura=temperatura;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getTemperatura() {
		return temperatura;
	}
	
	public Mes crearArregloM() {
		String meses[]={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		Mes mes[]=new Mes[12];
		for(byte i=0;i<12;i++){
			meses[i]=mes[i].setNombre();
		}
		return mes;

		}
}
//clase principal
class Principal{
	public static void main (String agrs []){
		System.out.println(Mes.mes);
	}
}