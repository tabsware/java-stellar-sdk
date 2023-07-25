// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;

import static org.stellar.sdk.xdr.Constants.*;

import java.io.IOException;
import java.util.Arrays;

// === xdr source ============================================================

//  typedef opaque UpgradeType<128>;

//  ===========================================================================
public class UpgradeType implements XdrElement {
  private byte[] UpgradeType;

  public UpgradeType() {}

  public UpgradeType(byte[] UpgradeType) {
    this.UpgradeType = UpgradeType;
  }

  public byte[] getUpgradeType() {
    return this.UpgradeType;
  }

  public void setUpgradeType(byte[] value) {
    this.UpgradeType = value;
  }

  public static void encode(XdrDataOutputStream stream, UpgradeType encodedUpgradeType)
      throws IOException {
    int UpgradeTypesize = encodedUpgradeType.UpgradeType.length;
    stream.writeInt(UpgradeTypesize);
    stream.write(encodedUpgradeType.getUpgradeType(), 0, UpgradeTypesize);
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  public static UpgradeType decode(XdrDataInputStream stream) throws IOException {
    UpgradeType decodedUpgradeType = new UpgradeType();
    int UpgradeTypesize = stream.readInt();
    decodedUpgradeType.UpgradeType = new byte[UpgradeTypesize];
    stream.read(decodedUpgradeType.UpgradeType, 0, UpgradeTypesize);
    return decodedUpgradeType;
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(this.UpgradeType);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof UpgradeType)) {
      return false;
    }

    UpgradeType other = (UpgradeType) object;
    return Arrays.equals(this.UpgradeType, other.UpgradeType);
  }
}
