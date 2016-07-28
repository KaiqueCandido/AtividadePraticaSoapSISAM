
package com.mycompany.atividadepraticasoapsisam.webservicesisam.municipios;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.atividadepraticasoapsisam.webservicesisam.municipios package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.atividadepraticasoapsisam.webservicesisam.municipios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PontosMunicipais }
     * 
     */
    public PontosMunicipais createPontosMunicipais() {
        return new PontosMunicipais();
    }

    /**
     * Create an instance of {@link Estados }
     * 
     */
    public Estados createEstados() {
        return new Estados();
    }

    /**
     * Create an instance of {@link GetMunicipios }
     * 
     */
    public GetMunicipios createGetMunicipios() {
        return new GetMunicipios();
    }

    /**
     * Create an instance of {@link GetEstados }
     * 
     */
    public GetEstados createGetEstados() {
        return new GetEstados();
    }

    /**
     * Create an instance of {@link GetEstadosResponse }
     * 
     */
    public GetEstadosResponse createGetEstadosResponse() {
        return new GetEstadosResponse();
    }

    /**
     * Create an instance of {@link GetMunicipiosResponse }
     * 
     */
    public GetMunicipiosResponse createGetMunicipiosResponse() {
        return new GetMunicipiosResponse();
    }

}
