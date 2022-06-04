package com.generation.f20220602;

public class Moto extends VehiculoTerrestre{
	private Boolean soporte;
    private String tipoMoto;
    private String posicionConduccion;
    
	public Moto() {
		super();
	}

	public Moto(Boolean soporte, String tipoMoto, String posicionConduccion) {
		super();
		this.soporte = soporte;
		this.tipoMoto = tipoMoto;
		this.posicionConduccion = posicionConduccion;
	}

	public Boolean getSoporte() {
		return soporte;
	}

	public void setSoporte(Boolean soporte) {
		this.soporte = soporte;
	}

	public String getTipoMoto() {
		return tipoMoto;
	}

	public void setTipoMoto(String tipoMoto) {
		this.tipoMoto = tipoMoto;
	}

	public String getPosicionConduccion() {
		return posicionConduccion;
	}

	public void setPosicionConduccion(String posicionConduccion) {
		this.posicionConduccion = posicionConduccion;
	}

	@Override
	public String toString() {
		return "Moto [soporte=" + soporte + ", tipoMoto=" + tipoMoto + ", posicionConduccion=" + posicionConduccion
				+ " super.toString() ]";
	}
    
	public void hacerSonido() {
		System.out.println("Fiiiiuuummmmmm");
	}
	
	public void baseApoyo() {
        System.out.println("Compa, disfrute su patita");
    }


}