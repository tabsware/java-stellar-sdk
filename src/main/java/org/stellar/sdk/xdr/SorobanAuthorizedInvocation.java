// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;

import static org.stellar.sdk.xdr.Constants.*;

import com.google.common.base.Objects;
import java.io.IOException;
import java.util.Arrays;

// === xdr source ============================================================

//  struct SorobanAuthorizedInvocation
//  {
//      SorobanAuthorizedFunction function;
//      SorobanAuthorizedInvocation subInvocations<>;
//  };

//  ===========================================================================
public class SorobanAuthorizedInvocation implements XdrElement {
  public SorobanAuthorizedInvocation() {}

  private SorobanAuthorizedFunction function;

  public SorobanAuthorizedFunction getFunction() {
    return this.function;
  }

  public void setFunction(SorobanAuthorizedFunction value) {
    this.function = value;
  }

  private SorobanAuthorizedInvocation[] subInvocations;

  public SorobanAuthorizedInvocation[] getSubInvocations() {
    return this.subInvocations;
  }

  public void setSubInvocations(SorobanAuthorizedInvocation[] value) {
    this.subInvocations = value;
  }

  public static void encode(
      XdrDataOutputStream stream, SorobanAuthorizedInvocation encodedSorobanAuthorizedInvocation)
      throws IOException {
    SorobanAuthorizedFunction.encode(stream, encodedSorobanAuthorizedInvocation.function);
    int subInvocationssize = encodedSorobanAuthorizedInvocation.getSubInvocations().length;
    stream.writeInt(subInvocationssize);
    for (int i = 0; i < subInvocationssize; i++) {
      SorobanAuthorizedInvocation.encode(
          stream, encodedSorobanAuthorizedInvocation.subInvocations[i]);
    }
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  public static SorobanAuthorizedInvocation decode(XdrDataInputStream stream) throws IOException {
    SorobanAuthorizedInvocation decodedSorobanAuthorizedInvocation =
        new SorobanAuthorizedInvocation();
    decodedSorobanAuthorizedInvocation.function = SorobanAuthorizedFunction.decode(stream);
    int subInvocationssize = stream.readInt();
    decodedSorobanAuthorizedInvocation.subInvocations =
        new SorobanAuthorizedInvocation[subInvocationssize];
    for (int i = 0; i < subInvocationssize; i++) {
      decodedSorobanAuthorizedInvocation.subInvocations[i] =
          SorobanAuthorizedInvocation.decode(stream);
    }
    return decodedSorobanAuthorizedInvocation;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.function, Arrays.hashCode(this.subInvocations));
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof SorobanAuthorizedInvocation)) {
      return false;
    }

    SorobanAuthorizedInvocation other = (SorobanAuthorizedInvocation) object;
    return Objects.equal(this.function, other.function)
        && Arrays.equals(this.subInvocations, other.subInvocations);
  }

  public static final class Builder {
    private SorobanAuthorizedFunction function;
    private SorobanAuthorizedInvocation[] subInvocations;

    public Builder function(SorobanAuthorizedFunction function) {
      this.function = function;
      return this;
    }

    public Builder subInvocations(SorobanAuthorizedInvocation[] subInvocations) {
      this.subInvocations = subInvocations;
      return this;
    }

    public SorobanAuthorizedInvocation build() {
      SorobanAuthorizedInvocation val = new SorobanAuthorizedInvocation();
      val.setFunction(this.function);
      val.setSubInvocations(this.subInvocations);
      return val;
    }
  }
}
