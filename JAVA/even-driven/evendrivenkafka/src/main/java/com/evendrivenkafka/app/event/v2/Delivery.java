/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.evendrivenkafka.app.event.v2;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Delivery extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7248739680715461705L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Delivery\",\"namespace\":\"com.evendrivenkafka.app.event.v2\",\"fields\":[{\"name\":\"id\",\"type\":[\"int\",\"null\"]},{\"name\":\"created\",\"type\":[\"int\",\"null\"]},{\"name\":\"finished\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Delivery> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Delivery> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Delivery> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Delivery> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Delivery> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Delivery to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Delivery from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Delivery instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Delivery fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.Integer id;
  private java.lang.Integer created;
  private java.lang.CharSequence finished;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Delivery() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param created The new value for created
   * @param finished The new value for finished
   */
  public Delivery(java.lang.Integer id, java.lang.Integer created, java.lang.CharSequence finished) {
    this.id = id;
    this.created = created;
    this.finished = finished;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return created;
    case 2: return finished;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: created = (java.lang.Integer)value$; break;
    case 2: finished = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.Integer getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Integer value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'created' field.
   * @return The value of the 'created' field.
   */
  public java.lang.Integer getCreated() {
    return created;
  }


  /**
   * Sets the value of the 'created' field.
   * @param value the value to set.
   */
  public void setCreated(java.lang.Integer value) {
    this.created = value;
  }

  /**
   * Gets the value of the 'finished' field.
   * @return The value of the 'finished' field.
   */
  public java.lang.CharSequence getFinished() {
    return finished;
  }


  /**
   * Sets the value of the 'finished' field.
   * @param value the value to set.
   */
  public void setFinished(java.lang.CharSequence value) {
    this.finished = value;
  }

  /**
   * Creates a new Delivery RecordBuilder.
   * @return A new Delivery RecordBuilder
   */
  public static com.evendrivenkafka.app.event.v2.Delivery.Builder newBuilder() {
    return new com.evendrivenkafka.app.event.v2.Delivery.Builder();
  }

  /**
   * Creates a new Delivery RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Delivery RecordBuilder
   */
  public static com.evendrivenkafka.app.event.v2.Delivery.Builder newBuilder(com.evendrivenkafka.app.event.v2.Delivery.Builder other) {
    if (other == null) {
      return new com.evendrivenkafka.app.event.v2.Delivery.Builder();
    } else {
      return new com.evendrivenkafka.app.event.v2.Delivery.Builder(other);
    }
  }

  /**
   * Creates a new Delivery RecordBuilder by copying an existing Delivery instance.
   * @param other The existing instance to copy.
   * @return A new Delivery RecordBuilder
   */
  public static com.evendrivenkafka.app.event.v2.Delivery.Builder newBuilder(com.evendrivenkafka.app.event.v2.Delivery other) {
    if (other == null) {
      return new com.evendrivenkafka.app.event.v2.Delivery.Builder();
    } else {
      return new com.evendrivenkafka.app.event.v2.Delivery.Builder(other);
    }
  }

  /**
   * RecordBuilder for Delivery instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Delivery>
    implements org.apache.avro.data.RecordBuilder<Delivery> {

    private java.lang.Integer id;
    private java.lang.Integer created;
    private java.lang.CharSequence finished;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.evendrivenkafka.app.event.v2.Delivery.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.created)) {
        this.created = data().deepCopy(fields()[1].schema(), other.created);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.finished)) {
        this.finished = data().deepCopy(fields()[2].schema(), other.finished);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing Delivery instance
     * @param other The existing instance to copy.
     */
    private Builder(com.evendrivenkafka.app.event.v2.Delivery other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.created)) {
        this.created = data().deepCopy(fields()[1].schema(), other.created);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.finished)) {
        this.finished = data().deepCopy(fields()[2].schema(), other.finished);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.Integer getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.evendrivenkafka.app.event.v2.Delivery.Builder setId(java.lang.Integer value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.evendrivenkafka.app.event.v2.Delivery.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'created' field.
      * @return The value.
      */
    public java.lang.Integer getCreated() {
      return created;
    }


    /**
      * Sets the value of the 'created' field.
      * @param value The value of 'created'.
      * @return This builder.
      */
    public com.evendrivenkafka.app.event.v2.Delivery.Builder setCreated(java.lang.Integer value) {
      validate(fields()[1], value);
      this.created = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'created' field has been set.
      * @return True if the 'created' field has been set, false otherwise.
      */
    public boolean hasCreated() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'created' field.
      * @return This builder.
      */
    public com.evendrivenkafka.app.event.v2.Delivery.Builder clearCreated() {
      created = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'finished' field.
      * @return The value.
      */
    public java.lang.CharSequence getFinished() {
      return finished;
    }


    /**
      * Sets the value of the 'finished' field.
      * @param value The value of 'finished'.
      * @return This builder.
      */
    public com.evendrivenkafka.app.event.v2.Delivery.Builder setFinished(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.finished = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'finished' field has been set.
      * @return True if the 'finished' field has been set, false otherwise.
      */
    public boolean hasFinished() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'finished' field.
      * @return This builder.
      */
    public com.evendrivenkafka.app.event.v2.Delivery.Builder clearFinished() {
      finished = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Delivery build() {
      try {
        Delivery record = new Delivery();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.created = fieldSetFlags()[1] ? this.created : (java.lang.Integer) defaultValue(fields()[1]);
        record.finished = fieldSetFlags()[2] ? this.finished : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Delivery>
    WRITER$ = (org.apache.avro.io.DatumWriter<Delivery>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Delivery>
    READER$ = (org.apache.avro.io.DatumReader<Delivery>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.id == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeInt(this.id);
    }

    if (this.created == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeInt(this.created);
    }

    if (this.finished == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.finished);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 0) {
        in.readNull();
        this.id = null;
      } else {
        this.id = in.readInt();
      }

      if (in.readIndex() != 0) {
        in.readNull();
        this.created = null;
      } else {
        this.created = in.readInt();
      }

      if (in.readIndex() != 0) {
        in.readNull();
        this.finished = null;
      } else {
        this.finished = in.readString(this.finished instanceof Utf8 ? (Utf8)this.finished : null);
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 0) {
            in.readNull();
            this.id = null;
          } else {
            this.id = in.readInt();
          }
          break;

        case 1:
          if (in.readIndex() != 0) {
            in.readNull();
            this.created = null;
          } else {
            this.created = in.readInt();
          }
          break;

        case 2:
          if (in.readIndex() != 0) {
            in.readNull();
            this.finished = null;
          } else {
            this.finished = in.readString(this.finished instanceof Utf8 ? (Utf8)this.finished : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










