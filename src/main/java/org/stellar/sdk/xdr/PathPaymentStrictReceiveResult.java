// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;

import static org.stellar.sdk.xdr.Constants.*;

import com.google.common.base.Objects;
import java.io.IOException;
import java.util.Arrays;

// === xdr source ============================================================

//  union PathPaymentStrictReceiveResult switch (
//      PathPaymentStrictReceiveResultCode code)
//  {
//  case PATH_PAYMENT_STRICT_RECEIVE_SUCCESS:
//      struct
//      {
//          ClaimAtom offers<>;
//          SimplePaymentResult last;
//      } success;
//  case PATH_PAYMENT_STRICT_RECEIVE_MALFORMED:
//  case PATH_PAYMENT_STRICT_RECEIVE_UNDERFUNDED:
//  case PATH_PAYMENT_STRICT_RECEIVE_SRC_NO_TRUST:
//  case PATH_PAYMENT_STRICT_RECEIVE_SRC_NOT_AUTHORIZED:
//  case PATH_PAYMENT_STRICT_RECEIVE_NO_DESTINATION:
//  case PATH_PAYMENT_STRICT_RECEIVE_NO_TRUST:
//  case PATH_PAYMENT_STRICT_RECEIVE_NOT_AUTHORIZED:
//  case PATH_PAYMENT_STRICT_RECEIVE_LINE_FULL:
//      void;
//  case PATH_PAYMENT_STRICT_RECEIVE_NO_ISSUER:
//      Asset noIssuer; // the asset that caused the error
//  case PATH_PAYMENT_STRICT_RECEIVE_TOO_FEW_OFFERS:
//  case PATH_PAYMENT_STRICT_RECEIVE_OFFER_CROSS_SELF:
//  case PATH_PAYMENT_STRICT_RECEIVE_OVER_SENDMAX:
//      void;
//  };

//  ===========================================================================
public class PathPaymentStrictReceiveResult implements XdrElement {
  public PathPaymentStrictReceiveResult() {}

  PathPaymentStrictReceiveResultCode code;

  public PathPaymentStrictReceiveResultCode getDiscriminant() {
    return this.code;
  }

  public void setDiscriminant(PathPaymentStrictReceiveResultCode value) {
    this.code = value;
  }

  private PathPaymentStrictReceiveResultSuccess success;

  public PathPaymentStrictReceiveResultSuccess getSuccess() {
    return this.success;
  }

  public void setSuccess(PathPaymentStrictReceiveResultSuccess value) {
    this.success = value;
  }

  private Asset noIssuer;

  public Asset getNoIssuer() {
    return this.noIssuer;
  }

  public void setNoIssuer(Asset value) {
    this.noIssuer = value;
  }

  public static final class Builder {
    private PathPaymentStrictReceiveResultCode discriminant;
    private PathPaymentStrictReceiveResultSuccess success;
    private Asset noIssuer;

    public Builder discriminant(PathPaymentStrictReceiveResultCode discriminant) {
      this.discriminant = discriminant;
      return this;
    }

    public Builder success(PathPaymentStrictReceiveResultSuccess success) {
      this.success = success;
      return this;
    }

    public Builder noIssuer(Asset noIssuer) {
      this.noIssuer = noIssuer;
      return this;
    }

    public PathPaymentStrictReceiveResult build() {
      PathPaymentStrictReceiveResult val = new PathPaymentStrictReceiveResult();
      val.setDiscriminant(discriminant);
      val.setSuccess(this.success);
      val.setNoIssuer(this.noIssuer);
      return val;
    }
  }

