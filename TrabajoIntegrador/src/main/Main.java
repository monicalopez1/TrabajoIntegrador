/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import views.*;
import models.*;
import controllers.*;

public class Main {
    private static ControllerEditorTexto controllerEditorTexto;
    private static ControllerMayor controllerMayor;
    private static ControllerOperaciones controllerOperaciones;
    private static ControllerOrdenar controllerOrdenar;
    private static ControllerPrincipal controllerPrincipal;
    
    private static ModelEditorTexto modelEditorTexto;
    private static ModelMayor modelMayor;
    private static ModelOperaciones modelOperaciones;
    private static ModelOrdenar modelOrdenar;
    private static ModelPrincipal modelPrincipal;
    
    private static ViewEditorTexto viewEditorTexto;
    private static ViewMayor viewMayor;
    private static ViewOperaciones viewOperaciones;
    private static ViewOrdenar viewOrdenar;
    private static ViewPrincipal viewPrincipal;
    
    public static void main (String [] mla){
        viewMayor = new ViewMayor();
        viewEditorTexto = new ViewEditorTexto();
        viewOperaciones = new ViewOperaciones();
        viewOrdenar = new ViewOrdenar();
        viewPrincipal = new ViewPrincipal();
        
        modelPrincipal = new ModelPrincipal();
        modelMayor = new ModelMayor();
        modelOperaciones = new ModelOperaciones();
        modelOrdenar = new ModelOrdenar();
        modelEditorTexto = new ModelEditorTexto();
        
        controllerPrincipal = new ControllerPrincipal(viewMayor,viewEditorTexto,viewOperaciones,viewOrdenar,viewPrincipal,modelPrincipal);
        controllerOrdenar = new ControllerOrdenar(viewOrdenar, modelOrdenar);
        controllerMayor = new ControllerMayor(viewMayor, modelMayor);
        controllerOperaciones = new ControllerOperaciones(viewOperaciones, modelOperaciones);
        controllerEditorTexto = new ControllerEditorTexto(viewEditorTexto, modelEditorTexto);
    }
}

