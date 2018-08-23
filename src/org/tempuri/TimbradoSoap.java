package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-04-20T16:07:30.464-05:00
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "TimbradoSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface TimbradoSoap {

    /**
     * Servicio de timbrado de retenciones y pagos
     */
    @WebResult(name = "TimbraRetencionResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "TimbraRetencion", targetNamespace = "http://tempuri.org/", className = "org.tempuri.TimbraRetencion")
    @WebMethod(operationName = "TimbraRetencion", action = "http://tempuri.org/TimbraRetencion")
    @ResponseWrapper(localName = "TimbraRetencionResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.TimbraRetencionResponse")
    public org.tempuri.ArrayOfAnyType timbraRetencion(
        @WebParam(name = "usuarioIntegrador", targetNamespace = "http://tempuri.org/")
        java.lang.String usuarioIntegrador,
        @WebParam(name = "xmlComprobanteBase64", targetNamespace = "http://tempuri.org/")
        java.lang.String xmlComprobanteBase64,
        @WebParam(name = "idComprobante", targetNamespace = "http://tempuri.org/")
        java.lang.String idComprobante
    );

    /**
     * Servicio de consulta retenciones y pagos
     */
    @WebResult(name = "ObtieneRetencionResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ObtieneRetencion", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ObtieneRetencion")
    @WebMethod(operationName = "ObtieneRetencion", action = "http://tempuri.org/ObtieneRetencion")
    @ResponseWrapper(localName = "ObtieneRetencionResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ObtieneRetencionResponse")
    public org.tempuri.ArrayOfAnyType obtieneRetencion(
        @WebParam(name = "usuarioIntegrador", targetNamespace = "http://tempuri.org/")
        java.lang.String usuarioIntegrador,
        @WebParam(name = "rfcEmisor", targetNamespace = "http://tempuri.org/")
        java.lang.String rfcEmisor,
        @WebParam(name = "folioUUID", targetNamespace = "http://tempuri.org/")
        java.lang.String folioUUID
    );

    /**
     * Servicio de registro para emisores
     */
    @WebResult(name = "RegistraEmisorResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RegistraEmisor", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RegistraEmisor")
    @WebMethod(operationName = "RegistraEmisor", action = "http://tempuri.org/RegistraEmisor")
    @ResponseWrapper(localName = "RegistraEmisorResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.RegistraEmisorResponse")
    public org.tempuri.ArrayOfAnyType registraEmisor(
        @WebParam(name = "usuarioIntegrador", targetNamespace = "http://tempuri.org/")
        java.lang.String usuarioIntegrador,
        @WebParam(name = "rfcEmisor", targetNamespace = "http://tempuri.org/")
        java.lang.String rfcEmisor,
        @WebParam(name = "base64Cer", targetNamespace = "http://tempuri.org/")
        java.lang.String base64Cer,
        @WebParam(name = "base64Key", targetNamespace = "http://tempuri.org/")
        java.lang.String base64Key,
        @WebParam(name = "contrasena", targetNamespace = "http://tempuri.org/")
        java.lang.String contrasena
    );

    /**
     * Servicio de consulta CFDI
     */
    @WebResult(name = "ObtieneCFDIResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ObtieneCFDI", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ObtieneCFDI")
    @WebMethod(operationName = "ObtieneCFDI", action = "http://tempuri.org/ObtieneCFDI")
    @ResponseWrapper(localName = "ObtieneCFDIResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ObtieneCFDIResponse")
    public org.tempuri.ArrayOfAnyType obtieneCFDI(
        @WebParam(name = "usuarioIntegrador", targetNamespace = "http://tempuri.org/")
        java.lang.String usuarioIntegrador,
        @WebParam(name = "rfcEmisor", targetNamespace = "http://tempuri.org/")
        java.lang.String rfcEmisor,
        @WebParam(name = "folioUUID", targetNamespace = "http://tempuri.org/")
        java.lang.String folioUUID
    );

    /**
     * Servicio de asignación de timbres para Integradores
     */
    @WebResult(name = "AsignaTimbresEmisorResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AsignaTimbresEmisor", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AsignaTimbresEmisor")
    @WebMethod(operationName = "AsignaTimbresEmisor", action = "http://tempuri.org/AsignaTimbresEmisor")
    @ResponseWrapper(localName = "AsignaTimbresEmisorResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.AsignaTimbresEmisorResponse")
    public org.tempuri.ArrayOfAnyType asignaTimbresEmisor(
        @WebParam(name = "usuarioIntegrador", targetNamespace = "http://tempuri.org/")
        java.lang.String usuarioIntegrador,
        @WebParam(name = "rfcEmisor", targetNamespace = "http://tempuri.org/")
        java.lang.String rfcEmisor,
        @WebParam(name = "noTimbres", targetNamespace = "http://tempuri.org/")
        int noTimbres
    );

    /**
     * Servicio de cancelación CFDI
     */
    @WebResult(name = "CancelaCFDIResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CancelaCFDI", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CancelaCFDI")
    @WebMethod(operationName = "CancelaCFDI", action = "http://tempuri.org/CancelaCFDI")
    @ResponseWrapper(localName = "CancelaCFDIResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CancelaCFDIResponse")
    public org.tempuri.ArrayOfAnyType cancelaCFDI(
        @WebParam(name = "usuarioIntegrador", targetNamespace = "http://tempuri.org/")
        java.lang.String usuarioIntegrador,
        @WebParam(name = "rfcEmisor", targetNamespace = "http://tempuri.org/")
        java.lang.String rfcEmisor,
        @WebParam(name = "folioUUID", targetNamespace = "http://tempuri.org/")
        java.lang.String folioUUID
    );

    /**
     * Servicio de timbrado para Integradores
     */
    @WebResult(name = "TimbraCFDIResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "TimbraCFDI", targetNamespace = "http://tempuri.org/", className = "org.tempuri.TimbraCFDI")
    @WebMethod(operationName = "TimbraCFDI", action = "http://tempuri.org/TimbraCFDI")
    @ResponseWrapper(localName = "TimbraCFDIResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.TimbraCFDIResponse")
    public org.tempuri.ArrayOfAnyType timbraCFDI(
        @WebParam(name = "usuarioIntegrador", targetNamespace = "http://tempuri.org/")
        java.lang.String usuarioIntegrador,
        @WebParam(name = "xmlComprobanteBase64", targetNamespace = "http://tempuri.org/")
        java.lang.String xmlComprobanteBase64,
        @WebParam(name = "idComprobante", targetNamespace = "http://tempuri.org/")
        java.lang.String idComprobante
    );

    /**
     * Servicio de cancelación de retenciones y pagos
     */
    @WebResult(name = "CancelaRetencionResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CancelaRetencion", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CancelaRetencion")
    @WebMethod(operationName = "CancelaRetencion", action = "http://tempuri.org/CancelaRetencion")
    @ResponseWrapper(localName = "CancelaRetencionResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CancelaRetencionResponse")
    public org.tempuri.ArrayOfAnyType cancelaRetencion(
        @WebParam(name = "usuarioIntegrador", targetNamespace = "http://tempuri.org/")
        java.lang.String usuarioIntegrador,
        @WebParam(name = "rfcEmisor", targetNamespace = "http://tempuri.org/")
        java.lang.String rfcEmisor,
        @WebParam(name = "folioUUID", targetNamespace = "http://tempuri.org/")
        java.lang.String folioUUID
    );

    /**
     * Servicio de consulta de timbres para Integradores
     */
    @WebResult(name = "ObtieneTimbresDisponiblesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ObtieneTimbresDisponibles", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ObtieneTimbresDisponibles")
    @WebMethod(operationName = "ObtieneTimbresDisponibles", action = "http://tempuri.org/ObtieneTimbresDisponibles")
    @ResponseWrapper(localName = "ObtieneTimbresDisponiblesResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.ObtieneTimbresDisponiblesResponse")
    public org.tempuri.ArrayOfAnyType obtieneTimbresDisponibles(
        @WebParam(name = "usuarioIntegrador", targetNamespace = "http://tempuri.org/")
        java.lang.String usuarioIntegrador,
        @WebParam(name = "rfcEmisor", targetNamespace = "http://tempuri.org/")
        java.lang.String rfcEmisor
    );

    /**
     * Servicio de cancelación CFDI con acuse
     */
    @WebResult(name = "CancelaCFDIAckResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CancelaCFDIAck", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CancelaCFDIAck")
    @WebMethod(operationName = "CancelaCFDIAck", action = "http://tempuri.org/CancelaCFDIAck")
    @ResponseWrapper(localName = "CancelaCFDIAckResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.CancelaCFDIAckResponse")
    public org.tempuri.ArrayOfAnyType cancelaCFDIAck(
        @WebParam(name = "usuarioIntegrador", targetNamespace = "http://tempuri.org/")
        java.lang.String usuarioIntegrador,
        @WebParam(name = "rfcEmisor", targetNamespace = "http://tempuri.org/")
        java.lang.String rfcEmisor,
        @WebParam(name = "folioUUID", targetNamespace = "http://tempuri.org/")
        java.lang.String folioUUID
    );
}