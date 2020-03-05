package org.certificatic.contribuyente.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.contribuyente.model.Contribuyente;

@WebService //Va estar publicada como un WebServices
public interface ContribuyenteService {
	
	/**
	 * Método para crear un nuevo contribuyente
	 * @param contribuyente
	 * @return contribuyente Creado
	 */

	Contribuyente crearcontribuyente(Contribuyente contribuyente);
	
	/**
	 * Método para obtener todos los contribuyentes
	 * @return
	 */
	
	public List<Contribuyente>obtenerContribuyentes();

}
