// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;

import static org.stellar.sdk.xdr.Constants.*;

import com.google.common.base.Objects;
import java.io.IOException;

// === xdr source ============================================================

//  union SCVal switch (SCValType type)
//  {
//
//  case SCV_BOOL:
//      bool b;
//  case SCV_VOID:
//      void;
//  case SCV_ERROR:
//      SCError error;
//
//  case SCV_U32:
//      uint32 u32;
//  case SCV_I32:
//      int32 i32;
//
//  case SCV_U64:
//      uint64 u64;
//  case SCV_I64:
//      int64 i64;
//  case SCV_TIMEPOINT:
//      TimePoint timepoint;
//  case SCV_DURATION:
//      Duration duration;
//
//  case SCV_U128:
//      UInt128Parts u128;
//  case SCV_I128:
//      Int128Parts i128;
//
//  case SCV_U256:
//      UInt256Parts u256;
//  case SCV_I256:
//      Int256Parts i256;
//
//  case SCV_BYTES:
//      SCBytes bytes;
//  case SCV_STRING:
//      SCString str;
//  case SCV_SYMBOL:
//      SCSymbol sym;
//
//  // Vec and Map are recursive so need to live
//  // behind an option, due to xdrpp limitations.
//  case SCV_VEC:
//      SCVec *vec;
//  case SCV_MAP:
//      SCMap *map;
//
//  case SCV_ADDRESS:
//      SCAddress address;
//
//  // Special SCVals reserved for system-constructed contract-data
//  // ledger keys, not generally usable elsewhere.
//  case SCV_LEDGER_KEY_CONTRACT_INSTANCE:
//      void;
//  case SCV_LEDGER_KEY_NONCE:
//      SCNonceKey nonce_key;
//
//  case SCV_CONTRACT_INSTANCE:
//      SCContractInstance instance;
//  };

//  ===========================================================================
public class SCVal implements XdrElement {
  public SCVal() {}

  SCValType type;

  public SCValType getDiscriminant() {
    return this.type;
  }

  public void setDiscriminant(SCValType value) {
    this.type = value;
  }

  private Boolean b;

  public Boolean getB() {
    return this.b;
  }

  public void setB(Boolean value) {
    this.b = value;
  }

  private SCError error;

  public SCError getError() {
    return this.error;
  }

  public void setError(SCError value) {
    this.error = value;
  }

  private Uint32 u32;

  public Uint32 getU32() {
    return this.u32;
  }

  public void setU32(Uint32 value) {
    this.u32 = value;
  }

  private Int32 i32;

  public Int32 getI32() {
    return this.i32;
  }

  public void setI32(Int32 value) {
    this.i32 = value;
  }

  private Uint64 u64;

  public Uint64 getU64() {
    return this.u64;
  }

  public void setU64(Uint64 value) {
    this.u64 = value;
  }

  private Int64 i64;

  public Int64 getI64() {
    return this.i64;
  }

  public void setI64(Int64 value) {
    this.i64 = value;
  }

  private TimePoint timepoint;

  public TimePoint getTimepoint() {
    return this.timepoint;
  }

  public void setTimepoint(TimePoint value) {
    this.timepoint = value;
  }

  private Duration duration;

  public Duration getDuration() {
    return this.duration;
  }

  public void setDuration(Duration value) {
    this.duration = value;
  }

  private UInt128Parts u128;

  public UInt128Parts getU128() {
    return this.u128;
  }

  public void setU128(UInt128Parts value) {
    this.u128 = value;
  }

  private Int128Parts i128;

  public Int128Parts getI128() {
    return this.i128;
  }

  public void setI128(Int128Parts value) {
    this.i128 = value;
  }

  private UInt256Parts u256;

  public UInt256Parts getU256() {
    return this.u256;
  }

  public void setU256(UInt256Parts value) {
    this.u256 = value;
  }

  private Int256Parts i256;

  public Int256Parts getI256() {
    return this.i256;
  }

