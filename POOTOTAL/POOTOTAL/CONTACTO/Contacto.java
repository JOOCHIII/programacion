package CONTACTO;

public class Contacto {
	
	private String nombreContacto;
<<<<<<< HEAD
	private String numeroTelefono;
	private String emailContacto;
	
	public Contacto(String nombre, String num, String email) {
		this.nombreContacto = nombre;
		this.numeroTelefono = num;
		this.emailContacto = email;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	// Corrección: Cambié el tipo de retorno de int a String para el número de teléfono
	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	// Corrección: Cambié el tipo de parámetro de int a String para el número de teléfono
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getEmailContacto() {
		return emailContacto;
	}

	public void setEmailContacto(String emailContacto) {
		this.emailContacto = emailContacto;
	}


	public String CONTACTO() {
		String menu = "Nombre del contacto: " + this.nombreContacto;
		menu += "\n---------------------------------------\n";
		menu += "\n Numero del contacto: " + this.numeroTelefono;
		menu += "\n---------------------------------------\n";
		menu += "\n Email del contacto: " + this.emailContacto + "\n";
		menu += "\n---------------------------------------\n";
		return menu;
	}
=======
	private int numeroTelefono;
	private String emailContacto;
	
public Contacto(String nombre,String string,String email) {
	this.nombreContacto=nombre;
	this.numeroTelefono= String;
	this.emailContacto=email;
}

public String getNombreContacto() {
	return nombreContacto;
}

public void setNombreContacto(String nombreContacto) {
	this.nombreContacto = nombreContacto;
}

public int getNumeroTelefono() {
	return numeroTelefono;
}

public void setNumeroTelefono(int numeroTelefono) {
	this.numeroTelefono = numeroTelefono;
}

public String getEmailContacto() {
	return emailContacto;
}

public void setEmailContacto(String emailContacto) {
	this.emailContacto = emailContacto;
}
public String Contacto() {
	String menu = "Nombre del contacto: " + this.nombreContacto;
	menu += "\n---------------------------------------\n";
	menu += "\n Numero del contacto: " + this.numeroTelefono;
	menu += "\n---------------------------------------\n";
	menu += "\n Email del contacto: " + this.emailContacto + "\n";
	menu += "\n---------------------------------------\n";
	return menu;
}

>>>>>>> branch 'master' of https://github.com/JOOCHIII/programacion
}