  public static void encode(
      XdrDataOutputStream stream,
      PathPaymentStrictReceiveResult encodedPathPaymentStrictReceiveResult)
      throws IOException {
    // Xdrgen::AST::Identifier
    // PathPaymentStrictReceiveResultCode
    stream.writeInt(encodedPathPaymentStrictReceiveResult.getDiscriminant().getValue());
    switch (encodedPathPaymentStrictReceiveResult.getDiscriminant()) {
      case PATH_PAYMENT_STRICT_RECEIVE_SUCCESS:
        PathPaymentStrictReceiveResultSuccess.encode(
            stream, encodedPathPaymentStrictReceiveResult.success);
        break;
      case PATH_PAYMENT_STRICT_RECEIVE_MALFORMED:
      case PATH_PAYMENT_STRICT_RECEIVE_UNDERFUNDED:
      case PATH_PAYMENT_STRICT_RECEIVE_SRC_NO_TRUST:
      case PATH_PAYMENT_STRICT_RECEIVE_SRC_NOT_AUTHORIZED:
      case PATH_PAYMENT_STRICT_RECEIVE_NO_DESTINATION:
      case PATH_PAYMENT_STRICT_RECEIVE_NO_TRUST:
      case PATH_PAYMENT_STRICT_RECEIVE_NOT_AUTHORIZED:
      case PATH_PAYMENT_STRICT_RECEIVE_LINE_FULL:
        break;
      case PATH_PAYMENT_STRICT_RECEIVE_NO_ISSUER:
        Asset.encode(stream, encodedPathPaymentStrictReceiveResult.noIssuer);
        break;
      case PATH_PAYMENT_STRICT_RECEIVE_TOO_FEW_OFFERS:
      case PATH_PAYMENT_STRICT_RECEIVE_OFFER_CROSS_SELF:
      case PATH_PAYMENT_STRICT_RECEIVE_OVER_SENDMAX:
        break;
    }
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  public static PathPaymentStrictReceiveResult decode(XdrDataInputStream stream)
      throws IOException {
    PathPaymentStrictReceiveResult decodedPathPaymentStrictReceiveResult =
        new PathPaymentStrictReceiveResult();
    PathPaymentStrictReceiveResultCode discriminant =
        PathPaymentStrictReceiveResultCode.decode(stream);
    decodedPathPaymentStrictReceiveResult.setDiscriminant(discriminant);
    switch (decodedPathPaymentStrictReceiveResult.getDiscriminant()) {
      case PATH_PAYMENT_STRICT_RECEIVE_SUCCESS:
        decodedPathPaymentStrictReceiveResult.success =
            PathPaymentStrictReceiveResultSuccess.decode(stream);
        break;
      case PATH_PAYMENT_STRICT_RECEIVE_MALFORMED:
      case PATH_PAYMENT_STRICT_RECEIVE_UNDERFUNDED:
      case PATH_PAYMENT_STRICT_RECEIVE_SRC_NO_TRUST:
      case PATH_PAYMENT_STRICT_RECEIVE_SRC_NOT_AUTHORIZED:
      case PATH_PAYMENT_STRICT_RECEIVE_NO_DESTINATION:
      case PATH_PAYMENT_STRICT_RECEIVE_NO_TRUST:
      case PATH_PAYMENT_STRICT_RECEIVE_NOT_AUTHORIZED:
      case PATH_PAYMENT_STRICT_RECEIVE_LINE_FULL:
        break;
      case PATH_PAYMENT_STRICT_RECEIVE_NO_ISSUER:
        decodedPathPaymentStrictReceiveResult.noIssuer = Asset.decode(stream);
        break;
      case PATH_PAYMENT_STRICT_RECEIVE_TOO_FEW_OFFERS:
      case PATH_PAYMENT_STRICT_RECEIVE_OFFER_CROSS_SELF:
      case PATH_PAYMENT_STRICT_RECEIVE_OVER_SENDMAX:
        break;
    }
    return decodedPathPaymentStrictReceiveResult;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.success, this.noIssuer, this.code);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof PathPaymentStrictReceiveResult)) {
      return false;
    }

    PathPaymentStrictReceiveResult other = (PathPaymentStrictReceiveResult) object;
    return Objects.equal(this.success, other.success)
        && Objects.equal(this.noIssuer, other.noIssuer)
        && Objects.equal(this.code, other.code);
  }

  public static class PathPaymentStrictReceiveResultSuccess {
    public PathPaymentStrictReceiveResultSuccess() {}

    private ClaimAtom[] offers;

    public ClaimAtom[] getOffers() {
      return this.offers;
    }

    public void setOffers(ClaimAtom[] value) {
      this.offers = value;
    }

    private SimplePaymentResult last;

    public SimplePaymentResult getLast() {
      return this.last;
    }

    public void setLast(SimplePaymentResult value) {
      this.last = value;
    }

    public static void encode(
        XdrDataOutputStream stream,
        PathPaymentStrictReceiveResultSuccess encodedPathPaymentStrictReceiveResultSuccess)
        throws IOException {
      int offerssize = encodedPathPaymentStrictReceiveResultSuccess.getOffers().length;
      stream.writeInt(offerssize);
      for (int i = 0; i < offerssize; i++) {
        ClaimAtom.encode(stream, encodedPathPaymentStrictReceiveResultSuccess.offers[i]);
      }
      SimplePaymentResult.encode(stream, encodedPathPaymentStrictReceiveResultSuccess.last);
    }

    public void encode(XdrDataOutputStream stream) throws IOException {
      encode(stream, this);
    }

    public static PathPaymentStrictReceiveResultSuccess decode(XdrDataInputStream stream)
        throws IOException {
      PathPaymentStrictReceiveResultSuccess decodedPathPaymentStrictReceiveResultSuccess =
          new PathPaymentStrictReceiveResultSuccess();
      int offerssize = stream.readInt();
      decodedPathPaymentStrictReceiveResultSuccess.offers = new ClaimAtom[offerssize];
      for (int i = 0; i < offerssize; i++) {
        decodedPathPaymentStrictReceiveResultSuccess.offers[i] = ClaimAtom.decode(stream);
      }
      decodedPathPaymentStrictReceiveResultSuccess.last = SimplePaymentResult.decode(stream);
      return decodedPathPaymentStrictReceiveResultSuccess;
    }

    @Override
    public int hashCode() {
      return Objects.hashCode(Arrays.hashCode(this.offers), this.last);
    }

    @Override
    public boolean equals(Object object) {
      if (!(object instanceof PathPaymentStrictReceiveResultSuccess)) {
        return false;
      }

      PathPaymentStrictReceiveResultSuccess other = (PathPaymentStrictReceiveResultSuccess) object;
      return Arrays.equals(this.offers, other.offers) && Objects.equal(this.last, other.last);
    }

    public static final class Builder {
      private ClaimAtom[] offers;
      private SimplePaymentResult last;

      public Builder offers(ClaimAtom[] offers) {
        this.offers = offers;
        return this;
      }

      public Builder last(SimplePaymentResult last) {
        this.last = last;
        return this;
      }

      public PathPaymentStrictReceiveResultSuccess build() {
        PathPaymentStrictReceiveResultSuccess val = new PathPaymentStrictReceiveResultSuccess();
        val.setOffers(this.offers);
        val.setLast(this.last);
        return val;
      }
    }
  }
}
