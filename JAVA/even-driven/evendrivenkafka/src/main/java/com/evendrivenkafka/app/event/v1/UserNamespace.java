/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.evendrivenkafka.app.event.v1;

@org.apache.avro.specific.AvroGenerated
public interface UserNamespace {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"UserNamespace\",\"namespace\":\"com.evendrivenkafka.app.event.v1\",\"type\":\"record\",\"name\":\"User\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"favorite_number\",\"type\":[\"int\",\"null\"]},{\"name\":\"favorite_color\",\"type\":[\"string\",\"null\"]}],\"types\":[],\"messages\":{}}");

  @org.apache.avro.specific.AvroGenerated
  public interface Callback extends UserNamespace {
    public static final org.apache.avro.Protocol PROTOCOL = com.evendrivenkafka.app.event.v1.UserNamespace.PROTOCOL;
  }
}