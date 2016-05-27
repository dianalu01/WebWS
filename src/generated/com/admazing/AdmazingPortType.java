package com.admazing;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2016-05-27T00:51:46.793-05:00
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://admazing.com/", name = "AdmazingPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AdmazingPortType {

    @WebMethod
    @WebResult(name = "getByIdPromocionResponse", targetNamespace = "http://admazing.com/", partName = "parameters")
    public GetByIdPromocionResponse getByIdPromocion(
        @WebParam(partName = "parameters", name = "getByIdPromocionRequest", targetNamespace = "http://admazing.com/")
        GetByIdPromocionRequest parameters
    );

    @WebMethod
    @WebResult(name = "getByIdCategoriaResponse", targetNamespace = "http://admazing.com/", partName = "parameters")
    public GetByIdCategoriaResponse getByIdCategoria(
        @WebParam(partName = "parameters", name = "getByIdCategoriaRequest", targetNamespace = "http://admazing.com/")
        GetByIdCategoriaRequest parameters
    );

    @WebMethod
    @WebResult(name = "getbyZonaComercialCuponeraResponse", targetNamespace = "http://admazing.com/", partName = "parameters")
    public GetbyZonaComercialCuponeraResponse getbyZonaComercialCuponera(
        @WebParam(partName = "parameters", name = "getbyZonaComercialCuponeraRequest", targetNamespace = "http://admazing.com/")
        GetbyZonaComercialCuponeraRequest parameters
    );

    @WebMethod
    @WebResult(name = "saveAccesoResponse", targetNamespace = "http://admazing.com/", partName = "parameters")
    public SaveAccesoResponse saveAcceso(
        @WebParam(partName = "parameters", name = "saveAccesoRequest", targetNamespace = "http://admazing.com/")
        SaveAccesoRequest parameters
    );

    @WebMethod
    @WebResult(name = "iniciarSesionResponse", targetNamespace = "http://admazing.com/", partName = "parameters")
    public IniciarSesionResponse iniciarSesion(
        @WebParam(partName = "parameters", name = "iniciarSesionRequest", targetNamespace = "http://admazing.com/")
        IniciarSesionRequest parameters
    );

    @WebMethod
    @WebResult(name = "getAllTiendaResponse", targetNamespace = "http://admazing.com/", partName = "parameters")
    public GetAllTiendaResponse getAllTienda(
        @WebParam(partName = "parameters", name = "getAllTiendaRequest", targetNamespace = "http://admazing.com/")
        GetAllTiendaRequest parameters
    );

    @WebMethod
    @WebResult(name = "getAllTiendabyZonaComercialResponse", targetNamespace = "http://admazing.com/", partName = "parameters")
    public GetAllTiendabyZonaComercialResponse getAllTiendabyZonaComercial(
        @WebParam(partName = "parameters", name = "getAllTiendabyZonaComercialRequest", targetNamespace = "http://admazing.com/")
        GetAllTiendabyZonaComercialRequest parameters
    );
}
