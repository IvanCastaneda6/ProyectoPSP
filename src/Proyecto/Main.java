package Proyecto;

import Proyecto.Usuario;
import Proyecto.ValidarLogin;
import java.util.Scanner;
import Proyecto.Txt;

public class Main {

	public static void main(String[] args) {
		
		 Txt archivos = new Txt();
	       
	        String gmail = "";
	        String nombre = "";
	        String apellidos = "";
	        String telefono = "";
	        String fechaNac = "";
	        int cpostal = 0;

	       ValidarLogin vl = new ValidarLogin();
	       	        
	     // Validacion del gmail
	        do {
	            gmail = Main.leeCadena("Correo:\nFormato usuario@servidor.dominio\n"
	                    + "usuario: m�ximo 8 caracteres, letras, n�meros y/o el car�cter '_', el primer car�cter debe ser una letra min�scula\n"
	                    + "servidor: letras y n�meros\n"
	                    + "dominio: m�ximo 3 car�cteres.\n"
	                    + "Escribe tu correo: ");
	            
	        } while (!vl.valGmail(gmail));
	        
	     // Validaciones para cada apartado:
	        boolean[] validacion = new boolean[]{false, false, false, false, false};
	        do {
	            if (!validacion[0]) {
	                nombre = Main.leeCadena("Escribe tu nombre: (S�lo letras y espacios, m�ximo 15 caracteres)");
	            }
	            if (!validacion[1]) {
	                apellidos = Main.leeCadena("Escribe tus apellidos: (S�lo letras y espacios, m�ximo 15 caracteres)");
	            }
	            if (!validacion[2]) {
	                telefono = Main.leeCadena("Escribe tu tel�fono: (Formato 999/999/999)");
	            }
	            if (!validacion[3]) {
	                fechaNac = Main.leeCadena("Escribe tu fecha de nacimiento: (Formato dd/mm/yyyy)");
	            }
	            if (!validacion[4]) {
	                cpostal = Main.leeEntero("Escribe tu c�digo postal: (Formato 99999)");
	            }
	            Main.msgln("\n");
	            validacion = vl.val_usuario(nombre, apellidos, telefono, fechaNac, cpostal);
	            Main.msgln("\n");
	        } while (!validacion[0] || !validacion[1] || !validacion[2] || !validacion[3] || !validacion[4]);
	        
	        
	     // Si todo esta bien se creara el usuario
	        Main.msg("\nLos datos del usuario son correctos:");
	        Usuario usuario = new Usuario(gmail, nombre, apellidos, telefono, cpostal, fechaNac);
	        Main.msg(usuario.toString());
	        archivos.escribirDatos(usuario);
	        Main.msg("\nEl usuario ha sido registrado");
	        
	        
	}
	public static int leeEntero(String mensaje) {
        int numero = 0;
        boolean leido = false;
        Scanner teclado = null;
        do {
            Main.msgln(mensaje);
            try {
                teclado = new Scanner(System.in);
                numero = teclado.nextInt();
                leido = true;
            } catch (Exception e) {
                Main.msgln("Error");
            }
        } while (!leido);
        
        return numero;
    }  
	public static void msgln(String mensaje) {
        System.out.println(mensaje);
    }
	
	public static String leeCadena(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        String cadena = "";
        try {
            Main.msgln(mensaje);
            cadena = teclado.nextLine();
        } catch (Exception e) {
            Main.msgln("Error");
        }
        return cadena;
    }
	
	public static void msg(String cadenaAImprimir) {
        System.out.print(cadenaAImprimir);
    }
}

