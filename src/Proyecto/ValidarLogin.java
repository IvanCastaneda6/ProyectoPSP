package Proyecto;

import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class ValidarLogin {

	private Pattern pat = null;
    private Matcher mat = null;
    
    // Validacion del gmail
    
public boolean valGmail(String gmail){
        
        
        String chorizo = "^[a-z]{1}[_A-Za-z0-9]{0,7}@([A-Za-z0-9]+)(\\.[A-Za-z]{1,3})$";
        
        pat = Pattern.compile(chorizo);
        mat = pat.matcher(gmail);
        
        if(mat.matches()){
            System.out.println("El gmail es correcto");
            
            return true;
            
        } else {
            System.out.println("El gmail " + gmail + " es incorrecto");
            
            return false;
        }
        
    }

		// Validaciones de cada apartado

public boolean[] val_usuario(String nombre, String apellidos, String phone, String fechaNac, int cpostal){
    
    boolean[] validacion = new boolean[5];
    
    String chorizo_nombre = "^[A-Za-zÒ—·ÈÌÛ˙¡…Õ”⁄]{1}[A-Za-zÒ—·ÈÌÛ˙¡…Õ”⁄\\s]{1,14}$";
    String chorizo_telefono = "^[0-9]{3}/([0-9]{3})/([0-9]{3})$";
    String chorizo_cpostal = "^[0-9]{5}$";
    String chorizo_fechaNac = "^[0-9]{2}/([0-9]{2})/([0-9]{4})$";
    
    // Nombre
    pat = Pattern.compile(chorizo_nombre);
    mat = pat.matcher(nombre);
    
    if(mat.matches()){
        System.out.println("El nombre es correcto");
        
        validacion[0] = true;
    } else {
        System.out.println("El nombre " + nombre + " es incorrecto");
        
        validacion[0] = false;
    }
    
    // Apellidos
    pat = Pattern.compile(chorizo_nombre);
    mat = pat.matcher(apellidos);
    
    if(mat.matches()){
        System.out.println("Los apellidos son correctos");
        
        validacion[1] = true;
    } else {
        System.out.println("Los apellidos " + apellidos + " son incorrectos");
        
        validacion[1] = false;
    }
    
    // Telefono
    pat = Pattern.compile(chorizo_telefono);
    mat = pat.matcher(phone);
    
    if(mat.matches()){
        System.out.println("El telÈfono es correcto");
        
        validacion[2] = true;
    } else {
        System.out.println("El telÈfono " + phone + " es incorrecto");
        
        validacion[2] = false;
    }
    
 // CÛdigo Postal
    pat = Pattern.compile(chorizo_cpostal);
    mat = pat.matcher(Integer.toString(cpostal));
    
    if(mat.matches()){
        System.out.println("El cÛdigo postal es correcto");
        
        validacion[4] = true;
    } else {
        System.out.println("El cÛdigo postal " + cpostal + " es incorrecto");
        
        validacion[4] = false;
    }
    
 // Fecha de nacimiento
    pat = Pattern.compile(chorizo_fechaNac);
    mat = pat.matcher(fechaNac);
    
    if(mat.matches()){
        System.out.println("La fecha de nacimiento es correcta");
        
        validacion[3] = true;
    } else {
        System.out.println("La fecha de nacimiento " + fechaNac + " es incorrecta");
        
        validacion[3] = false;
    }
    
    return validacion;
}

}
