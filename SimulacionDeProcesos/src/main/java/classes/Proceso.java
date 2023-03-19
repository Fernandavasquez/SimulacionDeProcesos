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
    private Integer tamanio;
    private Integer tiempo;
    private Integer proceso;

 
    private String planificador;
    private String base;
    private String limite;
    private String hexadecimal;
    private int posicion;
    private int sumaT;
    
    public Proceso(){
        this.tiempo=0;
    }
   
    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    public Proceso(Integer min) {
        this.tiempo = sumaT;
        this.tamanio = tiempo*90; // El maximo de la memoria principal es de 30 segundos
        this.hexadecimal= Integer.toHexString(this.tamanio);
    }

    public String getHexadecimal() {
        return hexadecimal;
    }

    public Integer getTiempo() {
        return tiempo;
    }
    
    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
        this.tamanio = tiempo*90; // El maximo de la memoria principal es de 30 segundos
        this.hexadecimal= Integer.toHexString(this.tamanio);
    }
    
    public Integer getProceso() {
        return proceso;
    }

    public void setProceso(Integer proceso) {
        this.proceso = proceso;
    }
    
    public Integer getTamanio() {
        return tamanio;
    }
 
    public void setTamanio(Integer tamanio){
        this.tamanio = tamanio;
    }
    
    public Integer getTamanioEnPix() {
        return (tamanio*300/2000);
    }
    public void setBasehexa(Integer posicion)
    {
            this.base=Integer.toHexString(posicion);
    }
    public String getBasehexa()
    {
           return base;
    }
      public void setLimitehexa(Integer posicion,Integer tamanio)
    {
            int limit;
            limit=posicion+tamanio;
            this.limite=Integer.toHexString(limit);
    }
    public String getLimitehexa()
    {
           return limite;
    }
       public String getPlanificador() {
        return planificador;
    }

    public void setPlanificador(String planificador) {
        this.planificador = planificador;
    }
}