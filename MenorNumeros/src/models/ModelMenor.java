/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


public class ModelMenor {
    private int Num1=1;
    private int Num2=2;
    private int Num3=3;
    private int Menor=3;
    
    public int getNum1(){
        return Num1;
    }
    
    public void setNum1(int Num1){
        this.Num1=Num1;
    }
    
    public int getNum2(){
        return Num2;
    }
    
    public void setNum2(int Num2){
        this.Num2=Num2;
    }
    
    public int getNum3(){
        return Num3;
    }
    
    public void setNum3(int Num3){
        this.Num3=Num3;
    }
    
    public int getMenor(){
        return Menor;
    }
    
    public void setMenor(int Menor){
        this.Menor=Menor;
    }
    
    public void menor(){
        Menor=Num1;
        if (Num2<Menor){
            Menor=Num2;
        }
        if (Num3<Menor){
            Menor=Num3;
        }
    }
}
