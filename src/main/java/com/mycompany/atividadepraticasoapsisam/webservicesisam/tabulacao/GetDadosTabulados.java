
package com.mycompany.atividadepraticasoapsisam.webservicesisam.tabulacao;

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
 *         &lt;element name="opc_data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="data_inicial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="data_final" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="opc_estMun" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="municipio" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="vars" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
    "opcData",
    "dataInicial",
    "dataFinal",
    "mes",
    "ano",
    "opcEstMun",
    "estado",
    "municipio",
    "vars"
})
@XmlRootElement(name = "getDadosTabulados")
public class GetDadosTabulados {

    @XmlElement(name = "opc_data", required = true)
    protected String opcData;
    @XmlElement(name = "data_inicial", required = true)
    protected String dataInicial;
    @XmlElement(name = "data_final", required = true)
    protected String dataFinal;
    @XmlElement(required = true)
    protected List<String> mes;
    @XmlElement(required = true)
    protected List<String> ano;
    @XmlElement(name = "opc_estMun", required = true)
    protected String opcEstMun;
    @XmlElement(required = true)
    protected List<String> estado;
    @XmlElement(required = true)
    protected List<String> municipio;
    @XmlElement(required = true)
    protected List<String> vars;

    /**
     * Obtém o valor da propriedade opcData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcData() {
        return opcData;
    }

    /**
     * Define o valor da propriedade opcData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcData(String value) {
        this.opcData = value;
    }

    /**
     * Obtém o valor da propriedade dataInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInicial() {
        return dataInicial;
    }

    /**
     * Define o valor da propriedade dataInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInicial(String value) {
        this.dataInicial = value;
    }

    /**
     * Obtém o valor da propriedade dataFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFinal() {
        return dataFinal;
    }

    /**
     * Define o valor da propriedade dataFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFinal(String value) {
        this.dataFinal = value;
    }

    /**
     * Gets the value of the mes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMes() {
        if (mes == null) {
            mes = new ArrayList<String>();
        }
        return this.mes;
    }

    /**
     * Gets the value of the ano property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ano property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAno().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAno() {
        if (ano == null) {
            ano = new ArrayList<String>();
        }
        return this.ano;
    }

    /**
     * Obtém o valor da propriedade opcEstMun.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcEstMun() {
        return opcEstMun;
    }

    /**
     * Define o valor da propriedade opcEstMun.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcEstMun(String value) {
        this.opcEstMun = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEstado() {
        if (estado == null) {
            estado = new ArrayList<String>();
        }
        return this.estado;
    }

    /**
     * Gets the value of the municipio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the municipio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMunicipio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMunicipio() {
        if (municipio == null) {
            municipio = new ArrayList<String>();
        }
        return this.municipio;
    }

    /**
     * Gets the value of the vars property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vars property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVars().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVars() {
        if (vars == null) {
            vars = new ArrayList<String>();
        }
        return this.vars;
    }

}
