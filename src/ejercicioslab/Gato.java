/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioslab;

/**
 *
 * @author Ingenieria
 */
public class Gato extends Animal{
    
    final String SONIDO_GATO = "MIAU";
       //CONSTRUCTORES
    public Gato(){}
    public Gato(int numero){
        this.numero = numero; 
    }
    public Gato(int numero, String sonido){
        this.numero = numero; 
        this.sonido = sonido;
    }
    public Gato(int numero, String sonido, String tipo){
        this.numero = numero; 
        this.sonido = sonido;
        this.tipo = tipo;
    }
    
    //*************************SETTERS Y GETTERS
    @Override
     public void setNumero(int numero) {
        this.numero=numero;
    }

    @Override
    public int getNumero() {
       return this.numero;
    } 
    @Override
    public void SetTipo (String tipo){
        this.tipo=tipo;
    }
    
    @Override
    public String getTipo(){
        return this.tipo;
    }
     @Override
     public String Hablar(){
         return this.SONIDO_GATO;     
    }
    
}
