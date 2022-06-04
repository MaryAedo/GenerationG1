package com.generation.f20220602;

public class Camioneta extends VehiculoTerrestre{
	private Boolean calefaccion;
    private int numPuertas;
    private Boolean airbag;
    private Boolean cinturonSeguridad;
    
	public Camioneta() {
		super();
	}

	public Camioneta(Boolean calefaccion, int numPuertas, Boolean airbag, Boolean cinturoSeguridad) {
		super();
		this.calefaccion = calefaccion;
		this.numPuertas = numPuertas;
		this.airbag = airbag;
		this.cinturonSeguridad = cinturoSeguridad;
	}

	public Boolean getCalefaccion() {
		return calefaccion;
	}

	public void setCalefaccion(Boolean calefaccion) {
		this.calefaccion = calefaccion;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public Boolean getAirbag() {
		return airbag;
	}

	public void setAirbag(Boolean airbag) {
		this.airbag = airbag;
	}

	public Boolean getCinturoSeguridad() {
		return cinturonSeguridad;
	}

	public void setCinturoSeguridad(Boolean cinturoSeguridad) {
		this.cinturonSeguridad = cinturoSeguridad;
	}

	@Override
	public String toString() {
		return "Camioneta [calefaccion=" + calefaccion + ", numPuertas=" + numPuertas + ", airbag=" + airbag
				+ ", cinturoSeguridad=" + cinturonSeguridad + "]";
	}
    
	//Polimorfismo
    public String acelerar() {
        System.out.println("Bruuuum");
		return "Bruuuum";
    }

	 
	//Funcion
	public Boolean aireAcondicionado() {
	        System.out.println("Disfruta, tienes calefaccion para no resfriarte");
			return true;
	    }


}
