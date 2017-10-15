/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.ModelMayor;
import views.ViewMayor;
import views.ViewPrincipal;

public class ControllerMayor {
    
    ModelMayor modelMayor;
    ViewMayor viewMayor;
    
    
    public ControllerMayor(ModelMayor modelMayor, ViewMayor viewMayor) {
        this.modelMayor = modelMayor;
        this.viewMayor = viewMayor;
        viewMayor.jbtn_mayor.addActionListener(e -> jbtn_mayor_click());
        initView();
    }
     public void initView() {
        viewMayor.jtf_n1.setText(String.valueOf(modelMayor.getN1()));
        viewMayor.jtf_n2.setText(String.valueOf(modelMayor.getN2()));
        viewMayor.jtf_n3.setText(String.valueOf(modelMayor.getN3()));
        viewMayor.jtf_m.setText(String.valueOf(modelMayor.getM()));
        viewMayor.setVisible(true);

    }

    public void jbtn_mayor_click() {

        modelMayor.setN1(Integer.parseInt(viewMayor.jtf_n1.getText()));
        modelMayor.setN2(Integer.parseInt(viewMayor.jtf_n2.getText()));
        modelMayor.setN3(Integer.parseInt(viewMayor.jtf_n3.getText()));
        modelMayor.setM(Integer.parseInt(viewMayor.jtf_m.getText()));
        modelMayor.mayor();

    }
}
