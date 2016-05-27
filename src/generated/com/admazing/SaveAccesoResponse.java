
package com.admazing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para saveAccesoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="saveAccesoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nombreZonaComercial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveAccesoResponse", propOrder = {
    "resultado",
    "nombreZonaComercial"
})
public class SaveAccesoResponse {

    protected boolean resultado;
    @XmlElement(required = true)
    protected String nombreZonaComercial;

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     */
    public boolean isResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     */
    public void setResultado(boolean value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreZonaComercial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreZonaComercial() {
        return nombreZonaComercial;
    }

    /**
     * Define el valor de la propiedad nombreZonaComercial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreZonaComercial(String value) {
        this.nombreZonaComercial = value;
    }

}
