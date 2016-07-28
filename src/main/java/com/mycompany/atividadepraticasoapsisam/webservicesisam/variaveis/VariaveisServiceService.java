
package com.mycompany.atividadepraticasoapsisam.webservicesisam.variaveis;

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
 * Lista variaveis  
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "VariaveisServiceService", targetNamespace = "http://sisam.cptec.inpe.br/sisam_webservice/services/VariaveisWebService", wsdlLocation = "http://sisam.cptec.inpe.br/sisam_webservice/services/VariaveisWebService?wsdl")
public class VariaveisServiceService
    extends Service
{

    private final static URL VARIAVEISSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException VARIAVEISSERVICESERVICE_EXCEPTION;
    private final static QName VARIAVEISSERVICESERVICE_QNAME = new QName("http://sisam.cptec.inpe.br/sisam_webservice/services/VariaveisWebService", "VariaveisServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://sisam.cptec.inpe.br/sisam_webservice/services/VariaveisWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VARIAVEISSERVICESERVICE_WSDL_LOCATION = url;
        VARIAVEISSERVICESERVICE_EXCEPTION = e;
    }

    public VariaveisServiceService() {
        super(__getWsdlLocation(), VARIAVEISSERVICESERVICE_QNAME);
    }

    public VariaveisServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns VariaveisService
     */
    @WebEndpoint(name = "VariaveisWebService")
    public VariaveisService getVariaveisWebService() {
        return super.getPort(new QName("http://sisam.cptec.inpe.br/sisam_webservice/services/VariaveisWebService", "VariaveisWebService"), VariaveisService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VariaveisService
     */
    @WebEndpoint(name = "VariaveisWebService")
    public VariaveisService getVariaveisWebService(WebServiceFeature... features) {
        return super.getPort(new QName("http://sisam.cptec.inpe.br/sisam_webservice/services/VariaveisWebService", "VariaveisWebService"), VariaveisService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VARIAVEISSERVICESERVICE_EXCEPTION!= null) {
            throw VARIAVEISSERVICESERVICE_EXCEPTION;
        }
        return VARIAVEISSERVICESERVICE_WSDL_LOCATION;
    }

}
