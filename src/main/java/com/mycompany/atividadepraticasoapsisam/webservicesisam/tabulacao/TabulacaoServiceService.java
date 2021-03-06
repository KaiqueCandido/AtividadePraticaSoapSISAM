
package com.mycompany.atividadepraticasoapsisam.webservicesisam.tabulacao;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * 
 * Resultado da pesquisa, retorna os dados em forma tabulada  
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "TabulacaoServiceService", targetNamespace = "http://sisam.cptec.inpe.br/sisam_webservice/services/TabulacaoWebService", wsdlLocation = "http://sisam.cptec.inpe.br/sisam_webservice/services/TabulacaoWebService?wsdl")
public class TabulacaoServiceService
    extends Service
{

    private final static URL TABULACAOSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException TABULACAOSERVICESERVICE_EXCEPTION;
    private final static QName TABULACAOSERVICESERVICE_QNAME = new QName("http://sisam.cptec.inpe.br/sisam_webservice/services/TabulacaoWebService", "TabulacaoServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://sisam.cptec.inpe.br/sisam_webservice/services/TabulacaoWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TABULACAOSERVICESERVICE_WSDL_LOCATION = url;
        TABULACAOSERVICESERVICE_EXCEPTION = e;
    }

    public TabulacaoServiceService() {
        super(__getWsdlLocation(), TABULACAOSERVICESERVICE_QNAME);
    }

    public TabulacaoServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns TabulacaoService
     */
    @WebEndpoint(name = "TabulacaoWebService")
    public TabulacaoService getTabulacaoWebService() {
        return super.getPort(new QName("http://sisam.cptec.inpe.br/sisam_webservice/services/TabulacaoWebService", "TabulacaoWebService"), TabulacaoService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TabulacaoService
     */
    @WebEndpoint(name = "TabulacaoWebService")
    public TabulacaoService getTabulacaoWebService(WebServiceFeature... features) {
        return super.getPort(new QName("http://sisam.cptec.inpe.br/sisam_webservice/services/TabulacaoWebService", "TabulacaoWebService"), TabulacaoService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TABULACAOSERVICESERVICE_EXCEPTION!= null) {
            throw TABULACAOSERVICESERVICE_EXCEPTION;
        }
        return TABULACAOSERVICESERVICE_WSDL_LOCATION;
    }

}
