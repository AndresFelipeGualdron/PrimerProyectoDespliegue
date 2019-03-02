 @ManagedBean(name="guessBean")
 @ApplicationScoped


public class BackingBean {
	
	
	
	private int numeroAdivinar;
	private int intentos;
	private int premio;
	private String estado;
	private int numeroUsuario;
	
	public BackingBean() {
		this.restart();
	}
	
	public int getNumeroAdivinar() {
		return this.numeroAdivinar;
	}
	public int getIntentos() {
		return this.intentos;
	}
	public int getPremio() {
		return this.premio;
	}
	public String getEstado() {
		return this.estado;
	}
	public void setNumeroAdivinar(int numero) {
		this.numeroAdivinar = numero;
	}
	public void setIntentos(int intentos) {
		this.intentos = intentos;
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
	
	public void guess(int intento) {
		if(intento == this.numeroAdivinar) {
			int rta = this.premio + (100000 - (10000*(this.intentos-1)));
			if(rta < 0) {
				rta = 0;
			}
			this.premio = rta;
			this.estado = "Gano: "+this.premio;
		}else {
			this.intentos++;
			this.estado = "Perdió";
		}
	}
	
	public void restart() {
		this.premio = 0;
		this.intentos = 0;
		this.estado = "Inicio";
		this.numeroAdivinar = (int)(Math.random()*10000)+1;
	}
	
	
}
