// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;

import static org.stellar.sdk.xdr.Constants.*;

import com.google.common.base.Objects;
import java.io.IOException;

// === xdr source ============================================================

//  struct SendMore
//  {
//      uint32 numMessages;
//  };

//  ===========================================================================
public class SendMore implements XdrElement {
  public SendMore() {}

  private Uint32 numMessages;

  public Uint32 getNumMessages() {
    return this.numMessages;
  }

  public void setNumMessages(Uint32 value) {
    this.numMessages = value;
  }

  public static void encode(XdrDataOutputStream stream, SendMore encodedSendMore)
      throws IOException {
    Uint32.encode(stream, encodedSendMore.numMessages);
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  public static SendMore decode(XdrDataInputStream stream) throws IOException {
    SendMore decodedSendMore = new SendMore();
    decodedSendMore.numMessages = Uint32.decode(stream);
    return decodedSendMore;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.numMessages);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof SendMore)) {
      return false;
    }

    SendMore other = (SendMore) object;
    return Objects.equal(this.numMessages, other.numMessages);
  }

  public static final class Builder {
    private Uint32 numMessages;

    public Builder numMessages(Uint32 numMessages) {
      this.numMessages = numMessages;
      return this;
    }

    public SendMore build() {
      SendMore val = new SendMore();
      val.setNumMessages(this.numMessages);
      return val;
    }
  }
}
