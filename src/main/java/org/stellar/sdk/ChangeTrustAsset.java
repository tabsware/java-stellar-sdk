package org.stellar.sdk;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * ChangeTrustAsset class.
 * @see <a href="https://www.stellar.org/developers/learn/concepts/assets.html" target="_blank">Assets</a>
 */
public abstract class ChangeTrustAsset {
  ChangeTrustAsset() {}

  /**
   * Parses an asset string and returns the equivalent ChangeTrustAsset instance.
   * The asset string is expected to either be "native" or a string of the form "CODE:ISSUER"
   *
   * @param canonicalForm Canonical string representation of an asset
   */
  public static ChangeTrustAsset create(String canonicalForm) {
    return new Wrapper(Asset.create(canonicalForm));
  }

  public static ChangeTrustAsset create(String type, String code, String issuer) {
    return new Wrapper(Asset.create(type, code, issuer));
  }
  public static ChangeTrustAsset create(Asset asset) {
    return new Wrapper(asset);
  }
  public static ChangeTrustAsset create(LiquidityPoolParameters params) {
    return new LiquidityPoolShareChangeTrustAsset(params);
  }
  public static ChangeTrustAsset create(TrustLineAsset.Wrapper wrapper) {
    return new Wrapper(wrapper.getAsset());
  }
  // Cannot convert from LiquidityPoolShareTrustLineAsset, as that only has a
  // liquidity pool id, not parameters.

  /**
   * Creates one of AssetTypeCreditAlphaNum4 or AssetTypeCreditAlphaNum12 object based on a <code>code</code> length
   * @param code ChangeTrustAsset code
   * @param issuer ChangeTrustAsset issuer
   */
  public static ChangeTrustAsset createNonNativeAsset(String code, String issuer) {
    return ChangeTrustAsset.create(Asset.createNonNativeAsset(code, issuer));
  }

  /**
   * Generates ChangeTrustAsset object from a given XDR object
   * @param xdr XDR object
   */
  public static ChangeTrustAsset fromXdr(org.stellar.sdk.xdr.ChangeTrustAsset xdr) {
    // TODO: Figure out how we can re-use Asset.fromXdr here
    String accountId;
    switch (xdr.getDiscriminant()) {
      case ASSET_TYPE_NATIVE:
        return ChangeTrustAsset.create(new AssetTypeNative());
      case ASSET_TYPE_CREDIT_ALPHANUM4:
        String assetCode4 = Util.paddedByteArrayToString(xdr.getAlphaNum4().getAssetCode().getAssetCode4());
        accountId = StrKey.encodeStellarAccountId(xdr.getAlphaNum4().getIssuer());
        return ChangeTrustAsset.create(new AssetTypeCreditAlphaNum4(assetCode4, accountId));
      case ASSET_TYPE_CREDIT_ALPHANUM12:
        String assetCode12 = Util.paddedByteArrayToString(xdr.getAlphaNum12().getAssetCode().getAssetCode12());
        accountId = StrKey.encodeStellarAccountId(xdr.getAlphaNum12().getIssuer());
        return ChangeTrustAsset.create(new AssetTypeCreditAlphaNum12(assetCode12, accountId));
      case ASSET_TYPE_POOL_SHARE:
          return new LiquidityPoolShareChangeTrustAsset(LiquidityPoolParameters.fromXdr(xdr.getLiquidityPool()));
      default:
        throw new IllegalArgumentException("Unknown asset type " + xdr.getDiscriminant());
    }
  }

  /**
   * Generates XDR object from a given ChangeTrustAsset object
   */
  public abstract org.stellar.sdk.xdr.ChangeTrustAsset toXdr();

  public static final class Wrapper extends ChangeTrustAsset {
    private Asset asset;

    public Wrapper(Asset baseAsset) {
      super();
      checkNotNull(baseAsset, "asset cannot be null");
      asset = baseAsset;
    }

    public Asset getAsset() {
      return asset;
    }

    @Override
    public org.stellar.sdk.xdr.ChangeTrustAsset toXdr() {
      org.stellar.sdk.xdr.ChangeTrustAsset xdr = new org.stellar.sdk.xdr.ChangeTrustAsset();

      org.stellar.sdk.xdr.Asset assetXdr = asset.toXdr();
      xdr.setDiscriminant(assetXdr.getDiscriminant());
      xdr.setAlphaNum4(assetXdr.getAlphaNum4());
      xdr.setAlphaNum12(assetXdr.getAlphaNum12());

      return xdr;
    }
  }
}
