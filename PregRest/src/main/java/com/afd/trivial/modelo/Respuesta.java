package com.afd.trivial.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Respuesta {
	
	@Id
	@GeneratedValue
	private int idRespuesta;
	private String texto;
	private boolean correcta;
	
	public Respuesta(int idRespuesta, String texto, boolean correcta) {
		this.idRespuesta = idRespuesta;
		this.texto = texto;
		this.correcta = correcta;
	}

	public int getIdRespuesta() {
		return idRespuesta;
	}

	public void setIdRespuesta(int idRespuesta) {
		this.idRespuesta = idRespuesta;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public boolean isCorrecta() {
		return correcta;
	}

	public void setCorrecta(boolean correcta) {
		this.correcta = correcta;
	}
	
}
