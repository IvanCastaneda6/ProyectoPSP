package Proyecto;

public class Usuario {

			
		 	private String gmail;
		    private String nombre;
		    private String apellidos;
		    private String telefono;
		    private int cpostal;

		    // Constructor
		    public Usuario(String gmail, String nombre, String apellidos, String telefono, int cpostal) {
		        this.gmail = gmail;
		        this.nombre = nombre;
		        this.apellidos = apellidos;
		        this.telefono = telefono;
		  		this.cpostal = cpostal;
		    }

		    // Getters & Setters   
		    public String getEmail() {
		        return gmail;
		    }

		    public void setEmail(String gmail) {
		        this.gmail = gmail;
		    }

		    public String getNombre() {
		        return nombre;
		    }

		    public void setNombre(String nombre) {
		        this.nombre = nombre;
		    }

		    public String getApellidos() {
		        return apellidos;
		    }

		    public void setApellidos(String apellidos) {
		        this.apellidos = apellidos;
		    }

		    public String getTelefono() {
		        return telefono;
		    }

		    public void setTelefono(String telefono) {
		        this.telefono = telefono;
		    }

		    
		    public int getCpostal() {
		        return cpostal;
		    }

		    public void setCpostal(int cpostal) {
		        this.cpostal = cpostal;
		    }

		
		    @Override
		    public String toString() {
		        return "\nUsuario:\n" + "Email : " + gmail + "\nNombre : " + nombre 
		                + "\nApellidos : " + apellidos + "\nTel�fono : " + telefono 
		                 + "\nC�digo Postal : " + cpostal + ".\n";
		    }
	}


