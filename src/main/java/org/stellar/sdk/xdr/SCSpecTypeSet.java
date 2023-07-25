// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;

import static org.stellar.sdk.xdr.Constants.*;

import com.google.common.base.Objects;
import java.io.IOException;

// === xdr source ============================================================

//  struct SCSpecTypeSet
//  {
//      SCSpecTypeDef elementType;
//  };

//  ===========================================================================
public class SCSpecTypeSet implements XdrElement {
  public SCSpecTypeSet() {}

  private SCSpecTypeDef elementType;

  public SCSpecTypeDef getElementType() {
    return this.elementType;
  }

  public void setElementType(SCSpecTypeDef value) {
    this.elementType = value;
  }

  public static void encode(XdrDataOutputStream stream, SCSpecTypeSet encodedSCSpecTypeSet)
      throws IOException {
    SCSpecTypeDef.encode(stream, encodedSCSpecTypeSet.elementType);
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  public static SCSpecTypeSet decode(XdrDataInputStream stream) throws IOException {
    SCSpecTypeSet decodedSCSpecTypeSet = new SCSpecTypeSet();
    decodedSCSpecTypeSet.elementType = SCSpecTypeDef.decode(stream);
    return decodedSCSpecTypeSet;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.elementType);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof SCSpecTypeSet)) {
      return false;
    }

    SCSpecTypeSet other = (SCSpecTypeSet) object;
    return Objects.equal(this.elementType, other.elementType);
  }

  public static final class Builder {
    private SCSpecTypeDef elementType;

    public Builder elementType(SCSpecTypeDef elementType) {
      this.elementType = elementType;
      return this;
    }

    public SCSpecTypeSet build() {
      SCSpecTypeSet val = new SCSpecTypeSet();
      val.setElementType(this.elementType);
      return val;
    }
  }
}
