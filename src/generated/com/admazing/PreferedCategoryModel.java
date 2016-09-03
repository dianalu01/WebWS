
package com.admazing;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para preferedCategoryModel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="preferedCategoryModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://admazing.com/}categoryModel"/>
 *         &lt;element name="isPrefered" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "preferedCategoryModel", propOrder = {
    "category",
    "isPrefered"
})
public class PreferedCategoryModel
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected CategoryModel category;
    protected boolean isPrefered;

    /**
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link CategoryModel }
     *     
     */
    public CategoryModel getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryModel }
     *     
     */
    public void setCategory(CategoryModel value) {
        this.category = value;
    }

    /**
     * Obtiene el valor de la propiedad isPrefered.
     * 
     */
    public boolean isIsPrefered() {
        return isPrefered;
    }

    /**
     * Define el valor de la propiedad isPrefered.
     * 
     */
    public void setIsPrefered(boolean value) {
        this.isPrefered = value;
    }

}
