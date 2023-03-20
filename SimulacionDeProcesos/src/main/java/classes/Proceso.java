/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author palit
 */
public class Proceso {
    private Integer tamanio;                // tamanio del proceso
    private Integer tiempo;                 // tiempo que se tarda en S
    private String proceso;                 // nombre del proceso
    
    private Integer planificador;           // varia conforme el planificador
    private String base;                    // base en hexa
    private String limite;                  // limite en hexa
    private String hexadecimal;             // el tamanio en hexa
    private Integer posicion;               // posicion en memoria    
    //private int sumaT;
    
    public Proceso(){
        this.tiempo=0;
    }
    
    public Proceso(Integer min) {
        this.tiempo = min;
        this.tamanio = tiempo*90; // El maximo de la memoria principal es de 30 segundos
        this.hexadecimal= Integer.toHexString(this.tamanio);
    }
    
    public Proceso(Integer min, String Proceso) {
        this.proceso = Proceso;
        this.tiempo = min;
        this.tamanio = tiempo*68; // El maximo de la memoria principal es de 30 segundos 
        this.hexadecimal= Integer.toHexString(this.tamanio);
    }
    
   public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
 
    public String getHexadecimal() {
        return hexadecimal;
    }

    public Integer getTiempo() {
        return tiempo;
    }
    
    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }
    
    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }
    
    public Integer getTamanio() {
        return tamanio;
    }
 
    public void setTamanio(Integer tamanio){
        this.tamanio = tamanio;
    }
    
    public Integer getTamanioEnPix() {
        return (tamanio*397/2000);
    }
    
    public void setPlanificador(Integer planificador){
        this.planificador= planificador;
    }
    
    public Integer getPlanificador(){
        return planificador;
    }
    
    public void setBaseHexa(String base){
        this.base=base;  
    }
    
    public String getBaseHexa(){
        return "0x"+base.toUpperCase()+"h";
    }
    
    public void setLimiteHexa(String limite){
        this.limite=limite;  
    }
    
    public String getLimiteHexa(){
        return "0x"+limite.toUpperCase()+"h";
    }
}