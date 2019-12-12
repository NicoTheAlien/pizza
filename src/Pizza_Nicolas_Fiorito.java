public class Pizza_Nicolas_Fiorito {
	private String mida;
	private String tipus;
	private String estat;
	public static int demanades;
	public static int servides;
	private boolean estvar;
	public Pizza_Nicolas_Fiorito(String mida, String tipus) {
		this.mida = mida;
		this.tipus = tipus;
		this.estat = "demanada";
		this.estvar = false;
	}
	public void demana() {
		demanades = demanades + 1;
	}
	public void sirve() {
		if (estvar == false) {
		setEstat("servida");
		servides = servides + 1;
		setEstvar(true);
		}
		else {
			System.out.println("aquesta pizza ja s'ha servit");
		}
		
	}
	public String getMida() {
		return mida;
	}
	public void setMida(String mida) {
		this.mida = mida;
	}
	public String getTipus() {
		return tipus;
	}
	public void setTipus(String tipus) {
		this.tipus = tipus;
	}
	public String getEstat() {
		return estat;
	}
	public void setEstat(String estat) {
		this.estat = estat;
	}
	public static int getDemanades() {
		return demanades;
	}
	public void setDemanades(int demanades) {
		this.demanades = demanades;
	}
	public static int getServides() {
		return servides;
	}
	public void setServides(int servides) {
		this.servides = servides;
	}
	public boolean isEstvar() {
		return estvar;
	}
	public void setEstvar(boolean estvar) {
		this.estvar = estvar;
	}

}