  public void setI256(Int256Parts value) {
    this.i256 = value;
  }

  private SCBytes bytes;

  public SCBytes getBytes() {
    return this.bytes;
  }

  public void setBytes(SCBytes value) {
    this.bytes = value;
  }

  private SCString str;

  public SCString getStr() {
    return this.str;
  }

  public void setStr(SCString value) {
    this.str = value;
  }

  private SCSymbol sym;

  public SCSymbol getSym() {
    return this.sym;
  }

  public void setSym(SCSymbol value) {
    this.sym = value;
  }

  private SCVec vec;

  public SCVec getVec() {
    return this.vec;
  }

  public void setVec(SCVec value) {
    this.vec = value;
  }

  private SCMap map;

  public SCMap getMap() {
    return this.map;
  }

  public void setMap(SCMap value) {
    this.map = value;
  }

  private SCAddress address;

  public SCAddress getAddress() {
    return this.address;
  }

  public void setAddress(SCAddress value) {
    this.address = value;
  }

  private SCNonceKey nonce_key;

  public SCNonceKey getNonce_key() {
    return this.nonce_key;
  }

  public void setNonce_key(SCNonceKey value) {
    this.nonce_key = value;
  }

  private SCContractInstance instance;

  public SCContractInstance getInstance() {
    return this.instance;
  }

  public void setInstance(SCContractInstance value) {
    this.instance = value;
  }

  public static final class Builder {
    private SCValType discriminant;
    private Boolean b;
    private SCError error;
    private Uint32 u32;
    private Int32 i32;
    private Uint64 u64;
    private Int64 i64;
    private TimePoint timepoint;
    private Duration duration;
    private UInt128Parts u128;
    private Int128Parts i128;
    private UInt256Parts u256;
    private Int256Parts i256;
    private SCBytes bytes;
    private SCString str;
    private SCSymbol sym;
    private SCVec vec;
    private SCMap map;
    private SCAddress address;
    private SCNonceKey nonce_key;
    private SCContractInstance instance;

    public Builder discriminant(SCValType discriminant) {
      this.discriminant = discriminant;
      return this;
    }

    public Builder b(Boolean b) {
      this.b = b;
      return this;
    }

    public Builder error(SCError error) {
      this.error = error;
      return this;
    }

    public Builder u32(Uint32 u32) {
      this.u32 = u32;
      return this;
    }

    public Builder i32(Int32 i32) {
      this.i32 = i32;
      return this;
    }

    public Builder u64(Uint64 u64) {
      this.u64 = u64;
      return this;
    }

    public Builder i64(Int64 i64) {
      this.i64 = i64;
      return this;
    }

    public Builder timepoint(TimePoint timepoint) {
      this.timepoint = timepoint;
      return this;
    }

    public Builder duration(Duration duration) {
      this.duration = duration;
      return this;
    }

    public Builder u128(UInt128Parts u128) {
      this.u128 = u128;
      return this;
    }

    public Builder i128(Int128Parts i128) {
      this.i128 = i128;
      return this;
    }

    public Builder u256(UInt256Parts u256) {
      this.u256 = u256;
      return this;
    }

    public Builder i256(Int256Parts i256) {
      this.i256 = i256;
      return this;
    }

    public Builder bytes(SCBytes bytes) {
      this.bytes = bytes;
      return this;
    }

    public Builder str(SCString str) {
      this.str = str;
      return this;
    }

    public Builder sym(SCSymbol sym) {
      this.sym = sym;
      return this;
    }

    public Builder vec(SCVec vec) {
      this.vec = vec;
      return this;
    }

    public Builder map(SCMap map) {
      this.map = map;
      return this;
    }

    public Builder address(SCAddress address) {
      this.address = address;
      return this;
    }

    public Builder nonce_key(SCNonceKey nonce_key) {
      this.nonce_key = nonce_key;
      return this;
    }

    public Builder instance(SCContractInstance instance) {
      this.instance = instance;
      return this;
    }

