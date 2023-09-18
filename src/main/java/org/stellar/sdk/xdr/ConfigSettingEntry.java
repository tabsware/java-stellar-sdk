// Automatically generated by xdrgen
// DO NOT EDIT or your changes may be overwritten

package org.stellar.sdk.xdr;

import static org.stellar.sdk.xdr.Constants.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;

// === xdr source ============================================================

//  union ConfigSettingEntry switch (ConfigSettingID configSettingID)
//  {
//  case CONFIG_SETTING_CONTRACT_MAX_SIZE_BYTES:
//      uint32 contractMaxSizeBytes;
//  case CONFIG_SETTING_CONTRACT_COMPUTE_V0:
//      ConfigSettingContractComputeV0 contractCompute;
//  case CONFIG_SETTING_CONTRACT_LEDGER_COST_V0:
//      ConfigSettingContractLedgerCostV0 contractLedgerCost;
//  case CONFIG_SETTING_CONTRACT_HISTORICAL_DATA_V0:
//      ConfigSettingContractHistoricalDataV0 contractHistoricalData;
//  case CONFIG_SETTING_CONTRACT_EVENTS_V0:
//      ConfigSettingContractEventsV0 contractEvents;
//  case CONFIG_SETTING_CONTRACT_BANDWIDTH_V0:
//      ConfigSettingContractBandwidthV0 contractBandwidth;
//  case CONFIG_SETTING_CONTRACT_COST_PARAMS_CPU_INSTRUCTIONS:
//      ContractCostParams contractCostParamsCpuInsns;
//  case CONFIG_SETTING_CONTRACT_COST_PARAMS_MEMORY_BYTES:
//      ContractCostParams contractCostParamsMemBytes;
//  case CONFIG_SETTING_CONTRACT_DATA_KEY_SIZE_BYTES:
//      uint32 contractDataKeySizeBytes;
//  case CONFIG_SETTING_CONTRACT_DATA_ENTRY_SIZE_BYTES:
//      uint32 contractDataEntrySizeBytes;
//  case CONFIG_SETTING_STATE_EXPIRATION:
//      StateExpirationSettings stateExpirationSettings;
//  case CONFIG_SETTING_CONTRACT_EXECUTION_LANES:
//      ConfigSettingContractExecutionLanesV0 contractExecutionLanes;
//  case CONFIG_SETTING_BUCKETLIST_SIZE_WINDOW:
//      uint64 bucketListSizeWindow<>;
//  case CONFIG_SETTING_EVICTION_ITERATOR:
//      EvictionIterator evictionIterator;
//  };

//  ===========================================================================
public class ConfigSettingEntry implements XdrElement {
  public ConfigSettingEntry() {}

  ConfigSettingID configSettingID;

  public ConfigSettingID getDiscriminant() {
    return this.configSettingID;
  }

  public void setDiscriminant(ConfigSettingID value) {
    this.configSettingID = value;
  }

  private Uint32 contractMaxSizeBytes;

  public Uint32 getContractMaxSizeBytes() {
    return this.contractMaxSizeBytes;
  }

  public void setContractMaxSizeBytes(Uint32 value) {
    this.contractMaxSizeBytes = value;
  }

  private ConfigSettingContractComputeV0 contractCompute;

  public ConfigSettingContractComputeV0 getContractCompute() {
    return this.contractCompute;
  }

  public void setContractCompute(ConfigSettingContractComputeV0 value) {
    this.contractCompute = value;
  }

  private ConfigSettingContractLedgerCostV0 contractLedgerCost;

  public ConfigSettingContractLedgerCostV0 getContractLedgerCost() {
    return this.contractLedgerCost;
  }

  public void setContractLedgerCost(ConfigSettingContractLedgerCostV0 value) {
    this.contractLedgerCost = value;
  }

  private ConfigSettingContractHistoricalDataV0 contractHistoricalData;

  public ConfigSettingContractHistoricalDataV0 getContractHistoricalData() {
    return this.contractHistoricalData;
  }

  public void setContractHistoricalData(ConfigSettingContractHistoricalDataV0 value) {
    this.contractHistoricalData = value;
  }

  private ConfigSettingContractEventsV0 contractEvents;

  public ConfigSettingContractEventsV0 getContractEvents() {
    return this.contractEvents;
  }

  public void setContractEvents(ConfigSettingContractEventsV0 value) {
    this.contractEvents = value;
  }

