package org.certificatic.contribuyente;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
    
    
    String sayby(String nombre);

}

