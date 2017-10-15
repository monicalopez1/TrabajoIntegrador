/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ViewPrincipal;
import models.ModelPrincipal;
import views.ViewOrdenar;
import views.ViewEditorTexto;
import views.ViewMayor;
import views.ViewOperaciones;
import models.ModelEditorTexto;
import models.ModelMayor;
import models.ModelOrdenar;
import models.ModelOperaciones;

public class ControllerPrincipal implements ActionListener{
    
    ModelEditorTexto modelEditorTexto;
    ModelMayor modelMayor;
    ModelOperaciones modelOperaciones;
    ModelOrdenar modelOrdenar;
    ModelPrincipal modelPrincipal;
    
    ViewEditorTexto viewEditorTexto;
    ViewMayor viewMayor;
    ViewOperaciones viewOperaciones;
    ViewOrdenar viewOrdenar;
    ViewPrincipal viewPrincipal;
    
    public ControllerPrincipal(ModelEditorTexto modelEditorTexto,ModelMayor modelMayor,ModelOperaciones modelOperaciones,ModelOrdenar modelOrdenar,ModelPrincipal modelPrincipal,
    ViewEditorTexto viewEditorTexto,ViewMayor viewMayor,ViewOperaciones viewOperaciones,ViewOrdenar viewOrdenar,ViewPrincipal viewPrincipal){
       this.viewEditorTexto = viewEditorTexto;
        this.viewMayor = viewMayor;
        this.viewOperaciones = viewOperaciones;
        this.viewOrdenar = viewOrdenar;
        this.viewPrincipal = viewPrincipal;
        this.modelEditorTexto = modelEditorTexto;
        this.modelMayor = modelMayor;
        this.modelOperaciones = modelOperaciones;
        this.modelPrincipal = modelPrincipal;
        this.modelOrdenar = modelOrdenar;
        this.viewPrincipal.jmi_mayor.addActionListener(this); //evento del boton jmiMessage
        this.viewPrincipal.jmi_operaciones.addActionListener(this); //evento del boton jmiMessage
        initView(); 
    }
@Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==viewPrincipal.jmi_mayor)
            jmi_mayorActionPerformed();
        else if (e.getSource() ==viewPrincipal.jmi_operaciones)
            jmi_operacionesActionPerformed();
        else if (e.getSource() == viewPrincipal.jmi_bloc)
            jmi_blocActionPerformed();
        else if (e.getSource() == viewPrincipal.jmi_ordenador)
            jmi_ordenadorActionPerformed();
        
    }
    public void jmi_mayorActionPerformed(){
        this.viewPrincipal.setContentPane(viewMayor);
        this.viewPrincipal.revalidate();
        this.viewPrincipal.repaint();
    }
    
    public void jmi_operacionesActionPerformed(){
        this.viewPrincipal.setContentPane(viewOperaciones);
        this.viewPrincipal.revalidate();
        this.viewPrincipal.repaint();
    }
    
    private void jmi_blocActionPerformed(){
        this.viewPrincipal.setContentPane(viewEditorTexto);
        this.viewPrincipal.revalidate();
        this.viewPrincipal.repaint();
    }
    
    private void jmi_ordenadorActionPerformed(){
        this.viewPrincipal.setContentPane(viewMayor);
        this.viewPrincipal.revalidate();
        this.viewPrincipal.repaint();
    }   
    private void initView(){
        
    }
}
