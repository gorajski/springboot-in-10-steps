package com.gorajski.spring.basics.springinsteps.xml;

public class XmlPersonDAO {
    XmlJdbcConnection xmlJdbcConnection;

    public XmlJdbcConnection getXMLJdbcConnection() {
        return xmlJdbcConnection;
    }

    public void setXMLJdbcConnection(XmlJdbcConnection jdbcConnection) {
        this.xmlJdbcConnection = jdbcConnection;
    }
}
