/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioslab;

/**
 *
 * @author Laboratorio
 */
public class Animal {

    protected int numero;
    protected String sonido;
    protected String tipo;

    
    public Animal(){}
    
    public Animal(int numero){
        this.numero = numero; 
    }
    public Animal(int numero, String sonido){
        this.numero = numero; 
        this.sonido = sonido;
    }
    public Animal(int numero, String sonido, String tipo){
        this.numero = numero; 
        this.sonido = sonido;
        this.tipo = tipo;
    }
    
    //*************************************************  
    
    public void setNumero(int numero) {
        this.numero=numero;
    }

    public int getNumero() {
       return this.numero;
    }
    public void SetTipo (String tipo){
        this.tipo=tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public String Hablar(){
        return this.sonido;
    }
}
