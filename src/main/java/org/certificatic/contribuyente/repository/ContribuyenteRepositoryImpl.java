package org.certificatic.contribuyente.repository;

import java.util.ArrayList;
import java.util.List;

import org.certificatic.contribuyente.model.Contribuyente;


public class ContribuyenteRepositoryImpl implements ContribuyenteRepository {
	// ContribuyenteRepositoryImpl simulacion pura a acceso de base de datos
	// lista estatica de contribuyente

	private static List<Contribuyente> contribuyentes = new ArrayList<Contribuyente>();

	@Override
	public Contribuyente crearcontribuyente(Contribuyente contribuyente) {
		System.out.println("Crear Contribuyente...");
		contribuyentes.add(contribuyente);
		return null;
	}

	@Override
	public List<Contribuyente> obtenerContribuyentes() {
		System.out.println("Obtener todos los contribuyentes...");
		return contribuyentes;
	}

}
