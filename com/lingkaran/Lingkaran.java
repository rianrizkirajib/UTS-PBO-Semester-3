//UTS Essay

package com.lingkaran;
public class Lingkaran {
   // Atribut
    private int jari2;
    private double luas;
    
    //Setter method untuk jari2
    public void setJari2(int r){
        if (r > 0 ){
            this.jari2 = r;
        }
        else{
            this.jari2 = 0;
        }
    }
    
    public double getLuas(){
        this.luas = Math.PI * Math.pow(this.jari2, 2);
        return this.luas;
    } 
}