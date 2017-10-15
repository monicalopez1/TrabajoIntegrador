/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


import javax.swing.DefaultListModel;

public class ModelOrdenar {

    private int n1 = 0;
    private int n2 = 0;
    private int promedio = 0;

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public void ordenar() {
       promedio=n1;
        if (n2>promedio){
            promedio=n2;
        }
        if (n1>promedio){
            promedio = n2;
    }
           
   }
}      
