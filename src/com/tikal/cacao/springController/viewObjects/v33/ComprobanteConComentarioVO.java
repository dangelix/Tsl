package com.tikal.cacao.springController.viewObjects.v33;

import com.tikal.cacao.sat.cfd33.Comprobante;

public class ComprobanteConComentarioVO {

	private Comprobante comprobante;
	
	private String comentarios;
	
	private String noOrden;
	
	

	public String getNoOrden() {
		return noOrden;
	}

	public void setNoOrden(String noOrden) {
		this.noOrden = noOrden;
	}

	public Comprobante getComprobante() {
		return comprobante;
	}

	public void setComprobante(Comprobante comprobante) {
		this.comprobante = comprobante;
	}

	public String getComentario() {
		return comentarios;
	}

	public void setComentario(String comentario) {
		this.comentarios = comentario;
	}
	
	
}