  private ConfigSettingContractBandwidthV0 contractBandwidth;

  public ConfigSettingContractBandwidthV0 getContractBandwidth() {
    return this.contractBandwidth;
  }

  public void setContractBandwidth(ConfigSettingContractBandwidthV0 value) {
    this.contractBandwidth = value;
  }

  private ContractCostParams contractCostParamsCpuInsns;

  public ContractCostParams getContractCostParamsCpuInsns() {
    return this.contractCostParamsCpuInsns;
  }

  public void setContractCostParamsCpuInsns(ContractCostParams value) {
    this.contractCostParamsCpuInsns = value;
  }

  private ContractCostParams contractCostParamsMemBytes;

  public ContractCostParams getContractCostParamsMemBytes() {
    return this.contractCostParamsMemBytes;
  }

  public void setContractCostParamsMemBytes(ContractCostParams value) {
    this.contractCostParamsMemBytes = value;
  }

  private Uint32 contractDataKeySizeBytes;

  public Uint32 getContractDataKeySizeBytes() {
    return this.contractDataKeySizeBytes;
  }

  public void setContractDataKeySizeBytes(Uint32 value) {
    this.contractDataKeySizeBytes = value;
  }

  private Uint32 contractDataEntrySizeBytes;

  public Uint32 getContractDataEntrySizeBytes() {
    return this.contractDataEntrySizeBytes;
  }

  public void setContractDataEntrySizeBytes(Uint32 value) {
    this.contractDataEntrySizeBytes = value;
  }

  private StateExpirationSettings stateExpirationSettings;

  public StateExpirationSettings getStateExpirationSettings() {
    return this.stateExpirationSettings;
  }

  public void setStateExpirationSettings(StateExpirationSettings value) {
    this.stateExpirationSettings = value;
  }

  private ConfigSettingContractExecutionLanesV0 contractExecutionLanes;

  public ConfigSettingContractExecutionLanesV0 getContractExecutionLanes() {
    return this.contractExecutionLanes;
  }

  public void setContractExecutionLanes(ConfigSettingContractExecutionLanesV0 value) {
    this.contractExecutionLanes = value;
  }

  private Uint64[] bucketListSizeWindow;

  public Uint64[] getBucketListSizeWindow() {
    return this.bucketListSizeWindow;
  }

  public void setBucketListSizeWindow(Uint64[] value) {
    this.bucketListSizeWindow = value;
  }

  private EvictionIterator evictionIterator;

  public EvictionIterator getEvictionIterator() {
    return this.evictionIterator;
  }

  public void setEvictionIterator(EvictionIterator value) {
    this.evictionIterator = value;
  }

  public static final class Builder {
    private ConfigSettingID discriminant;
    private Uint32 contractMaxSizeBytes;
    private ConfigSettingContractComputeV0 contractCompute;
    private ConfigSettingContractLedgerCostV0 contractLedgerCost;
    private ConfigSettingContractHistoricalDataV0 contractHistoricalData;
    private ConfigSettingContractEventsV0 contractEvents;
    private ConfigSettingContractBandwidthV0 contractBandwidth;
    private ContractCostParams contractCostParamsCpuInsns;
    private ContractCostParams contractCostParamsMemBytes;
    private Uint32 contractDataKeySizeBytes;
    private Uint32 contractDataEntrySizeBytes;
    private StateExpirationSettings stateExpirationSettings;
    private ConfigSettingContractExecutionLanesV0 contractExecutionLanes;
    private Uint64[] bucketListSizeWindow;
    private EvictionIterator evictionIterator;

    public Builder discriminant(ConfigSettingID discriminant) {
      this.discriminant = discriminant;
      return this;
    }

    public Builder contractMaxSizeBytes(Uint32 contractMaxSizeBytes) {
      this.contractMaxSizeBytes = contractMaxSizeBytes;
      return this;
    }

    public Builder contractCompute(ConfigSettingContractComputeV0 contractCompute) {
      this.contractCompute = contractCompute;
      return this;
    }

    public Builder contractLedgerCost(ConfigSettingContractLedgerCostV0 contractLedgerCost) {
      this.contractLedgerCost = contractLedgerCost;
      return this;
    }

    public Builder contractHistoricalData(
        ConfigSettingContractHistoricalDataV0 contractHistoricalData) {
      this.contractHistoricalData = contractHistoricalData;
      return this;
    }

