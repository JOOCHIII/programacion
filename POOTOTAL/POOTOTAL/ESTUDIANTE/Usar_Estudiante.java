package ESTUDIANTE;

<<<<<<< HEAD

import javax.swing.JOptionPane;

public class Usar_Estudiante {

    public static void main(String[] args) {

        Estudiantes alumno = new Estudiantes();

        alumno.establece_nombre(JOptionPane.showInputDialog("Introduce el nombre"));
        System.out.println(alumno.dime_nombre());

        // Corrección: Convertir la entrada de edad a entero
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
        alumno.establece_edad(edad);
        System.out.println(alumno.dime_edad());

        // Corrección: Convertir la entrada de grado a entero
        int grado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el grado"));
        alumno.establece_grado(grado);
        System.out.println(alumno.dime_grado());
    }
=======
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

>>>>>>> branch 'master' of https://github.com/JOOCHIII/programacion
}
