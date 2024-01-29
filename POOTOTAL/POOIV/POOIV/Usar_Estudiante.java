package POOIV;

import javax.swing.JOptionPane;

public class Usar_Estudiante {

	public static void main(String[] args) {
		
		Estudiantes alumno = new Estudiantes();
		
		alumno.establece_nombre(JOptionPane.showInputDialog("Introduce el nombre"));
		System.out.println(alumno.dime_nombre());
		alumno.establece_edad(JOptionPane.showInputDialog("Introduce la edad"));
		System.out.println(alumno.dime_edad());
		alumno.establece_grado(JOptionPane.showInputDialog("Introduce el grado"));
		System.out.println(alumno.dime_grado());
	}

}
