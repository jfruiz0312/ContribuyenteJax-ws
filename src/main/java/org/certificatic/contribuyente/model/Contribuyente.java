package org.certificatic.contribuyente.model;

public class Contribuyente {
	private int codigo;
	private String nombreContribuyente;
	private String numeroRegistro;
	private String nit;
	private String razonSocial;
	private String giro;
	private String direccion;
	private String fecha;
	//private ClienteEnum tipoContribuyente;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombreContribuyente() {
		return nombreContribuyente;
	}
	public void setNombreContribuyente(String nombreContribuyente) {
		this.nombreContribuyente = nombreContribuyente;
	}
	public String getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getGiro() {
		return giro;
	}
	public void setGiro(String giro) {
		this.giro = giro;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
