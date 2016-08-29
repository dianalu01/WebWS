
package com.admazing;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para preferenceModel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="preferenceModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPreference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preferenceModel", propOrder = {
    "idPreference",
    "idUser",
    "idCategory"
})
public class PreferenceModel
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String idPreference;
    @XmlElement(required = true)
    protected String idUser;
    @XmlElement(required = true)
    protected String idCategory;

    /**
     * Obtiene el valor de la propiedad idPreference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPreference() {
        return idPreference;
    }

    /**
     * Define el valor de la propiedad idPreference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPreference(String value) {
        this.idPreference = value;
    }

    /**
     * Obtiene el valor de la propiedad idUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUser() {
        return idUser;
    }

    /**
     * Define el valor de la propiedad idUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUser(String value) {
        this.idUser = value;
    }

    /**
     * Obtiene el valor de la propiedad idCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCategory() {
        return idCategory;
    }

    /**
     * Define el valor de la propiedad idCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCategory(String value) {
        this.idCategory = value;
    }

}