    public Builder contractEvents(ConfigSettingContractEventsV0 contractEvents) {
      this.contractEvents = contractEvents;
      return this;
    }

    public Builder contractBandwidth(ConfigSettingContractBandwidthV0 contractBandwidth) {
      this.contractBandwidth = contractBandwidth;
      return this;
    }

    public Builder contractCostParamsCpuInsns(ContractCostParams contractCostParamsCpuInsns) {
      this.contractCostParamsCpuInsns = contractCostParamsCpuInsns;
      return this;
    }

    public Builder contractCostParamsMemBytes(ContractCostParams contractCostParamsMemBytes) {
      this.contractCostParamsMemBytes = contractCostParamsMemBytes;
      return this;
    }

    public Builder contractDataKeySizeBytes(Uint32 contractDataKeySizeBytes) {
      this.contractDataKeySizeBytes = contractDataKeySizeBytes;
      return this;
    }

    public Builder contractDataEntrySizeBytes(Uint32 contractDataEntrySizeBytes) {
      this.contractDataEntrySizeBytes = contractDataEntrySizeBytes;
      return this;
    }

    public Builder stateExpirationSettings(StateExpirationSettings stateExpirationSettings) {
      this.stateExpirationSettings = stateExpirationSettings;
      return this;
    }

    public Builder contractExecutionLanes(
        ConfigSettingContractExecutionLanesV0 contractExecutionLanes) {
      this.contractExecutionLanes = contractExecutionLanes;
      return this;
    }

    public Builder bucketListSizeWindow(Uint64[] bucketListSizeWindow) {
      this.bucketListSizeWindow = bucketListSizeWindow;
      return this;
    }

    public Builder evictionIterator(EvictionIterator evictionIterator) {
      this.evictionIterator = evictionIterator;
      return this;
    }

    public ConfigSettingEntry build() {
      ConfigSettingEntry val = new ConfigSettingEntry();
      val.setDiscriminant(discriminant);
      val.setContractMaxSizeBytes(this.contractMaxSizeBytes);
      val.setContractCompute(this.contractCompute);
      val.setContractLedgerCost(this.contractLedgerCost);
      val.setContractHistoricalData(this.contractHistoricalData);
      val.setContractEvents(this.contractEvents);
      val.setContractBandwidth(this.contractBandwidth);
      val.setContractCostParamsCpuInsns(this.contractCostParamsCpuInsns);
      val.setContractCostParamsMemBytes(this.contractCostParamsMemBytes);
      val.setContractDataKeySizeBytes(this.contractDataKeySizeBytes);
      val.setContractDataEntrySizeBytes(this.contractDataEntrySizeBytes);
      val.setStateExpirationSettings(this.stateExpirationSettings);
      val.setContractExecutionLanes(this.contractExecutionLanes);
      val.setBucketListSizeWindow(this.bucketListSizeWindow);
      val.setEvictionIterator(this.evictionIterator);
      return val;
    }
  }

