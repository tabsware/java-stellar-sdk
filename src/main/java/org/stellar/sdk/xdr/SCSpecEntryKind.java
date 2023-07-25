// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;

import static org.stellar.sdk.xdr.Constants.*;

import java.io.IOException;

// === xdr source ============================================================

//  enum SCSpecEntryKind
//  {
//      SC_SPEC_ENTRY_FUNCTION_V0 = 0,
//      SC_SPEC_ENTRY_UDT_STRUCT_V0 = 1,
//      SC_SPEC_ENTRY_UDT_UNION_V0 = 2,
//      SC_SPEC_ENTRY_UDT_ENUM_V0 = 3,
//      SC_SPEC_ENTRY_UDT_ERROR_ENUM_V0 = 4
//  };

//  ===========================================================================
public enum SCSpecEntryKind implements XdrElement {
  SC_SPEC_ENTRY_FUNCTION_V0(0),
  SC_SPEC_ENTRY_UDT_STRUCT_V0(1),
  SC_SPEC_ENTRY_UDT_UNION_V0(2),
  SC_SPEC_ENTRY_UDT_ENUM_V0(3),
  SC_SPEC_ENTRY_UDT_ERROR_ENUM_V0(4),
  ;
  private int mValue;

  SCSpecEntryKind(int value) {
    mValue = value;
  }

  public int getValue() {
    return mValue;
  }

  public static SCSpecEntryKind decode(XdrDataInputStream stream) throws IOException {
    int value = stream.readInt();
    switch (value) {
      case 0:
        return SC_SPEC_ENTRY_FUNCTION_V0;
      case 1:
        return SC_SPEC_ENTRY_UDT_STRUCT_V0;
      case 2:
        return SC_SPEC_ENTRY_UDT_UNION_V0;
      case 3:
        return SC_SPEC_ENTRY_UDT_ENUM_V0;
      case 4:
        return SC_SPEC_ENTRY_UDT_ERROR_ENUM_V0;
      default:
        throw new RuntimeException("Unknown enum value: " + value);
    }
  }

  public static void encode(XdrDataOutputStream stream, SCSpecEntryKind value) throws IOException {
    stream.writeInt(value.getValue());
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }
}
