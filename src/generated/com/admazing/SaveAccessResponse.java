
package com.admazing;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para saveAccessResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="saveAccessResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nameCommercialArea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "saveAccessResponse", propOrder = {
    "result",
    "nameCommercialArea"
})
public class SaveAccessResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected boolean result;
    @XmlElement(required = true)
    protected String nameCommercialArea;

    /**
     * Obtiene el valor de la propiedad result.
     * 
     */
    public boolean isResult() {
        return result;
    }

    /**
     * Define el valor de la propiedad result.
     * 
     */
    public void setResult(boolean value) {
        this.result = value;
    }

    /**
     * Obtiene el valor de la propiedad nameCommercialArea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameCommercialArea() {
        return nameCommercialArea;
    }

    /**
     * Define el valor de la propiedad nameCommercialArea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameCommercialArea(String value) {
        this.nameCommercialArea = value;
    }

}
