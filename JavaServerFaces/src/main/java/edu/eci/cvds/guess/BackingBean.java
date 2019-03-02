package edu.eci.cvds.guess;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="guessBean")
@SessionScoped
public class BackingBean {
	private int intentos;
	private int numeroAdivinar;
	private List<Intento> listaIntentos;
	
	public BackingBean() {
		listaIntentos = new ArrayList<Intento>();
		this.restart();
	}
	
	public List<Intento> getListaIntentos(){
		return this.listaIntentos;
	}
	public void setNumeroAdivinar(int numero) {
		this.numeroAdivinar = numero;
	}
	public int getNumeroAdivinar() {
		return this.numeroAdivinar;
	}
	public void guesss(int intento) {
		Intento in = new Intento();
		in.setNumeroIntentos(intentos);
		in.setnumeroUsuario(intento);
		if(intento == this.numeroAdivinar) {
			if(in.getPremio() == 0) {
				int rta = in.getPremio() + (100000 - (10000*(in.getNumeroIntento()-1)));
				if(rta < 0) {
					rta = 0;
				}
				in.setPremio(rta);
				in.setEstado("Gano: "+in.getPremio());
			}else {
				this.intentos--;
			}
		}else {
			in.setEstado("Perdió");
		}
		this.intentos++;
		listaIntentos.add(in);
	}
	
	public void restart() {
		this.numeroAdivinar = (int)(Math.random()*15)+1;
		this.listaIntentos = new ArrayList<Intento>();
	}
	
	
}
