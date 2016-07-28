
package com.mycompany.atividadepraticasoapsisam.webservicesisam.tabulacao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de VariaveisView complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VariaveisView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aeros" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="aeros_incert" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="capital" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="conc_co_max" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="conc_co_med" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="conc_co_min" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="conc_pm_max" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="conc_pm_med" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="conc_pm_min" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dg_elet" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="focoq" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="geada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="geocodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="mesoregiao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="microregia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ondas_calor_max" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ondas_calor_med" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ondas_calor_min" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prec_acum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="rad_uv" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="regiao" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tempestade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tmp_ar_max" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tmp_ar_med" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tmp_ar_min" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="umid_ar_max" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="umid_ar_med" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="umid_ar_min" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="vento_dir" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vento_vel" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariaveisView", namespace = "urn:br.inpe.dsa.sisam.view", propOrder = {
    "aeros",
    "aerosIncert",
    "capital",
    "concCoMax",
    "concCoMed",
    "concCoMin",
    "concPmMax",
    "concPmMed",
    "concPmMin",
    "data",
    "dgElet",
    "estado",
    "focoq",
    "geada",
    "geocodigo",
    "gid",
    "latitude",
    "longitude",
    "mesoregiao",
    "microregia",
    "nome",
    "ondasCalorMax",
    "ondasCalorMed",
    "ondasCalorMin",
    "precAcum",
    "radUv",
    "regiao",
    "tempestade",
    "tmpArMax",
    "tmpArMed",
    "tmpArMin",
    "uf",
    "umidArMax",
    "umidArMed",
    "umidArMin",
    "ventoDir",
    "ventoVel"
})
public class VariaveisView {

    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double aeros;
    @XmlElement(name = "aeros_incert", required = true, type = Double.class, nillable = true)
    protected Double aerosIncert;
    @XmlElement(required = true, nillable = true)
    protected String capital;
    @XmlElement(name = "conc_co_max", required = true, type = Double.class, nillable = true)
    protected Double concCoMax;
    @XmlElement(name = "conc_co_med", required = true, type = Double.class, nillable = true)
    protected Double concCoMed;
    @XmlElement(name = "conc_co_min", required = true, type = Double.class, nillable = true)
    protected Double concCoMin;
    @XmlElement(name = "conc_pm_max", required = true, type = Double.class, nillable = true)
    protected Double concPmMax;
    @XmlElement(name = "conc_pm_med", required = true, type = Double.class, nillable = true)
    protected Double concPmMed;
    @XmlElement(name = "conc_pm_min", required = true, type = Double.class, nillable = true)
    protected Double concPmMin;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar data;
    @XmlElement(name = "dg_elet", required = true, type = Double.class, nillable = true)
    protected Double dgElet;
    @XmlElement(required = true, nillable = true)
    protected String estado;
    @XmlElement(required = true, type = Double.class, nillable = true)
    protected Double focoq;
    @XmlElement(required = true, nillable = true)
    protected String geada;
    @XmlElement(required = true, nillable = true)
    protected String geocodigo;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long gid;
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
    @XmlElement(name = "ondas_calor_max", required = true, nillable = true)
    protected String ondasCalorMax;
    @XmlElement(name = "ondas_calor_med", required = true, nillable = true)
    protected String ondasCalorMed;
    @XmlElement(name = "ondas_calor_min", required = true, nillable = true)
    protected String ondasCalorMin;
    @XmlElement(name = "prec_acum", required = true, type = Double.class, nillable = true)
    protected Double precAcum;
    @XmlElement(name = "rad_uv", required = true, type = Double.class, nillable = true)
    protected Double radUv;
    @XmlElement(required = true, nillable = true)
    protected String regiao;
    @XmlElement(required = true, nillable = true)
    protected String tempestade;
    @XmlElement(name = "tmp_ar_max", required = true, type = Double.class, nillable = true)
    protected Double tmpArMax;
    @XmlElement(name = "tmp_ar_med", required = true, type = Double.class, nillable = true)
    protected Double tmpArMed;
    @XmlElement(name = "tmp_ar_min", required = true, type = Double.class, nillable = true)
    protected Double tmpArMin;
    @XmlElement(required = true, nillable = true)
    protected String uf;
    @XmlElement(name = "umid_ar_max", required = true, type = Double.class, nillable = true)
    protected Double umidArMax;
    @XmlElement(name = "umid_ar_med", required = true, type = Double.class, nillable = true)
    protected Double umidArMed;
    @XmlElement(name = "umid_ar_min", required = true, type = Double.class, nillable = true)
    protected Double umidArMin;
    @XmlElement(name = "vento_dir", required = true, nillable = true)
    protected String ventoDir;
    @XmlElement(name = "vento_vel", required = true, type = Double.class, nillable = true)
    protected Double ventoVel;

