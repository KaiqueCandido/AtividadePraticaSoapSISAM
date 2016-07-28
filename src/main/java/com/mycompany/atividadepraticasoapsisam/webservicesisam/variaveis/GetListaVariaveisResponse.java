
package com.mycompany.atividadepraticasoapsisam.webservicesisam.variaveis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getListaVariaveisReturn" type="{urn:br.inpe.dsa.sisam.view}VarWebServiceView" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getListaVariaveisReturn"
})
@XmlRootElement(name = "getListaVariaveisResponse")
public class GetListaVariaveisResponse {

    @XmlElement(required = true)
    protected List<VarWebServiceView> getListaVariaveisReturn;

    /**
     * Gets the value of the getListaVariaveisReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getListaVariaveisReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetListaVariaveisReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VarWebServiceView }
     * 
     * 
     */
    public List<VarWebServiceView> getGetListaVariaveisReturn() {
        if (getListaVariaveisReturn == null) {
            getListaVariaveisReturn = new ArrayList<VarWebServiceView>();
        }
        return this.getListaVariaveisReturn;
    }

}
