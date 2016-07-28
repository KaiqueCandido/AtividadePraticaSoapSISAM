
package com.mycompany.atividadepraticasoapsisam.webservicesisam.municipios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Pontos_municipais complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Pontos_municipais">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="geocodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="id_previsao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="mesoregiao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="microregia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regiao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sede" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pontos_municipais", namespace = "urn:br.inpe.dsa.sisam.modelo", propOrder = {
    "geocodigo",
    "gid",
    "idPrevisao",
    "idUf",
    "latitude",
    "longitude",
    "mesoregiao",
    "microregia",
    "nome",
    "regiao",
    "sede",
    "uf"
})
public class PontosMunicipais {

    @XmlElement(required = true, nillable = true)
    protected String geocodigo;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long gid;
    @XmlElement(name = "id_previsao", required = true, type = Integer.class, nillable = true)
    protected Integer idPrevisao;
    @XmlElement(name = "id_uf", required = true, nillable = true)
    protected String idUf;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double latitude;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double longitude;
    @XmlElement(required = true, nillable = true)
    protected String mesoregiao;
    @XmlElement(required = true, nillable = true)
    protected String microregia;
    @XmlElement(required = true, nillable = true)
    protected String nome;
    @XmlElement(required = true, nillable = true)
    protected String regiao;
    @XmlElement(required = true, nillable = true)
    protected String sede;
    @XmlElement(required = true, nillable = true)
    protected String uf;

    /**
     * Obtém o valor da propriedade geocodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeocodigo() {
        return geocodigo;
    }

    /**
     * Define o valor da propriedade geocodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeocodigo(String value) {
        this.geocodigo = value;
    }

    /**
     * Obtém o valor da propriedade gid.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGid() {
        return gid;
    }

    /**
     * Define o valor da propriedade gid.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGid(Long value) {
        this.gid = value;
    }

    /**
     * Obtém o valor da propriedade idPrevisao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdPrevisao() {
        return idPrevisao;
    }

    /**
     * Define o valor da propriedade idPrevisao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdPrevisao(Integer value) {
        this.idPrevisao = value;
    }

    /**
     * Obtém o valor da propriedade idUf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUf() {
        return idUf;
    }

    /**
     * Define o valor da propriedade idUf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUf(String value) {
        this.idUf = value;
    }

    /**
     * Obtém o valor da propriedade latitude.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Define o valor da propriedade latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    /**
     * Obtém o valor da propriedade longitude.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Define o valor da propriedade longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    /**
     * Obtém o valor da propriedade mesoregiao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesoregiao() {
        return mesoregiao;
    }

    /**
     * Define o valor da propriedade mesoregiao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesoregiao(String value) {
        this.mesoregiao = value;
    }

    /**
     * Obtém o valor da propriedade microregia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMicroregia() {
        return microregia;
    }

    /**
     * Define o valor da propriedade microregia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMicroregia(String value) {
        this.microregia = value;
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
     * Obtém o valor da propriedade regiao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegiao() {
        return regiao;
    }

    /**
     * Define o valor da propriedade regiao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegiao(String value) {
        this.regiao = value;
    }

    /**
     * Obtém o valor da propriedade sede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSede() {
        return sede;
    }

    /**
     * Define o valor da propriedade sede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSede(String value) {
        this.sede = value;
    }

    /**
     * Obtém o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUf() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUf(String value) {
        this.uf = value;
    }

}
