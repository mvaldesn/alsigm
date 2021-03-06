/**
 * HitosExpediente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package es.ieci.tecdoc.sigem.ConsultaExpedientesWebService;

public class HitosExpediente  extends es.ieci.tecdoc.sigem.ConsultaExpedientesWebService.RetornoServicio  implements java.io.Serializable {
    private es.ieci.tecdoc.sigem.ConsultaExpedientesWebService.ArrayOfHitoExpediente expedientes;

    private es.ieci.tecdoc.sigem.ConsultaExpedientesWebService.ArrayOfHitoExpediente hitosExpedientes;

    public HitosExpediente() {
    }

    public HitosExpediente(
           java.lang.String errorCode,
           java.lang.String returnCode,
           es.ieci.tecdoc.sigem.ConsultaExpedientesWebService.ArrayOfHitoExpediente expedientes,
           es.ieci.tecdoc.sigem.ConsultaExpedientesWebService.ArrayOfHitoExpediente hitosExpedientes) {
        super(
            errorCode,
            returnCode);
        this.expedientes = expedientes;
        this.hitosExpedientes = hitosExpedientes;
    }


    /**
     * Gets the expedientes value for this HitosExpediente.
     * 
     * @return expedientes
     */
    public es.ieci.tecdoc.sigem.ConsultaExpedientesWebService.ArrayOfHitoExpediente getExpedientes() {
        return expedientes;
    }


    /**
     * Sets the expedientes value for this HitosExpediente.
     * 
     * @param expedientes
     */
    public void setExpedientes(es.ieci.tecdoc.sigem.ConsultaExpedientesWebService.ArrayOfHitoExpediente expedientes) {
        this.expedientes = expedientes;
    }


    /**
     * Gets the hitosExpedientes value for this HitosExpediente.
     * 
     * @return hitosExpedientes
     */
    public es.ieci.tecdoc.sigem.ConsultaExpedientesWebService.ArrayOfHitoExpediente getHitosExpedientes() {
        return hitosExpedientes;
    }


    /**
     * Sets the hitosExpedientes value for this HitosExpediente.
     * 
     * @param hitosExpedientes
     */
    public void setHitosExpedientes(es.ieci.tecdoc.sigem.ConsultaExpedientesWebService.ArrayOfHitoExpediente hitosExpedientes) {
        this.hitosExpedientes = hitosExpedientes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HitosExpediente)) return false;
        HitosExpediente other = (HitosExpediente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.expedientes==null && other.getExpedientes()==null) || 
             (this.expedientes!=null &&
              this.expedientes.equals(other.getExpedientes()))) &&
            ((this.hitosExpedientes==null && other.getHitosExpedientes()==null) || 
             (this.hitosExpedientes!=null &&
              this.hitosExpedientes.equals(other.getHitosExpedientes())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getExpedientes() != null) {
            _hashCode += getExpedientes().hashCode();
        }
        if (getHitosExpedientes() != null) {
            _hashCode += getHitosExpedientes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HitosExpediente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://server.ws.ct.sgm.tecdoc.ieci", "HitosExpediente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expedientes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://server.ws.ct.sgm.tecdoc.ieci", "expedientes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://server.ws.ct.sgm.tecdoc.ieci", "ArrayOfHitoExpediente"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hitosExpedientes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://server.ws.ct.sgm.tecdoc.ieci", "hitosExpedientes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://server.ws.ct.sgm.tecdoc.ieci", "ArrayOfHitoExpediente"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
