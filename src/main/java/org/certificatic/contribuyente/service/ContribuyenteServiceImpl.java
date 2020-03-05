package org.certificatic.contribuyente.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.contribuyente.model.Contribuyente;
import org.certificatic.contribuyente.repository.ContribuyenteRepository;
import org.certificatic.contribuyente.repository.ContribuyenteRepositoryImpl;

@WebService(endpointInterface = "org.certificatic.contribuyente.service.ContribuyenteService")
public class ContribuyenteServiceImpl implements ContribuyenteService {


	//En spring boot para injectar un objeto se utiliza la anotacion @Autowired
	ContribuyenteRepository contribuyenteRepository = new ContribuyenteRepositoryImpl();

	
	
	@Override
	public Contribuyente crearcontribuyente(Contribuyente contribuyente) {
		// TODO Auto-generated method stub
		return contribuyenteRepository.crearcontribuyente(contribuyente);
	}

	@Override
	public List<Contribuyente> obtenerContribuyentes() {
		// TODO Auto-generated method stub
		return contribuyenteRepository.obtenerContribuyentes();
	}

}
