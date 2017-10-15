/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.swing.DefaultListModel;
import models.*;
import views.*;


public class ControllerOrdenar {
   
    private ViewOrdenar viewOrdenar;
    private ModelOrdenar modelOrdenar;
    
    DefaultListModel lista = new DefaultListModel();
    
    public ControllerOrdenar(ViewOrdenar viewOrdenar, ModelOrdenar modelOrdenar){
        this.viewOrdenar = viewOrdenar;
        this.modelOrdenar = modelOrdenar;
        viewOrdenar.jbtn_agregar.addActionListener(e -> jbtn_agregar_click());
        viewOrdenar.jbtn_asc.addActionListener(e -> jbtn_asc_click());
        viewOrdenar.jbtn_promedio.addActionListener(e -> jbtn_promedio_click());
        initView();
    }
    
    private void initView(){
        viewOrdenar.jtf_agregar.setText(String.valueOf(modelOrdenar.getN1()));
        viewOrdenar.jtf_promedio.setText(String.valueOf(modelOrdenar.getN2()));
    }
    
    public void jbtn_agregar_click(){
        modelOrdenar.setN1(Integer.parseInt(viewOrdenar.jtf_agregar.getText()));
        modelOrdenar.setN2(Integer.parseInt(viewOrdenar.jtf_promedio.getText()));
        
    }
    public void jbtn_asc_click(){
        modelOrdenar.setN1(Integer.parseInt(viewOrdenar.jtf_agregar.getText()));
        modelOrdenar.setN2(Integer.parseInt(viewOrdenar.jtf_promedio.getText()));
    }
    
    public void jbtn_promedio_click(){
        modelOrdenar.setN1(Integer.parseInt(viewOrdenar.jtf_agregar.getText()));
        modelOrdenar.setN2(Integer.parseInt(viewOrdenar.jtf_promedio.getText()));
        DefaultListModel<String> lista = new DefaultListModel<>();
    }
}