  public static void encode(
      XdrDataOutputStream stream, ConfigSettingEntry encodedConfigSettingEntry) throws IOException {
    // Xdrgen::AST::Identifier
    // ConfigSettingID
    stream.writeInt(encodedConfigSettingEntry.getDiscriminant().getValue());
    switch (encodedConfigSettingEntry.getDiscriminant()) {
      case CONFIG_SETTING_CONTRACT_MAX_SIZE_BYTES:
        Uint32.encode(stream, encodedConfigSettingEntry.contractMaxSizeBytes);
        break;
      case CONFIG_SETTING_CONTRACT_COMPUTE_V0:
        ConfigSettingContractComputeV0.encode(stream, encodedConfigSettingEntry.contractCompute);
        break;
      case CONFIG_SETTING_CONTRACT_LEDGER_COST_V0:
        ConfigSettingContractLedgerCostV0.encode(
            stream, encodedConfigSettingEntry.contractLedgerCost);
        break;
      case CONFIG_SETTING_CONTRACT_HISTORICAL_DATA_V0:
        ConfigSettingContractHistoricalDataV0.encode(
            stream, encodedConfigSettingEntry.contractHistoricalData);
        break;
      case CONFIG_SETTING_CONTRACT_EVENTS_V0:
        ConfigSettingContractEventsV0.encode(stream, encodedConfigSettingEntry.contractEvents);
        break;
      case CONFIG_SETTING_CONTRACT_BANDWIDTH_V0:
        ConfigSettingContractBandwidthV0.encode(
            stream, encodedConfigSettingEntry.contractBandwidth);
        break;
      case CONFIG_SETTING_CONTRACT_COST_PARAMS_CPU_INSTRUCTIONS:
        ContractCostParams.encode(stream, encodedConfigSettingEntry.contractCostParamsCpuInsns);
        break;
      case CONFIG_SETTING_CONTRACT_COST_PARAMS_MEMORY_BYTES:
        ContractCostParams.encode(stream, encodedConfigSettingEntry.contractCostParamsMemBytes);
        break;
      case CONFIG_SETTING_CONTRACT_DATA_KEY_SIZE_BYTES:
        Uint32.encode(stream, encodedConfigSettingEntry.contractDataKeySizeBytes);
        break;
      case CONFIG_SETTING_CONTRACT_DATA_ENTRY_SIZE_BYTES:
        Uint32.encode(stream, encodedConfigSettingEntry.contractDataEntrySizeBytes);
        break;
      case CONFIG_SETTING_STATE_EXPIRATION:
        StateExpirationSettings.encode(stream, encodedConfigSettingEntry.stateExpirationSettings);
        break;
      case CONFIG_SETTING_CONTRACT_EXECUTION_LANES:
        ConfigSettingContractExecutionLanesV0.encode(
            stream, encodedConfigSettingEntry.contractExecutionLanes);
        break;
      case CONFIG_SETTING_BUCKETLIST_SIZE_WINDOW:
        int bucketListSizeWindowsize = encodedConfigSettingEntry.getBucketListSizeWindow().length;
        stream.writeInt(bucketListSizeWindowsize);
        for (int i = 0; i < bucketListSizeWindowsize; i++) {
          Uint64.encode(stream, encodedConfigSettingEntry.bucketListSizeWindow[i]);
        }
        break;
      case CONFIG_SETTING_EVICTION_ITERATOR:
        EvictionIterator.encode(stream, encodedConfigSettingEntry.evictionIterator);
        break;
    }
  }

  public void encode(XdrDataOutputStream stream) throws IOException {
    encode(stream, this);
  }

