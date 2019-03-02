package edu.eci.cvds.guess;

import java.util.List;

public class Intento {
	
	private int numeroIntento;
	private int premio;
	private String estado;
	private int numeroUsuario;
	
	
	
	public int getNumeroIntento() {
		return this.numeroIntento;
	}
	public int getPremio() {
		return this.premio;
	}
	public String getEstado() {
		return this.estado;
	}
	
	public void setNumeroIntentos(int intentos) {
		this.numeroIntento = intentos;
	}
	public void setPremio(int premio) {
		this.premio = premio;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setnumeroUsuario(int numero) {
		this.numeroUsuario = numero;
	}
	public int getNumeroUsuario() {
		return this.numeroUsuario;
	}
	
}