    /**
     * Obtém o valor da propriedade aeros.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAeros() {
        return aeros;
    }

    /**
     * Define o valor da propriedade aeros.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAeros(Double value) {
        this.aeros = value;
    }

    /**
     * Obtém o valor da propriedade aerosIncert.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAerosIncert() {
        return aerosIncert;
    }

    /**
     * Define o valor da propriedade aerosIncert.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAerosIncert(Double value) {
        this.aerosIncert = value;
    }

    /**
     * Obtém o valor da propriedade capital.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapital() {
        return capital;
    }

    /**
     * Define o valor da propriedade capital.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapital(String value) {
        this.capital = value;
    }

    /**
     * Obtém o valor da propriedade concCoMax.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConcCoMax() {
        return concCoMax;
    }

    /**
     * Define o valor da propriedade concCoMax.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConcCoMax(Double value) {
        this.concCoMax = value;
    }

    /**
     * Obtém o valor da propriedade concCoMed.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConcCoMed() {
        return concCoMed;
    }

    /**
     * Define o valor da propriedade concCoMed.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConcCoMed(Double value) {
        this.concCoMed = value;
    }

    /**
     * Obtém o valor da propriedade concCoMin.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConcCoMin() {
        return concCoMin;
    }

    /**
     * Define o valor da propriedade concCoMin.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConcCoMin(Double value) {
        this.concCoMin = value;
    }

    /**
     * Obtém o valor da propriedade concPmMax.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConcPmMax() {
        return concPmMax;
    }

    /**
     * Define o valor da propriedade concPmMax.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConcPmMax(Double value) {
        this.concPmMax = value;
    }

    /**
     * Obtém o valor da propriedade concPmMed.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConcPmMed() {
        return concPmMed;
    }

    /**
     * Define o valor da propriedade concPmMed.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConcPmMed(Double value) {
        this.concPmMed = value;
    }

    /**
     * Obtém o valor da propriedade concPmMin.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getConcPmMin() {
        return concPmMin;
    }

    /**
     * Define o valor da propriedade concPmMin.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setConcPmMin(Double value) {
        this.concPmMin = value;
    }

    /**
     * Obtém o valor da propriedade data.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getData() {
        return data;
    }

    /**
     * Define o valor da propriedade data.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setData(XMLGregorianCalendar value) {
        this.data = value;
    }

    /**
     * Obtém o valor da propriedade dgElet.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDgElet() {
        return dgElet;
    }

    /**
     * Define o valor da propriedade dgElet.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDgElet(Double value) {
        this.dgElet = value;
    }

    /**
     * Obtém o valor da propriedade estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define o valor da propriedade estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtém o valor da propriedade focoq.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFocoq() {
        return focoq;
    }

    /**
     * Define o valor da propriedade focoq.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFocoq(Double value) {
        this.focoq = value;
    }

    /**
     * Obtém o valor da propriedade geada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeada() {
        return geada;
    }

    /**
     * Define o valor da propriedade geada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeada(String value) {
        this.geada = value;
    }

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
     * Obtém o valor da propriedade ondasCalorMax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOndasCalorMax() {
        return ondasCalorMax;
    }

    /**
     * Define o valor da propriedade ondasCalorMax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOndasCalorMax(String value) {
        this.ondasCalorMax = value;
    }

    /**
     * Obtém o valor da propriedade ondasCalorMed.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOndasCalorMed() {
        return ondasCalorMed;
    }

    /**
     * Define o valor da propriedade ondasCalorMed.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOndasCalorMed(String value) {
        this.ondasCalorMed = value;
    }

    /**
     * Obtém o valor da propriedade ondasCalorMin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOndasCalorMin() {
        return ondasCalorMin;
    }

    /**
     * Define o valor da propriedade ondasCalorMin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOndasCalorMin(String value) {
        this.ondasCalorMin = value;
    }

    /**
     * Obtém o valor da propriedade precAcum.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrecAcum() {
        return precAcum;
    }

    /**
     * Define o valor da propriedade precAcum.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrecAcum(Double value) {
        this.precAcum = value;
    }

    /**
     * Obtém o valor da propriedade radUv.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRadUv() {
        return radUv;
    }

    /**
     * Define o valor da propriedade radUv.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRadUv(Double value) {
        this.radUv = value;
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
     * Obtém o valor da propriedade tempestade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempestade() {
        return tempestade;
    }

    /**
     * Define o valor da propriedade tempestade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempestade(String value) {
        this.tempestade = value;
    }

    /**
     * Obtém o valor da propriedade tmpArMax.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTmpArMax() {
        return tmpArMax;
    }

    /**
     * Define o valor da propriedade tmpArMax.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTmpArMax(Double value) {
        this.tmpArMax = value;
    }

    /**
     * Obtém o valor da propriedade tmpArMed.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTmpArMed() {
        return tmpArMed;
    }

    /**
     * Define o valor da propriedade tmpArMed.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTmpArMed(Double value) {
        this.tmpArMed = value;
    }

    /**
     * Obtém o valor da propriedade tmpArMin.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTmpArMin() {
        return tmpArMin;
    }

    /**
     * Define o valor da propriedade tmpArMin.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTmpArMin(Double value) {
        this.tmpArMin = value;
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

    /**
     * Obtém o valor da propriedade umidArMax.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUmidArMax() {
        return umidArMax;
    }

    /**
     * Define o valor da propriedade umidArMax.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUmidArMax(Double value) {
        this.umidArMax = value;
    }

    /**
     * Obtém o valor da propriedade umidArMed.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUmidArMed() {
        return umidArMed;
    }

    /**
     * Define o valor da propriedade umidArMed.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUmidArMed(Double value) {
        this.umidArMed = value;
    }

    /**
     * Obtém o valor da propriedade umidArMin.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUmidArMin() {
        return umidArMin;
    }

    /**
     * Define o valor da propriedade umidArMin.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUmidArMin(Double value) {
        this.umidArMin = value;
    }

    /**
     * Obtém o valor da propriedade ventoDir.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVentoDir() {
        return ventoDir;
    }

    /**
     * Define o valor da propriedade ventoDir.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVentoDir(String value) {
        this.ventoDir = value;
    }

    /**
     * Obtém o valor da propriedade ventoVel.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVentoVel() {
        return ventoVel;
    }

    /**
     * Define o valor da propriedade ventoVel.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVentoVel(Double value) {
        this.ventoVel = value;
    }

}
