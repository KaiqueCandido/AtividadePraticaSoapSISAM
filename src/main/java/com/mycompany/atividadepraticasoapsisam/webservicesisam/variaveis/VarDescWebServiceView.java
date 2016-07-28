
package com.mycompany.atividadepraticasoapsisam.webservicesisam.variaveis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VarDescWebServiceView complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VarDescWebServiceView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="altitude_nivel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="medida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nome_banco" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="origem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="periodicidade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resolucao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VarDescWebServiceView", namespace = "urn:br.inpe.dsa.sisam.view", propOrder = {
    "altitudeNivel",
    "medida",
    "nome",
    "nomeBanco",
    "origem",
    "periodicidade",
    "resolucao"
})
public class VarDescWebServiceView {

    @XmlElement(name = "altitude_nivel", required = true, nillable = true)
    protected String altitudeNivel;
    @XmlElement(required = true, nillable = true)
    protected String medida;
    @XmlElement(required = true, nillable = true)
    protected String nome;
    @XmlElement(name = "nome_banco", required = true, nillable = true)
    protected String nomeBanco;
    @XmlElement(required = true, nillable = true)
    protected String origem;
    @XmlElement(required = true, nillable = true)
    protected String periodicidade;
    @XmlElement(required = true, nillable = true)
    protected String resolucao;

    /**
     * Obtém o valor da propriedade altitudeNivel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltitudeNivel() {
        return altitudeNivel;
    }

    /**
     * Define o valor da propriedade altitudeNivel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltitudeNivel(String value) {
        this.altitudeNivel = value;
    }

    /**
     * Obtém o valor da propriedade medida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedida() {
        return medida;
    }

    /**
     * Define o valor da propriedade medida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedida(String value) {
        this.medida = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade nomeBanco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeBanco() {
        return nomeBanco;
    }

    /**
     * Define o valor da propriedade nomeBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeBanco(String value) {
        this.nomeBanco = value;
    }

    /**
     * Obtém o valor da propriedade origem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigem() {
        return origem;
    }

    /**
     * Define o valor da propriedade origem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigem(String value) {
        this.origem = value;
    }

    /**
     * Obtém o valor da propriedade periodicidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodicidade() {
        return periodicidade;
    }

    /**
     * Define o valor da propriedade periodicidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodicidade(String value) {
        this.periodicidade = value;
    }

    /**
     * Obtém o valor da propriedade resolucao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolucao() {
        return resolucao;
    }

    /**
     * Define o valor da propriedade resolucao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolucao(String value) {
        this.resolucao = value;
    }

}
