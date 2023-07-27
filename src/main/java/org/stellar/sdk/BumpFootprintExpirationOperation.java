package org.stellar.sdk;

import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.Value;
import lombok.experimental.SuperBuilder;
import org.stellar.sdk.xdr.BumpFootprintExpirationOp;
import org.stellar.sdk.xdr.ExtensionPoint;
import org.stellar.sdk.xdr.OperationType;
import org.stellar.sdk.xdr.Uint32;

/**
 * Represents <a
 * href="https://github.com/stellar/go/blob/7ff6ffae29d278f979fcd6c6bed8cd0d4b4d2e08/txnbuild/bump_footprint_expiration.go#L8-L12"
 * target="_blank">BumpFootprintExpiration</a> operation.
 *
 * <p>Bump the expiration of a footprint (read and written ledger keys).
 *
 * @see <a href="https://developers.stellar.org/docs/fundamentals-and-concepts/list-of-operations"
 *     target="_blank">List of Operations</a>
 */
@EqualsAndHashCode(callSuper = true)
@SuperBuilder(toBuilder = true)
@Value
public class BumpFootprintExpirationOperation extends Operation {

  /**
   * the number of ledgers past the LCL (last closed ledger) by which to extend the validity of the
   * ledger keys in this transaction
   */
  @NonNull Integer ledgersToExpire;

  /**
   * Constructs a new BumpFootprintExpirationOperation object from the XDR representation of the
   * {@link BumpFootprintExpirationOperation}.
   *
   * @param op the XDR representation of the {@link BumpFootprintExpirationOperation}.
   */
  public static BumpFootprintExpirationOperation fromXdr(BumpFootprintExpirationOp op) {
    return BumpFootprintExpirationOperation.builder()
        .ledgersToExpire(op.getLedgersToExpire().getUint32())
        .build();
  }

  @Override
  org.stellar.sdk.xdr.Operation.OperationBody toOperationBody(AccountConverter accountConverter) {
    BumpFootprintExpirationOp op = new BumpFootprintExpirationOp();
    op.setExt(new ExtensionPoint.Builder().discriminant(0).build());
    op.setLedgersToExpire(new Uint32(ledgersToExpire));

    org.stellar.sdk.xdr.Operation.OperationBody body =
        new org.stellar.sdk.xdr.Operation.OperationBody();
    body.setDiscriminant(OperationType.BUMP_FOOTPRINT_EXPIRATION);
    body.setBumpFootprintExpirationOp(op);
    return body;
  }

  /** Customizing builder methods. Rest of the builder code will be auto generated by Lombok. */
  public abstract static class BumpFootprintExpirationOperationBuilder<
          C extends BumpFootprintExpirationOperation,
          B extends BumpFootprintExpirationOperationBuilder<C, B>>
      extends OperationBuilder<C, B> {
    public B ledgersToExpire(Integer ledgersToExpire) {
      if (ledgersToExpire <= 0) {
        throw new IllegalArgumentException("ledgersToExpire isn't a ledger quantity (uint32)");
      }
      this.ledgersToExpire = ledgersToExpire;
      return self();
    }
  }
}
