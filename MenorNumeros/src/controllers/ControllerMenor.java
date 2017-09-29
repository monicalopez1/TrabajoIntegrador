/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.ModelMenor;
import views.ViewMenor;

public class ControllerMenor {
    ModelMenor model_menor;
    ViewMenor view_menor;
    
    public ControllerMenor(ModelMenor model_menor,ViewMenor view_menor){
        this.model_menor = model_menor;
        this.view_menor = view_menor;
        
        view_menor.jbtn_menor.addActionListener(e-> jbtn_menor_click());
        initView();
    }
    public void initView(){
        view_menor.jtf_num1.setText(String.valueOf(model_menor.getNum1()));
        view_menor.jtf_num2.setText(String.valueOf(model_menor.getNum2()));
        view_menor.jtf_num3.setText(String.valueOf(model_menor.getNum3()));
        view_menor.jtf_menor.setText(String.valueOf(model_menor.getMenor()));
        view_menor.setVisible(true);
    }
    public void jbtn_menor_click(){
        model_menor.setNum1(Integer.parseInt(view_menor.jtf_num1.getText()));
        model_menor.setNum2(Integer.parseInt(view_menor.jtf_num2.getText()));
        model_menor.setNum3(Integer.parseInt(view_menor.jtf_num3.getText()));
        model_menor.menor();
        view_menor.jtf_menor.setText(String.valueOf(model_menor.getMenor()));
    }
}

