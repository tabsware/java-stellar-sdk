// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;

import static org.stellar.sdk.xdr.Constants.*;

import java.io.IOException;

// === xdr source ============================================================

//  enum RestoreFootprintResultCode
//  {
//      // codes considered as "success" for the operation
//      RESTORE_FOOTPRINT_SUCCESS = 0,
//
//      // codes considered as "failure" for the operation
//      RESTORE_FOOTPRINT_MALFORMED = -1,
//      RESTORE_FOOTPRINT_RESOURCE_LIMIT_EXCEEDED = -2
//  };

//  ===========================================================================
public enum RestoreFootprintResultCode implements XdrElement {
  RESTORE_FOOTPRINT_SUCCESS(0),
  RESTORE_FOOTPRINT_MALFORMED(-1),
  RESTORE_FOOTPRINT_RESOURCE_LIMIT_EXCEEDED(-2),
  ;
  private int mValue;

  RestoreFootprintResultCode(int value) {
    mValue = value;
  }

  public int getValue() {
    return mValue;
  }

  public static RestoreFootprintResultCode decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0:
        return RESTORE_FOOTPRINT_SUCCESS;
      case -1:
        return RESTORE_FOOTPRINT_MALFORMED;
      case -2:
        return RESTORE_FOOTPRINT_RESOURCE_LIMIT_EXCEEDED;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  public static void encode(XdrDataOutputStream stream, RestoreFootprintResultCode value)
      throws IOException {
    stream.writeInt(value.getValue());
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
}
