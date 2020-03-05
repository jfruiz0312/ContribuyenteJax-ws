package org.certificatic.contribuyente.repository;

import java.util.List;

import org.certificatic.contribuyente.model.Contribuyente;

public interface ContribuyenteRepository {
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
