
package org.certificatic.contribuyente;

import javax.jws.WebService;

@WebService(endpointInterface = "org.certificatic.contribuyente.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }

	@Override
	public String sayby(String nombre) {
		// TODO Auto-generated method stub
		return "Adios:" +nombre;
	}
  
}

