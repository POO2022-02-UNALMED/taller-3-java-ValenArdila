package taller3.televisores;

public class TV {
	Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	private static int numTv;
	
	public TV(Marca marca, boolean estado) {
		this.marca=marca;
		this.estado=estado;
		numTv++;
	}
	public static void setNumTv(int numTv) {
		TV.numTv=numTv;
	}
	public static int getNumTv() {
		return numTv;
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
		if(estado==true) {
			if(this.canal>0 || this.canal<120) {
				this.canal++;
			}
		}
	}
	public void canalDown() {
		if(estado==true) {
			if(this.canal>1 || this.canal<120) {
				this.canal--;
			}
		}
	}
	public void volumenUp() {
		if(estado==true) {
			if(this.volumen>0 || this.volumen<7) {
				this.volumen++;
			}
		}
	}
	public void volumenDown() {
		if(estado==true) {
			if(volumen>0 || this.volumen<7) {
				this.volumen--;
			}
		}
	}
	
}
