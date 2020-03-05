package org.certificatic.contribuyente.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.contribuyente.model.Contribuyente;

@WebService //Va estar publicada como un WebServices
public interface ContribuyenteService {
	
	/**
	 * M�todo para crear un nuevo contribuyente
	 * @param contribuyente
	 * @return contribuyente Creado
	 */

	Contribuyente crearcontribuyente(Contribuyente contribuyente);
	
	/**
	 * M�todo para obtener todos los contribuyentes
	 * @return
	 */
	
	public List<Contribuyente>obtenerContribuyentes();

}