  public static ConfigSettingEntry decode(XdrDataInputStream stream) throws IOException {
    ConfigSettingEntry decodedConfigSettingEntry = new ConfigSettingEntry();
    ConfigSettingID discriminant = ConfigSettingID.decode(stream);
    decodedConfigSettingEntry.setDiscriminant(discriminant);
    switch (decodedConfigSettingEntry.getDiscriminant()) {
      case CONFIG_SETTING_CONTRACT_MAX_SIZE_BYTES:
        decodedConfigSettingEntry.contractMaxSizeBytes = Uint32.decode(stream);
        break;
      case CONFIG_SETTING_CONTRACT_COMPUTE_V0:
        decodedConfigSettingEntry.contractCompute = ConfigSettingContractComputeV0.decode(stream);
        break;
      case CONFIG_SETTING_CONTRACT_LEDGER_COST_V0:
        decodedConfigSettingEntry.contractLedgerCost =
            ConfigSettingContractLedgerCostV0.decode(stream);
        break;
      case CONFIG_SETTING_CONTRACT_HISTORICAL_DATA_V0:
        decodedConfigSettingEntry.contractHistoricalData =
            ConfigSettingContractHistoricalDataV0.decode(stream);
        break;
      case CONFIG_SETTING_CONTRACT_EVENTS_V0:
        decodedConfigSettingEntry.contractEvents = ConfigSettingContractEventsV0.decode(stream);
        break;
      case CONFIG_SETTING_CONTRACT_BANDWIDTH_V0:
        decodedConfigSettingEntry.contractBandwidth =
            ConfigSettingContractBandwidthV0.decode(stream);
        break;
      case CONFIG_SETTING_CONTRACT_COST_PARAMS_CPU_INSTRUCTIONS:
        decodedConfigSettingEntry.contractCostParamsCpuInsns = ContractCostParams.decode(stream);
        break;
      case CONFIG_SETTING_CONTRACT_COST_PARAMS_MEMORY_BYTES:
        decodedConfigSettingEntry.contractCostParamsMemBytes = ContractCostParams.decode(stream);
        break;
      case CONFIG_SETTING_CONTRACT_DATA_KEY_SIZE_BYTES:
        decodedConfigSettingEntry.contractDataKeySizeBytes = Uint32.decode(stream);
        break;
      case CONFIG_SETTING_CONTRACT_DATA_ENTRY_SIZE_BYTES:
        decodedConfigSettingEntry.contractDataEntrySizeBytes = Uint32.decode(stream);
        break;
      case CONFIG_SETTING_STATE_EXPIRATION:
        decodedConfigSettingEntry.stateExpirationSettings = StateExpirationSettings.decode(stream);
        break;
      case CONFIG_SETTING_CONTRACT_EXECUTION_LANES:
        decodedConfigSettingEntry.contractExecutionLanes =
            ConfigSettingContractExecutionLanesV0.decode(stream);
        break;
      case CONFIG_SETTING_BUCKETLIST_SIZE_WINDOW:
        int bucketListSizeWindowsize = stream.readInt();
        decodedConfigSettingEntry.bucketListSizeWindow = new Uint64[bucketListSizeWindowsize];
        for (int i = 0; i < bucketListSizeWindowsize; i++) {
          decodedConfigSettingEntry.bucketListSizeWindow[i] = Uint64.decode(stream);
        }
        break;
      case CONFIG_SETTING_EVICTION_ITERATOR:
        decodedConfigSettingEntry.evictionIterator = EvictionIterator.decode(stream);
        break;
    }
    return decodedConfigSettingEntry;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        this.contractMaxSizeBytes,
        this.contractCompute,
        this.contractLedgerCost,
        this.contractHistoricalData,
        this.contractEvents,
        this.contractBandwidth,
        this.contractCostParamsCpuInsns,
        this.contractCostParamsMemBytes,
        this.contractDataKeySizeBytes,
        this.contractDataEntrySizeBytes,
        this.stateExpirationSettings,
        this.contractExecutionLanes,
        Arrays.hashCode(this.bucketListSizeWindow),
        this.evictionIterator,
        this.configSettingID);
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof ConfigSettingEntry)) {
      return false;
    }

    ConfigSettingEntry other = (ConfigSettingEntry) object;
    return Objects.equals(this.contractMaxSizeBytes, other.contractMaxSizeBytes)
        && Objects.equals(this.contractCompute, other.contractCompute)
        && Objects.equals(this.contractLedgerCost, other.contractLedgerCost)
        && Objects.equals(this.contractHistoricalData, other.contractHistoricalData)
        && Objects.equals(this.contractEvents, other.contractEvents)
        && Objects.equals(this.contractBandwidth, other.contractBandwidth)
        && Objects.equals(this.contractCostParamsCpuInsns, other.contractCostParamsCpuInsns)
        && Objects.equals(this.contractCostParamsMemBytes, other.contractCostParamsMemBytes)
        && Objects.equals(this.contractDataKeySizeBytes, other.contractDataKeySizeBytes)
        && Objects.equals(this.contractDataEntrySizeBytes, other.contractDataEntrySizeBytes)
        && Objects.equals(this.stateExpirationSettings, other.stateExpirationSettings)
        && Objects.equals(this.contractExecutionLanes, other.contractExecutionLanes)
        && Arrays.equals(this.bucketListSizeWindow, other.bucketListSizeWindow)
        && Objects.equals(this.evictionIterator, other.evictionIterator)
        && Objects.equals(this.configSettingID, other.configSettingID);
  }

  @Override
  public String toXdrBase64() throws IOException {
    return Base64.getEncoder().encodeToString(toXdrByteArray());
  }

  @Override
  public byte[] toXdrByteArray() throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    XdrDataOutputStream xdrDataOutputStream = new XdrDataOutputStream(byteArrayOutputStream);
    encode(xdrDataOutputStream);
    return byteArrayOutputStream.toByteArray();
  }

  public static ConfigSettingEntry fromXdrBase64(String xdr) throws IOException {
    byte[] bytes = Base64.getDecoder().decode(xdr);
    return fromXdrByteArray(bytes);
  }

  public static ConfigSettingEntry fromXdrByteArray(byte[] xdr) throws IOException {
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xdr);
    XdrDataInputStream xdrDataInputStream = new XdrDataInputStream(byteArrayInputStream);
    return decode(xdrDataInputStream);
  }
}
