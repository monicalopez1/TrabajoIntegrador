/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
import models.ModelEditorTexto;
import views.ViewEditorTexto;

public class ControllerEditorTexto {
    private FileReader fr = null;
    private JFileChooser jfc = new JFileChooser(); 
   
    private void jmi_abrir(){
        try{
            jfc_showOpenDialog(this);
            model_editortexto.setArchivo(jfc.getSelectedFile());
            fr = new FileReader(model_editor.getArchivo());
            int Character = 0;
           String texto = "";
           while ((Character = fr.read()) != -1){
            texto += (char) Character;
        }
           fr.close();
           views_editortexto.jta_archivo.setText(texto);
        }
        catch(FileNotFoundException e){
            System.err.println("Archivo no encontrado");
        }
        catch (IOException e){
            System.err.println("Error en el archivo");
        }
        finally{
            try{
                fr.close();
            }
         catch(IOException err){
             System.err.println("Error = cerrar");
         }
        }
    }
    //finally
    
    private void jmi_guardar(){
        try{
            jfc_saveOpenDialog(this);
            model_editortexto.setArchivo(jfc.getSelectedFile());
            fr = new FileReader(model_editor.getArchivo());
            int Character = 0;
           String texto = "";
           while ((Character = fr.read()) != -1){
            texto += (char) Character;
        }
           fr.close();
           views_editortexto.jta_archivo.setText(texto);
        }
        catch(FileNotFoundException e){
            System.err.println("Archivo no encontrado");
        }
        catch (IOException e){
            System.err.println("Error en el archivo");
        }
        finally{
            try{
                fr.close();
            }
         catch(IOException err){
             System.err.println("Error = cerrar");
         }
        }
    }
}
