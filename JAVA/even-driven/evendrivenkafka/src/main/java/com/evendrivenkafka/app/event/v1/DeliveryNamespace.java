/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.evendrivenkafka.app.event.v1;

@org.apache.avro.specific.AvroGenerated
public interface DeliveryNamespace {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"DeliveryNamespace\",\"namespace\":\"com.evendrivenkafka.app.event.v1\",\"type\":\"record\",\"name\":\"Delivery\",\"fields\":[{\"name\":\"name\",\"type\":[\"string\"]},{\"name\":\"id\",\"type\":[\"int\"]},{\"name\":\"created\",\"type\":[\"int\",\"null\"]},{\"name\":\"finished\",\"type\":[\"string\",\"null\"]}],\"types\":[],\"messages\":{}}");

  @org.apache.avro.specific.AvroGenerated
  public interface Callback extends DeliveryNamespace {
    public static final org.apache.avro.Protocol PROTOCOL = com.evendrivenkafka.app.event.v1.DeliveryNamespace.PROTOCOL;
  }
}