
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

    private final static QName _GetByIdPromocionRequest_QNAME = new QName("http://admazing.com/", "getByIdPromocionRequest");
    private final static QName _GetByIdCategoriaResponse_QNAME = new QName("http://admazing.com/", "getByIdCategoriaResponse");
    private final static QName _GetByIdPromocionResponse_QNAME = new QName("http://admazing.com/", "getByIdPromocionResponse");
    private final static QName _GetAllTiendabyZonaComercialResponse_QNAME = new QName("http://admazing.com/", "getAllTiendabyZonaComercialResponse");
    private final static QName _GetbyZonaComercialCuponeraResponse_QNAME = new QName("http://admazing.com/", "getbyZonaComercialCuponeraResponse");
    private final static QName _SaveAccesoResponse_QNAME = new QName("http://admazing.com/", "saveAccesoResponse");
    private final static QName _GetAllTiendabyZonaComercialRequest_QNAME = new QName("http://admazing.com/", "getAllTiendabyZonaComercialRequest");
    private final static QName _SaveAccesoRequest_QNAME = new QName("http://admazing.com/", "saveAccesoRequest");
    private final static QName _GetAllTiendaRequest_QNAME = new QName("http://admazing.com/", "getAllTiendaRequest");
    private final static QName _GetbyZonaComercialCuponeraRequest_QNAME = new QName("http://admazing.com/", "getbyZonaComercialCuponeraRequest");
    private final static QName _IniciarSesionRequest_QNAME = new QName("http://admazing.com/", "iniciarSesionRequest");
    private final static QName _GetByIdCategoriaRequest_QNAME = new QName("http://admazing.com/", "getByIdCategoriaRequest");
    private final static QName _IniciarSesionResponse_QNAME = new QName("http://admazing.com/", "iniciarSesionResponse");
    private final static QName _GetAllTiendaResponse_QNAME = new QName("http://admazing.com/", "getAllTiendaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.admazing
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetByIdPromocionRequest }
     * 
     */
    public GetByIdPromocionRequest createGetByIdPromocionRequest() {
        return new GetByIdPromocionRequest();
    }

    /**
     * Create an instance of {@link SaveAccesoResponse }
     * 
     */
    public SaveAccesoResponse createSaveAccesoResponse() {
        return new SaveAccesoResponse();
    }

    /**
     * Create an instance of {@link GetByIdCategoriaResponse }
     * 
     */
    public GetByIdCategoriaResponse createGetByIdCategoriaResponse() {
        return new GetByIdCategoriaResponse();
    }

    /**
     * Create an instance of {@link GetByIdPromocionResponse }
     * 
     */
    public GetByIdPromocionResponse createGetByIdPromocionResponse() {
        return new GetByIdPromocionResponse();
    }

    /**
     * Create an instance of {@link GetAllTiendabyZonaComercialResponse }
     * 
     */
    public GetAllTiendabyZonaComercialResponse createGetAllTiendabyZonaComercialResponse() {
        return new GetAllTiendabyZonaComercialResponse();
    }

    /**
     * Create an instance of {@link GetbyZonaComercialCuponeraResponse }
     * 
     */
    public GetbyZonaComercialCuponeraResponse createGetbyZonaComercialCuponeraResponse() {
        return new GetbyZonaComercialCuponeraResponse();
    }

    /**
     * Create an instance of {@link GetAllTiendaRequest }
     * 
     */
    public GetAllTiendaRequest createGetAllTiendaRequest() {
        return new GetAllTiendaRequest();
    }

    /**
     * Create an instance of {@link GetAllTiendabyZonaComercialRequest }
     * 
     */
    public GetAllTiendabyZonaComercialRequest createGetAllTiendabyZonaComercialRequest() {
        return new GetAllTiendabyZonaComercialRequest();
    }

    /**
     * Create an instance of {@link SaveAccesoRequest }
     * 
     */
    public SaveAccesoRequest createSaveAccesoRequest() {
        return new SaveAccesoRequest();
    }

    /**
     * Create an instance of {@link GetbyZonaComercialCuponeraRequest }
     * 
     */
    public GetbyZonaComercialCuponeraRequest createGetbyZonaComercialCuponeraRequest() {
        return new GetbyZonaComercialCuponeraRequest();
    }

    /**
     * Create an instance of {@link IniciarSesionRequest }
     * 
     */
    public IniciarSesionRequest createIniciarSesionRequest() {
        return new IniciarSesionRequest();
    }

    /**
     * Create an instance of {@link GetByIdCategoriaRequest }
     * 
     */
    public GetByIdCategoriaRequest createGetByIdCategoriaRequest() {
        return new GetByIdCategoriaRequest();
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
     * Create an instance of {@link AccesoModel }
     * 
     */
    public AccesoModel createAccesoModel() {
        return new AccesoModel();
    }

    /**
     * Create an instance of {@link PromocionModel }
     * 
     */
    public PromocionModel createPromocionModel() {
        return new PromocionModel();
    }

    /**
     * Create an instance of {@link ZonaComercialModel }
     * 
     */
    public ZonaComercialModel createZonaComercialModel() {
        return new ZonaComercialModel();
    }

    /**
     * Create an instance of {@link CuponeraModel }
     * 
     */
    public CuponeraModel createCuponeraModel() {
        return new CuponeraModel();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByIdPromocionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admazing.com/", name = "getByIdPromocionRequest")
    public JAXBElement<GetByIdPromocionRequest> createGetByIdPromocionRequest(GetByIdPromocionRequest value) {
        return new JAXBElement<GetByIdPromocionRequest>(_GetByIdPromocionRequest_QNAME, GetByIdPromocionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByIdCategoriaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admazing.com/", name = "getByIdCategoriaResponse")
    public JAXBElement<GetByIdCategoriaResponse> createGetByIdCategoriaResponse(GetByIdCategoriaResponse value) {
        return new JAXBElement<GetByIdCategoriaResponse>(_GetByIdCategoriaResponse_QNAME, GetByIdCategoriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByIdPromocionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admazing.com/", name = "getByIdPromocionResponse")
    public JAXBElement<GetByIdPromocionResponse> createGetByIdPromocionResponse(GetByIdPromocionResponse value) {
        return new JAXBElement<GetByIdPromocionResponse>(_GetByIdPromocionResponse_QNAME, GetByIdPromocionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTiendabyZonaComercialResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admazing.com/", name = "getAllTiendabyZonaComercialResponse")
    public JAXBElement<GetAllTiendabyZonaComercialResponse> createGetAllTiendabyZonaComercialResponse(GetAllTiendabyZonaComercialResponse value) {
        return new JAXBElement<GetAllTiendabyZonaComercialResponse>(_GetAllTiendabyZonaComercialResponse_QNAME, GetAllTiendabyZonaComercialResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetbyZonaComercialCuponeraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admazing.com/", name = "getbyZonaComercialCuponeraResponse")
    public JAXBElement<GetbyZonaComercialCuponeraResponse> createGetbyZonaComercialCuponeraResponse(GetbyZonaComercialCuponeraResponse value) {
        return new JAXBElement<GetbyZonaComercialCuponeraResponse>(_GetbyZonaComercialCuponeraResponse_QNAME, GetbyZonaComercialCuponeraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveAccesoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admazing.com/", name = "saveAccesoResponse")
    public JAXBElement<SaveAccesoResponse> createSaveAccesoResponse(SaveAccesoResponse value) {
        return new JAXBElement<SaveAccesoResponse>(_SaveAccesoResponse_QNAME, SaveAccesoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTiendabyZonaComercialRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admazing.com/", name = "getAllTiendabyZonaComercialRequest")
    public JAXBElement<GetAllTiendabyZonaComercialRequest> createGetAllTiendabyZonaComercialRequest(GetAllTiendabyZonaComercialRequest value) {
        return new JAXBElement<GetAllTiendabyZonaComercialRequest>(_GetAllTiendabyZonaComercialRequest_QNAME, GetAllTiendabyZonaComercialRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveAccesoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admazing.com/", name = "saveAccesoRequest")
    public JAXBElement<SaveAccesoRequest> createSaveAccesoRequest(SaveAccesoRequest value) {
        return new JAXBElement<SaveAccesoRequest>(_SaveAccesoRequest_QNAME, SaveAccesoRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetbyZonaComercialCuponeraRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admazing.com/", name = "getbyZonaComercialCuponeraRequest")
    public JAXBElement<GetbyZonaComercialCuponeraRequest> createGetbyZonaComercialCuponeraRequest(GetbyZonaComercialCuponeraRequest value) {
        return new JAXBElement<GetbyZonaComercialCuponeraRequest>(_GetbyZonaComercialCuponeraRequest_QNAME, GetbyZonaComercialCuponeraRequest.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByIdCategoriaRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://admazing.com/", name = "getByIdCategoriaRequest")
    public JAXBElement<GetByIdCategoriaRequest> createGetByIdCategoriaRequest(GetByIdCategoriaRequest value) {
        return new JAXBElement<GetByIdCategoriaRequest>(_GetByIdCategoriaRequest_QNAME, GetByIdCategoriaRequest.class, null, value);
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