    public SCVal build() {
      SCVal val = new SCVal();
      val.setDiscriminant(discriminant);
      val.setB(this.b);
      val.setError(this.error);
      val.setU32(this.u32);
      val.setI32(this.i32);
      val.setU64(this.u64);
      val.setI64(this.i64);
      val.setTimepoint(this.timepoint);
      val.setDuration(this.duration);
      val.setU128(this.u128);
      val.setI128(this.i128);
      val.setU256(this.u256);
      val.setI256(this.i256);
      val.setBytes(this.bytes);
      val.setStr(this.str);
      val.setSym(this.sym);
      val.setVec(this.vec);
      val.setMap(this.map);
      val.setAddress(this.address);
      val.setNonce_key(this.nonce_key);
      val.setInstance(this.instance);
      return val;
    }
  }

  public static void encode(XdrDataOutputStream stream, SCVal encodedSCVal) throws IOException {
    // Xdrgen::AST::Identifier
    // SCValType
    stream.writeInt(encodedSCVal.getDiscriminant().getValue());
    switch (encodedSCVal.getDiscriminant()) {
      case SCV_BOOL:
        stream.writeInt(encodedSCVal.b ? 1 : 0);
        break;
      case SCV_VOID:
        break;
      case SCV_ERROR:
        SCError.encode(stream, encodedSCVal.error);
        break;
      case SCV_U32:
        Uint32.encode(stream, encodedSCVal.u32);
        break;
      case SCV_I32:
        Int32.encode(stream, encodedSCVal.i32);
        break;
      case SCV_U64:
        Uint64.encode(stream, encodedSCVal.u64);
        break;
      case SCV_I64:
        Int64.encode(stream, encodedSCVal.i64);
        break;
      case SCV_TIMEPOINT:
        TimePoint.encode(stream, encodedSCVal.timepoint);
        break;
      case SCV_DURATION:
        Duration.encode(stream, encodedSCVal.duration);
        break;
      case SCV_U128:
        UInt128Parts.encode(stream, encodedSCVal.u128);
        break;
      case SCV_I128:
        Int128Parts.encode(stream, encodedSCVal.i128);
        break;
      case SCV_U256:
        UInt256Parts.encode(stream, encodedSCVal.u256);
        break;
      case SCV_I256:
        Int256Parts.encode(stream, encodedSCVal.i256);
        break;
      case SCV_BYTES:
        SCBytes.encode(stream, encodedSCVal.bytes);
        break;
      case SCV_STRING:
        SCString.encode(stream, encodedSCVal.str);
        break;
      case SCV_SYMBOL:
        SCSymbol.encode(stream, encodedSCVal.sym);
        break;
      case SCV_VEC:
        if (encodedSCVal.vec != null) {
          stream.writeInt(1);
          SCVec.encode(stream, encodedSCVal.vec);
        } else {
          stream.writeInt(0);
        }
        break;
      case SCV_MAP:
        if (encodedSCVal.map != null) {
          stream.writeInt(1);
          SCMap.encode(stream, encodedSCVal.map);
        } else {
          stream.writeInt(0);
        }
        break;
      case SCV_ADDRESS:
        SCAddress.encode(stream, encodedSCVal.address);
        break;
      case SCV_LEDGER_KEY_CONTRACT_INSTANCE:
        break;
      case SCV_LEDGER_KEY_NONCE:
        SCNonceKey.encode(stream, encodedSCVal.nonce_key);
        break;
      case SCV_CONTRACT_INSTANCE:
        SCContractInstance.encode(stream, encodedSCVal.instance);
        break;
    }
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  public static SCVal decode(XdrDataInputStream stream) throws IOException {
    SCVal decodedSCVal = new SCVal();
    SCValType discriminant = SCValType.decode(stream);
    decodedSCVal.setDiscriminant(discriminant);
    switch (decodedSCVal.getDiscriminant()) {
      case SCV_BOOL:
        decodedSCVal.b = stream.readInt() == 1 ? true : false;
        break;
      case SCV_VOID:
        break;
      case SCV_ERROR:
        decodedSCVal.error = SCError.decode(stream);
        break;
      case SCV_U32:
        decodedSCVal.u32 = Uint32.decode(stream);
        break;
      case SCV_I32:
        decodedSCVal.i32 = Int32.decode(stream);
        break;
      case SCV_U64:
        decodedSCVal.u64 = Uint64.decode(stream);
        break;
      case SCV_I64:
        decodedSCVal.i64 = Int64.decode(stream);
        break;
      case SCV_TIMEPOINT:
        decodedSCVal.timepoint = TimePoint.decode(stream);
        break;
      case SCV_DURATION:
        decodedSCVal.duration = Duration.decode(stream);
        break;
      case SCV_U128:
        decodedSCVal.u128 = UInt128Parts.decode(stream);
        break;
      case SCV_I128:
        decodedSCVal.i128 = Int128Parts.decode(stream);
        break;
      case SCV_U256:
        decodedSCVal.u256 = UInt256Parts.decode(stream);
        break;
      case SCV_I256:
        decodedSCVal.i256 = Int256Parts.decode(stream);
        break;
      case SCV_BYTES:
        decodedSCVal.bytes = SCBytes.decode(stream);
        break;
      case SCV_STRING:
        decodedSCVal.str = SCString.decode(stream);
        break;
      case SCV_SYMBOL:
        decodedSCVal.sym = SCSymbol.decode(stream);
        break;
      case SCV_VEC:
        int vecPresent = stream.readInt();
        if (vecPresent != 0) {
          decodedSCVal.vec = SCVec.decode(stream);
        }
        break;
      case SCV_MAP:
        int mapPresent = stream.readInt();
        if (mapPresent != 0) {
          decodedSCVal.map = SCMap.decode(stream);
        }
        break;
      case SCV_ADDRESS:
        decodedSCVal.address = SCAddress.decode(stream);
        break;
      case SCV_LEDGER_KEY_CONTRACT_INSTANCE:
        break;
      case SCV_LEDGER_KEY_NONCE:
        decodedSCVal.nonce_key = SCNonceKey.decode(stream);
        break;
      case SCV_CONTRACT_INSTANCE:
        decodedSCVal.instance = SCContractInstance.decode(stream);
        break;
    }
    return decodedSCVal;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(
        this.b,
        this.error,
        this.u32,
        this.i32,
        this.u64,
        this.i64,
        this.timepoint,
        this.duration,
        this.u128,
        this.i128,
        this.u256,
        this.i256,
        this.bytes,
        this.str,
        this.sym,
        this.vec,
        this.map,
        this.address,
        this.nonce_key,
        this.instance,
        this.type);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof SCVal)) {
      return false;
    }

    SCVal other = (SCVal) object;
    return Objects.equal(this.b, other.b)
        && Objects.equal(this.error, other.error)
        && Objects.equal(this.u32, other.u32)
        && Objects.equal(this.i32, other.i32)
        && Objects.equal(this.u64, other.u64)
        && Objects.equal(this.i64, other.i64)
        && Objects.equal(this.timepoint, other.timepoint)
        && Objects.equal(this.duration, other.duration)
        && Objects.equal(this.u128, other.u128)
        && Objects.equal(this.i128, other.i128)
        && Objects.equal(this.u256, other.u256)
        && Objects.equal(this.i256, other.i256)
        && Objects.equal(this.bytes, other.bytes)
        && Objects.equal(this.str, other.str)
        && Objects.equal(this.sym, other.sym)
        && Objects.equal(this.vec, other.vec)
        && Objects.equal(this.map, other.map)
        && Objects.equal(this.address, other.address)
        && Objects.equal(this.nonce_key, other.nonce_key)
        && Objects.equal(this.instance, other.instance)
        && Objects.equal(this.type, other.type);
  }
}
