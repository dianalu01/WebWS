
package com.admazing;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para promotionModel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="promotionModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPromotion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idCategory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idTypePromotion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idStore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="imagePromotion" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promotionModel", propOrder = {
    "idPromotion",
    "idCategory",
    "idTypePromotion",
    "idStore",
    "description",
    "startDate",
    "endDate",
    "imagePromotion"
})
public class PromotionModel
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String idPromotion;
    @XmlElement(required = true)
    protected String idCategory;
    @XmlElement(required = true)
    protected String idTypePromotion;
    @XmlElement(required = true)
    protected String idStore;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date startDate;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDate;
    @XmlElement(required = true)
    protected byte[] imagePromotion;

    /**
     * Obtiene el valor de la propiedad idPromotion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPromotion() {
        return idPromotion;
    }

    /**
     * Define el valor de la propiedad idPromotion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPromotion(String value) {
        this.idPromotion = value;
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

    /**
     * Obtiene el valor de la propiedad idTypePromotion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTypePromotion() {
        return idTypePromotion;
    }

    /**
     * Define el valor de la propiedad idTypePromotion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTypePromotion(String value) {
        this.idTypePromotion = value;
    }

    /**
     * Obtiene el valor de la propiedad idStore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdStore() {
        return idStore;
    }

    /**
     * Define el valor de la propiedad idStore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdStore(String value) {
        this.idStore = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Obtiene el valor de la propiedad imagePromotion.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImagePromotion() {
        return imagePromotion;
    }

    /**
     * Define el valor de la propiedad imagePromotion.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImagePromotion(byte[] value) {
        this.imagePromotion = value;
    }

}
