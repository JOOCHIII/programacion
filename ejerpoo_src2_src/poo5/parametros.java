package poo5;

import java.util.*;


public class parametros {
	  public static void main(String[] args) {

	    }

	}

	class empleado {

	    public empleado(String nom, double sue, int agno, int mes, int dia) {

	        nombre = nom;
	        sueldo = sue;

	        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
	        alta_contrato = calendario.getTime();

	    }

	    public String dameNombre() {
	        return nombre;
	    }

	    private double dameSueldo() {
	        return sueldo;
	    }

	    public Date dameCechaContrato() {
	        return alta_contrato;
	    }

	    public void subeSueldo(double porcentaje) {
	        double aumento = sueldo*porcentaje/100;
	        sueldo += aumento;
	    }

	    private String nombre;
	    private double sueldo;
	    private Date alta_contrato;

	}