package Proyecto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import Proyecto.Usuario;

public class Txt {
	
	// Creacion del archivo para almacenar los datos
    private final String txt = Txt.formatoSO("./Datos/datos.txt");
    private File datos;
   
    
    public Txt() {
        // Crea el archivo o el directorio si no esta creado
        datos = new File(txt);
        creaDirectorios(datos);
       
    }
    
    public void escribirDatos(Usuario usuario) {
    	
    	// Hacemos un try que escriba en el archivo y si hay datos ya escritos que no se borren, solo se agregan los nuevos
        try {
            FileWriter fw = new FileWriter(datos, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(usuario.toString());
            pw.close();
            fw.close();
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        } catch (Exception ex) {
            
        }
    }
    
    
    private void creaDirectorios(File file) {
        // Ve si el directorio existe
        if (file.getParentFile() != null && !file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
            
        }
        // Ve si el archivo existe
        if (!file.exists()) {
            
            try {
                file.createNewFile();
            } catch (Exception e) {
                
            }
        }
        
    }
    // Este metodo devuelve la ruta de nuestro equipo para la localizacion de nuestro archivo
    public static String formatoSO(String ruta) {
        String separador;

        try {
            if (File.separator.equals("\\")) { 
                separador = "\\";
                return ruta.replace("/", separador);
            } else { 
                return ruta;
            }
        } catch (Exception e) {
            
            return ruta;
        }
    }
    
	

}
