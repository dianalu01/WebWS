
package com.admazing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.admazing package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllTiendaRequest_QNAME = new QName("http://admazing.com/", "getAllTiendaRequest");
    private final static QName _IniciarSesionRequest_QNAME = new QName("http://admazing.com/", "iniciarSesionRequest");
    private final static QName _IniciarSesionResponse_QNAME = new QName("http://admazing.com/", "iniciarSesionResponse");
    private final static QName _GetAllTiendaResponse_QNAME = new QName("http://admazing.com/", "getAllTiendaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.admazing
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllTiendaRequest }
     * 
     */
    public GetAllTiendaRequest createGetAllTiendaRequest() {
        return new GetAllTiendaRequest();
    }

    /**
     * Create an instance of {@link IniciarSesionRequest }
     * 
     */
    public IniciarSesionRequest createIniciarSesionRequest() {
        return new IniciarSesionRequest();
    }

    /**
     * Create an instance of {@link IniciarSesionResponse }
     * 
     */
    public IniciarSesionResponse createIniciarSesionResponse() {
        return new IniciarSesionResponse();
    }

    /**
     * Create an instance of {@link GetAllTiendaResponse }
     * 
     */
    public GetAllTiendaResponse createGetAllTiendaResponse() {
        return new GetAllTiendaResponse();
    }

    /**
     * Create an instance of {@link CategoriaModel }
     * 
     */
    public CategoriaModel createCategoriaModel() {
        return new CategoriaModel();
    }

    /**
     * Create an instance of {@link UsuarioModel }
     * 
     */
    public UsuarioModel createUsuarioModel() {
        return new UsuarioModel();
    }

    /**
     * Create an instance of {@link TiendaModel }
     * 
     */
    public TiendaModel createTiendaModel() {
        return new TiendaModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTiendaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admazing.com/", name = "getAllTiendaRequest")
    public JAXBElement<GetAllTiendaRequest> createGetAllTiendaRequest(GetAllTiendaRequest value) {
        return new JAXBElement<GetAllTiendaRequest>(_GetAllTiendaRequest_QNAME, GetAllTiendaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IniciarSesionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admazing.com/", name = "iniciarSesionRequest")
    public JAXBElement<IniciarSesionRequest> createIniciarSesionRequest(IniciarSesionRequest value) {
        return new JAXBElement<IniciarSesionRequest>(_IniciarSesionRequest_QNAME, IniciarSesionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IniciarSesionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admazing.com/", name = "iniciarSesionResponse")
    public JAXBElement<IniciarSesionResponse> createIniciarSesionResponse(IniciarSesionResponse value) {
        return new JAXBElement<IniciarSesionResponse>(_IniciarSesionResponse_QNAME, IniciarSesionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTiendaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admazing.com/", name = "getAllTiendaResponse")
    public JAXBElement<GetAllTiendaResponse> createGetAllTiendaResponse(GetAllTiendaResponse value) {
        return new JAXBElement<GetAllTiendaResponse>(_GetAllTiendaResponse_QNAME, GetAllTiendaResponse.class, null, value);
    }

}
