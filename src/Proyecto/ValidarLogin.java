package Proyecto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarLogin {

	private Pattern pat = null;
    private Matcher mat = null;
    
public boolean valGmail(String gmail){
        
        
        String patron = "^[a-z]{1}[_A-Za-z0-9]{0,7}@([A-Za-z0-9]+)(\\.[A-Za-z]{1,3})$";
        
        pat = Pattern.compile(patron);
        mat = pat.matcher(gmail);
        
        if(mat.matches()){
            System.out.println("El gmail es correcto");
            
            return true;
            
        } else {
            System.out.println("El gmail " + gmail + " es incorrecto");
            
            return false;
        }
        
    }

}
