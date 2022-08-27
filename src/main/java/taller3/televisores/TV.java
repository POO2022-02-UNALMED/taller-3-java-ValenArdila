package taller3.televisores;

public class TV {
	Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca=marca;
		this.estado=estado;
		numTV++;
	}
	public static void setNumTV(int numTV) {
		TV.numTV=numTV;
	}
	public static int getNumTV() {
		return numTV;
	}
	public void setMarca(Marca marca) {
		this.marca=marca;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setControl(Control control) {
		this.control=control;
	}	
	public Control getControl() {
		return control;
	}
	public void setPrecio(int precio) {
		this.precio=precio;	
	}
	public int getPrecio() {
		return precio;
	}
	public void setVolumen(int volumen) {
		this.volumen=volumen;	
	}
	public int getVolumen() {
		return volumen;
	}	
	public void setCanal(int canal) {
		this.canal=canal;	
	}
	public int getCanal() {
		return canal;
	}	
	public void turnOn() {
		if(this.estado==false) {
			this.estado=true;
		}
	}
	public void turnOff() {
		if(this.estado==true) {
			this.estado=false;
		}
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if(this.estado==true) {
			if(this.canal>0 || this.canal<120) {
				this.canal++;
			}
		}
	}
	public void canalDown() {
		if(this.estado==true) {
			if(this.canal>1 || this.canal<121) {
				this.canal--;
			}
		}
	}
	public void volumenUp() {
		if(this.estado==true) {
			if(this.volumen>0 || this.volumen<7) {
				this.volumen++;
			}
		}
	}
	public void volumenDown() {
		if(this.estado==true) {
			if(volumen>0 || this.volumen<7) {
				this.volumen--;
			}
		}
	}
	
}
