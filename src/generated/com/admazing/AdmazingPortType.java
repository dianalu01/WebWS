package com.admazing;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2016-09-03T12:44:01.289-05:00
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://admazing.com/", name = "AdmazingPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AdmazingPortType {

    @WebMethod
    @WebResult(name = "deleteFromCouponBookResponse", targetNamespace = "http://admazing.com/", partName = "parameters")
    public DeleteFromCouponBookResponse deleteFromCouponBook(
        @WebParam(partName = "parameters", name = "deleteFromCouponBookRequest", targetNamespace = "http://admazing.com/")
        DeleteFromCouponBookRequest parameters
    );

    @WebMethod
    @WebResult(name = "savePreferenceResponse", targetNamespace = "http://admazing.com/", partName = "parameters")
    public SavePreferenceResponse savePreference(
        @WebParam(partName = "parameters", name = "savePreferenceRequest", targetNamespace = "http://admazing.com/")
        SavePreferenceRequest parameters
    );

    @WebMethod
    @WebResult(name = "getAllStoresResponse", targetNamespace = "http://admazing.com/", partName = "parameters")
    public GetAllStoresResponse getAllStores(
        @WebParam(partName = "parameters", name = "getAllStoresRequest", targetNamespace = "http://admazing.com/")
        GetAllStoresRequest parameters
    );

    @WebMethod
    @WebResult(name = "getCategoryByPreferenceResponse", targetNamespace = "http://admazing.com/", partName = "parameters")
    public GetCategoryByPreferenceResponse getCategoryByPreference(
        @WebParam(partName = "parameters", name = "getCategoryByPreferenceRequest", targetNamespace = "http://admazing.com/")
        GetCategoryByPreferenceRequest parameters
    );

    @WebMethod
    @WebResult(name = "getByIdPromotionResponse", targetNamespace = "http://admazing.com/", partName = "parameters")
    public GetByIdPromotionResponse getByIdPromotion(
        @WebParam(partName = "parameters", name = "getByIdPromotionRequest", targetNamespace = "http://admazing.com/")
        GetByIdPromotionRequest parameters
    );

    @WebMethod
    @WebResult(name = "saveCouponBookResponse", targetNamespace = "http://admazing.com/", partName = "parameters")
    public SaveCouponBookResponse saveCouponBook(
        @WebParam(partName = "parameters", name = "saveCouponBookRequest", targetNamespace = "http://admazing.com/")
        SaveCouponBookRequest parameters
    );

    @WebMethod
    @WebResult(name = "logInResponse", targetNamespace = "http://admazing.com/", partName = "parameters")
    public LogInResponse logIn(
        @WebParam(partName = "parameters", name = "logInRequest", targetNamespace = "http://admazing.com/")
        LogInRequest parameters
    );

    @WebMethod
    @WebResult(name = "getAllPreferedCategoriesResponse", targetNamespace = "http://admazing.com/", partName = "parameters")
    public GetAllPreferedCategoriesResponse getAllPreferedCategories(
        @WebParam(partName = "parameters", name = "getAllPreferedCategoriesRequest", targetNamespace = "http://admazing.com/")
        GetAllPreferedCategoriesRequest parameters
    );

    @WebMethod
    @WebResult(name = "deleteFromPreferenceResponse", targetNamespace = "http://admazing.com/", partName = "parameters")
    public DeleteFromPreferenceResponse deleteFromPreference(
        @WebParam(partName = "parameters", name = "deleteFromPreferenceRequest", targetNamespace = "http://admazing.com/")
        DeleteFromPreferenceRequest parameters
    );

    @WebMethod
    @WebResult(name = "getByIdCategoryResponse", targetNamespace = "http://admazing.com/", partName = "parameters")
    public GetByIdCategoryResponse getByIdCategory(
        @WebParam(partName = "parameters", name = "getByIdCategoryRequest", targetNamespace = "http://admazing.com/")
        GetByIdCategoryRequest parameters
    );

    @WebMethod
    @WebResult(name = "getbyCommercialAreaCouponBookResponse", targetNamespace = "http://admazing.com/", partName = "parameters")
    public GetbyCommercialAreaCouponBookResponse getbyCommercialAreaCouponBook(
        @WebParam(partName = "parameters", name = "getbyCommercialAreaCouponBookRequest", targetNamespace = "http://admazing.com/")
        GetbyCommercialAreaCouponBookRequest parameters
    );

    @WebMethod
    @WebResult(name = "getAllStoresbyCommercialAreaResponse", targetNamespace = "http://admazing.com/", partName = "parameters")
    public GetAllStoresbyCommercialAreaResponse getAllStoresbyCommercialArea(
        @WebParam(partName = "parameters", name = "getAllStoresbyCommercialAreaRequest", targetNamespace = "http://admazing.com/")
        GetAllStoresbyCommercialAreaRequest parameters
    );

    @WebMethod
    @WebResult(name = "saveAccessResponse", targetNamespace = "http://admazing.com/", partName = "parameters")
    public SaveAccessResponse saveAccess(
        @WebParam(partName = "parameters", name = "saveAccessRequest", targetNamespace = "http://admazing.com/")
        SaveAccessRequest parameters
    );
}
