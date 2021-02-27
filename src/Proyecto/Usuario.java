package Proyecto;

public class Usuario {

			
		 	private String gmail;
		    private String nombre;
		    private String apellidos;
		    private String telefono;
		    private int cpostal;
		    private String fechaNac;

		    // Constructor
		    public Usuario(String gmail, String nombre, String apellidos, String telefono, int cpostal, String fechaNac) {
		        this.gmail = gmail;
		        this.nombre = nombre;
		        this.apellidos = apellidos;
		        this.telefono = telefono;
		  		this.cpostal = cpostal;
		  		this.fechaNac = fechaNac;
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
		    
		    public String getFechaNac() {
		        return fechaNac;
		    }

		    public void setFechaNac(String fechaNac) {
		        this.fechaNac = fechaNac;
		    }
		
		    @Override
		    public String toString() {
		        return "\nUsuario:\n" + "Email : " + gmail + "\nNombre : " + nombre 
		                + "\nApellidos : " + apellidos + "\nTeléfono : " + telefono 
		                 + "\nCódigo Postal : " + cpostal + ".\n"
		                 + "\nFecha de Nacimiento : " + fechaNac + ".\n";
		    }
	}


