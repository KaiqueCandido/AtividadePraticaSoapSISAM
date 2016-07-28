
package com.mycompany.atividadepraticasoapsisam.webservicesisam.variaveis;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.atividadepraticasoapsisam.webservicesisam.variaveis package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.atividadepraticasoapsisam.webservicesisam.variaveis
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VarWebServiceView }
     * 
     */
    public VarWebServiceView createVarWebServiceView() {
        return new VarWebServiceView();
    }

    /**
     * Create an instance of {@link VarDescWebServiceView }
     * 
     */
    public VarDescWebServiceView createVarDescWebServiceView() {
        return new VarDescWebServiceView();
    }

    /**
     * Create an instance of {@link GetListaVariaveisDescResponse }
     * 
     */
    public GetListaVariaveisDescResponse createGetListaVariaveisDescResponse() {
        return new GetListaVariaveisDescResponse();
    }

    /**
     * Create an instance of {@link GetListaVariaveis }
     * 
     */
    public GetListaVariaveis createGetListaVariaveis() {
        return new GetListaVariaveis();
    }

    /**
     * Create an instance of {@link GetListaVariaveisDesc }
     * 
     */
    public GetListaVariaveisDesc createGetListaVariaveisDesc() {
        return new GetListaVariaveisDesc();
    }

    /**
     * Create an instance of {@link GetListaVariaveisResponse }
     * 
     */
    public GetListaVariaveisResponse createGetListaVariaveisResponse() {
        return new GetListaVariaveisResponse();
    }

}
