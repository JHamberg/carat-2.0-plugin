/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.carat20.client.thrift;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

@SuppressLint("NewApi")
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2014-12-19")
public class NetworkDetails implements org.apache.thrift.TBase<NetworkDetails, NetworkDetails._Fields>, java.io.Serializable, Cloneable, Comparable<NetworkDetails> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("NetworkDetails");

  private static final org.apache.thrift.protocol.TField NETWORK_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("networkType", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MOBILE_NETWORK_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("mobileNetworkType", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField MOBILE_DATA_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("mobileDataStatus", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField MOBILE_DATA_ACTIVITY_FIELD_DESC = new org.apache.thrift.protocol.TField("mobileDataActivity", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField ROAMING_ENABLED_FIELD_DESC = new org.apache.thrift.protocol.TField("roamingEnabled", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField WIFI_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("wifiStatus", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField WIFI_SIGNAL_STRENGTH_FIELD_DESC = new org.apache.thrift.protocol.TField("wifiSignalStrength", org.apache.thrift.protocol.TType.I32, (short)7);
  private static final org.apache.thrift.protocol.TField WIFI_LINK_SPEED_FIELD_DESC = new org.apache.thrift.protocol.TField("wifiLinkSpeed", org.apache.thrift.protocol.TType.I32, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NetworkDetailsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new NetworkDetailsTupleSchemeFactory());
  }

  public String networkType; // optional
  public String mobileNetworkType; // optional
  public String mobileDataStatus; // optional
  public String mobileDataActivity; // optional
  public boolean roamingEnabled; // optional
  public String wifiStatus; // optional
  public int wifiSignalStrength; // optional
  public int wifiLinkSpeed; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NETWORK_TYPE((short)1, "networkType"),
    MOBILE_NETWORK_TYPE((short)2, "mobileNetworkType"),
    MOBILE_DATA_STATUS((short)3, "mobileDataStatus"),
    MOBILE_DATA_ACTIVITY((short)4, "mobileDataActivity"),
    ROAMING_ENABLED((short)5, "roamingEnabled"),
    WIFI_STATUS((short)6, "wifiStatus"),
    WIFI_SIGNAL_STRENGTH((short)7, "wifiSignalStrength"),
    WIFI_LINK_SPEED((short)8, "wifiLinkSpeed");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NETWORK_TYPE
          return NETWORK_TYPE;
        case 2: // MOBILE_NETWORK_TYPE
          return MOBILE_NETWORK_TYPE;
        case 3: // MOBILE_DATA_STATUS
          return MOBILE_DATA_STATUS;
        case 4: // MOBILE_DATA_ACTIVITY
          return MOBILE_DATA_ACTIVITY;
        case 5: // ROAMING_ENABLED
          return ROAMING_ENABLED;
        case 6: // WIFI_STATUS
          return WIFI_STATUS;
        case 7: // WIFI_SIGNAL_STRENGTH
          return WIFI_SIGNAL_STRENGTH;
        case 8: // WIFI_LINK_SPEED
          return WIFI_LINK_SPEED;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ROAMINGENABLED_ISSET_ID = 0;
  private static final int __WIFISIGNALSTRENGTH_ISSET_ID = 1;
  private static final int __WIFILINKSPEED_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NETWORK_TYPE,_Fields.MOBILE_NETWORK_TYPE,_Fields.MOBILE_DATA_STATUS,_Fields.MOBILE_DATA_ACTIVITY,_Fields.ROAMING_ENABLED,_Fields.WIFI_STATUS,_Fields.WIFI_SIGNAL_STRENGTH,_Fields.WIFI_LINK_SPEED};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NETWORK_TYPE, new org.apache.thrift.meta_data.FieldMetaData("networkType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MOBILE_NETWORK_TYPE, new org.apache.thrift.meta_data.FieldMetaData("mobileNetworkType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MOBILE_DATA_STATUS, new org.apache.thrift.meta_data.FieldMetaData("mobileDataStatus", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MOBILE_DATA_ACTIVITY, new org.apache.thrift.meta_data.FieldMetaData("mobileDataActivity", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ROAMING_ENABLED, new org.apache.thrift.meta_data.FieldMetaData("roamingEnabled", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.WIFI_STATUS, new org.apache.thrift.meta_data.FieldMetaData("wifiStatus", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.WIFI_SIGNAL_STRENGTH, new org.apache.thrift.meta_data.FieldMetaData("wifiSignalStrength", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.WIFI_LINK_SPEED, new org.apache.thrift.meta_data.FieldMetaData("wifiLinkSpeed", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(NetworkDetails.class, metaDataMap);
  }

  public NetworkDetails() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public NetworkDetails(NetworkDetails other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetNetworkType()) {
      this.networkType = other.networkType;
    }
    if (other.isSetMobileNetworkType()) {
      this.mobileNetworkType = other.mobileNetworkType;
    }
    if (other.isSetMobileDataStatus()) {
      this.mobileDataStatus = other.mobileDataStatus;
    }
    if (other.isSetMobileDataActivity()) {
      this.mobileDataActivity = other.mobileDataActivity;
    }
    this.roamingEnabled = other.roamingEnabled;
    if (other.isSetWifiStatus()) {
      this.wifiStatus = other.wifiStatus;
    }
    this.wifiSignalStrength = other.wifiSignalStrength;
    this.wifiLinkSpeed = other.wifiLinkSpeed;
  }

  public NetworkDetails deepCopy() {
    return new NetworkDetails(this);
  }

  @Override
  public void clear() {
    this.networkType = null;
    this.mobileNetworkType = null;
    this.mobileDataStatus = null;
    this.mobileDataActivity = null;
    setRoamingEnabledIsSet(false);
    this.roamingEnabled = false;
    this.wifiStatus = null;
    setWifiSignalStrengthIsSet(false);
    this.wifiSignalStrength = 0;
    setWifiLinkSpeedIsSet(false);
    this.wifiLinkSpeed = 0;
  }

  public String getNetworkType() {
    return this.networkType;
  }

  public NetworkDetails setNetworkType(String networkType) {
    this.networkType = networkType;
    return this;
  }

  public void unsetNetworkType() {
    this.networkType = null;
  }

  /** Returns true if field networkType is set (has been assigned a value) and false otherwise */
  public boolean isSetNetworkType() {
    return this.networkType != null;
  }

  public void setNetworkTypeIsSet(boolean value) {
    if (!value) {
      this.networkType = null;
    }
  }

  public String getMobileNetworkType() {
    return this.mobileNetworkType;
  }

  public NetworkDetails setMobileNetworkType(String mobileNetworkType) {
    this.mobileNetworkType = mobileNetworkType;
    return this;
  }

  public void unsetMobileNetworkType() {
    this.mobileNetworkType = null;
  }

  /** Returns true if field mobileNetworkType is set (has been assigned a value) and false otherwise */
  public boolean isSetMobileNetworkType() {
    return this.mobileNetworkType != null;
  }

  public void setMobileNetworkTypeIsSet(boolean value) {
    if (!value) {
      this.mobileNetworkType = null;
    }
  }

  public String getMobileDataStatus() {
    return this.mobileDataStatus;
  }

  public NetworkDetails setMobileDataStatus(String mobileDataStatus) {
    this.mobileDataStatus = mobileDataStatus;
    return this;
  }

  public void unsetMobileDataStatus() {
    this.mobileDataStatus = null;
  }

  /** Returns true if field mobileDataStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetMobileDataStatus() {
    return this.mobileDataStatus != null;
  }

  public void setMobileDataStatusIsSet(boolean value) {
    if (!value) {
      this.mobileDataStatus = null;
    }
  }

  public String getMobileDataActivity() {
    return this.mobileDataActivity;
  }

  public NetworkDetails setMobileDataActivity(String mobileDataActivity) {
    this.mobileDataActivity = mobileDataActivity;
    return this;
  }

  public void unsetMobileDataActivity() {
    this.mobileDataActivity = null;
  }

  /** Returns true if field mobileDataActivity is set (has been assigned a value) and false otherwise */
  public boolean isSetMobileDataActivity() {
    return this.mobileDataActivity != null;
  }

  public void setMobileDataActivityIsSet(boolean value) {
    if (!value) {
      this.mobileDataActivity = null;
    }
  }

  public boolean isRoamingEnabled() {
    return this.roamingEnabled;
  }

  public NetworkDetails setRoamingEnabled(boolean roamingEnabled) {
    this.roamingEnabled = roamingEnabled;
    setRoamingEnabledIsSet(true);
    return this;
  }

  public void unsetRoamingEnabled() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ROAMINGENABLED_ISSET_ID);
  }

  /** Returns true if field roamingEnabled is set (has been assigned a value) and false otherwise */
  public boolean isSetRoamingEnabled() {
    return EncodingUtils.testBit(__isset_bitfield, __ROAMINGENABLED_ISSET_ID);
  }

  public void setRoamingEnabledIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ROAMINGENABLED_ISSET_ID, value);
  }

  public String getWifiStatus() {
    return this.wifiStatus;
  }

  public NetworkDetails setWifiStatus(String wifiStatus) {
    this.wifiStatus = wifiStatus;
    return this;
  }

  public void unsetWifiStatus() {
    this.wifiStatus = null;
  }

  /** Returns true if field wifiStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetWifiStatus() {
    return this.wifiStatus != null;
  }

  public void setWifiStatusIsSet(boolean value) {
    if (!value) {
      this.wifiStatus = null;
    }
  }

  public int getWifiSignalStrength() {
    return this.wifiSignalStrength;
  }

  public NetworkDetails setWifiSignalStrength(int wifiSignalStrength) {
    this.wifiSignalStrength = wifiSignalStrength;
    setWifiSignalStrengthIsSet(true);
    return this;
  }

  public void unsetWifiSignalStrength() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WIFISIGNALSTRENGTH_ISSET_ID);
  }

  /** Returns true if field wifiSignalStrength is set (has been assigned a value) and false otherwise */
  public boolean isSetWifiSignalStrength() {
    return EncodingUtils.testBit(__isset_bitfield, __WIFISIGNALSTRENGTH_ISSET_ID);
  }

  public void setWifiSignalStrengthIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WIFISIGNALSTRENGTH_ISSET_ID, value);
  }

  public int getWifiLinkSpeed() {
    return this.wifiLinkSpeed;
  }

  public NetworkDetails setWifiLinkSpeed(int wifiLinkSpeed) {
    this.wifiLinkSpeed = wifiLinkSpeed;
    setWifiLinkSpeedIsSet(true);
    return this;
  }

  public void unsetWifiLinkSpeed() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WIFILINKSPEED_ISSET_ID);
  }

  /** Returns true if field wifiLinkSpeed is set (has been assigned a value) and false otherwise */
  public boolean isSetWifiLinkSpeed() {
    return EncodingUtils.testBit(__isset_bitfield, __WIFILINKSPEED_ISSET_ID);
  }

  public void setWifiLinkSpeedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WIFILINKSPEED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NETWORK_TYPE:
      if (value == null) {
        unsetNetworkType();
      } else {
        setNetworkType((String)value);
      }
      break;

    case MOBILE_NETWORK_TYPE:
      if (value == null) {
        unsetMobileNetworkType();
      } else {
        setMobileNetworkType((String)value);
      }
      break;

    case MOBILE_DATA_STATUS:
      if (value == null) {
        unsetMobileDataStatus();
      } else {
        setMobileDataStatus((String)value);
      }
      break;

    case MOBILE_DATA_ACTIVITY:
      if (value == null) {
        unsetMobileDataActivity();
      } else {
        setMobileDataActivity((String)value);
      }
      break;

    case ROAMING_ENABLED:
      if (value == null) {
        unsetRoamingEnabled();
      } else {
        setRoamingEnabled((Boolean)value);
      }
      break;

    case WIFI_STATUS:
      if (value == null) {
        unsetWifiStatus();
      } else {
        setWifiStatus((String)value);
      }
      break;

    case WIFI_SIGNAL_STRENGTH:
      if (value == null) {
        unsetWifiSignalStrength();
      } else {
        setWifiSignalStrength((Integer)value);
      }
      break;

    case WIFI_LINK_SPEED:
      if (value == null) {
        unsetWifiLinkSpeed();
      } else {
        setWifiLinkSpeed((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NETWORK_TYPE:
      return getNetworkType();

    case MOBILE_NETWORK_TYPE:
      return getMobileNetworkType();

    case MOBILE_DATA_STATUS:
      return getMobileDataStatus();

    case MOBILE_DATA_ACTIVITY:
      return getMobileDataActivity();

    case ROAMING_ENABLED:
      return Boolean.valueOf(isRoamingEnabled());

    case WIFI_STATUS:
      return getWifiStatus();

    case WIFI_SIGNAL_STRENGTH:
      return Integer.valueOf(getWifiSignalStrength());

    case WIFI_LINK_SPEED:
      return Integer.valueOf(getWifiLinkSpeed());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NETWORK_TYPE:
      return isSetNetworkType();
    case MOBILE_NETWORK_TYPE:
      return isSetMobileNetworkType();
    case MOBILE_DATA_STATUS:
      return isSetMobileDataStatus();
    case MOBILE_DATA_ACTIVITY:
      return isSetMobileDataActivity();
    case ROAMING_ENABLED:
      return isSetRoamingEnabled();
    case WIFI_STATUS:
      return isSetWifiStatus();
    case WIFI_SIGNAL_STRENGTH:
      return isSetWifiSignalStrength();
    case WIFI_LINK_SPEED:
      return isSetWifiLinkSpeed();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof NetworkDetails)
      return this.equals((NetworkDetails)that);
    return false;
  }

  public boolean equals(NetworkDetails that) {
    if (that == null)
      return false;

    boolean this_present_networkType = true && this.isSetNetworkType();
    boolean that_present_networkType = true && that.isSetNetworkType();
    if (this_present_networkType || that_present_networkType) {
      if (!(this_present_networkType && that_present_networkType))
        return false;
      if (!this.networkType.equals(that.networkType))
        return false;
    }

    boolean this_present_mobileNetworkType = true && this.isSetMobileNetworkType();
    boolean that_present_mobileNetworkType = true && that.isSetMobileNetworkType();
    if (this_present_mobileNetworkType || that_present_mobileNetworkType) {
      if (!(this_present_mobileNetworkType && that_present_mobileNetworkType))
        return false;
      if (!this.mobileNetworkType.equals(that.mobileNetworkType))
        return false;
    }

    boolean this_present_mobileDataStatus = true && this.isSetMobileDataStatus();
    boolean that_present_mobileDataStatus = true && that.isSetMobileDataStatus();
    if (this_present_mobileDataStatus || that_present_mobileDataStatus) {
      if (!(this_present_mobileDataStatus && that_present_mobileDataStatus))
        return false;
      if (!this.mobileDataStatus.equals(that.mobileDataStatus))
        return false;
    }

    boolean this_present_mobileDataActivity = true && this.isSetMobileDataActivity();
    boolean that_present_mobileDataActivity = true && that.isSetMobileDataActivity();
    if (this_present_mobileDataActivity || that_present_mobileDataActivity) {
      if (!(this_present_mobileDataActivity && that_present_mobileDataActivity))
        return false;
      if (!this.mobileDataActivity.equals(that.mobileDataActivity))
        return false;
    }

    boolean this_present_roamingEnabled = true && this.isSetRoamingEnabled();
    boolean that_present_roamingEnabled = true && that.isSetRoamingEnabled();
    if (this_present_roamingEnabled || that_present_roamingEnabled) {
      if (!(this_present_roamingEnabled && that_present_roamingEnabled))
        return false;
      if (this.roamingEnabled != that.roamingEnabled)
        return false;
    }

    boolean this_present_wifiStatus = true && this.isSetWifiStatus();
    boolean that_present_wifiStatus = true && that.isSetWifiStatus();
    if (this_present_wifiStatus || that_present_wifiStatus) {
      if (!(this_present_wifiStatus && that_present_wifiStatus))
        return false;
      if (!this.wifiStatus.equals(that.wifiStatus))
        return false;
    }

    boolean this_present_wifiSignalStrength = true && this.isSetWifiSignalStrength();
    boolean that_present_wifiSignalStrength = true && that.isSetWifiSignalStrength();
    if (this_present_wifiSignalStrength || that_present_wifiSignalStrength) {
      if (!(this_present_wifiSignalStrength && that_present_wifiSignalStrength))
        return false;
      if (this.wifiSignalStrength != that.wifiSignalStrength)
        return false;
    }

    boolean this_present_wifiLinkSpeed = true && this.isSetWifiLinkSpeed();
    boolean that_present_wifiLinkSpeed = true && that.isSetWifiLinkSpeed();
    if (this_present_wifiLinkSpeed || that_present_wifiLinkSpeed) {
      if (!(this_present_wifiLinkSpeed && that_present_wifiLinkSpeed))
        return false;
      if (this.wifiLinkSpeed != that.wifiLinkSpeed)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_networkType = true && (isSetNetworkType());
    list.add(present_networkType);
    if (present_networkType)
      list.add(networkType);

    boolean present_mobileNetworkType = true && (isSetMobileNetworkType());
    list.add(present_mobileNetworkType);
    if (present_mobileNetworkType)
      list.add(mobileNetworkType);

    boolean present_mobileDataStatus = true && (isSetMobileDataStatus());
    list.add(present_mobileDataStatus);
    if (present_mobileDataStatus)
      list.add(mobileDataStatus);

    boolean present_mobileDataActivity = true && (isSetMobileDataActivity());
    list.add(present_mobileDataActivity);
    if (present_mobileDataActivity)
      list.add(mobileDataActivity);

    boolean present_roamingEnabled = true && (isSetRoamingEnabled());
    list.add(present_roamingEnabled);
    if (present_roamingEnabled)
      list.add(roamingEnabled);

    boolean present_wifiStatus = true && (isSetWifiStatus());
    list.add(present_wifiStatus);
    if (present_wifiStatus)
      list.add(wifiStatus);

    boolean present_wifiSignalStrength = true && (isSetWifiSignalStrength());
    list.add(present_wifiSignalStrength);
    if (present_wifiSignalStrength)
      list.add(wifiSignalStrength);

    boolean present_wifiLinkSpeed = true && (isSetWifiLinkSpeed());
    list.add(present_wifiLinkSpeed);
    if (present_wifiLinkSpeed)
      list.add(wifiLinkSpeed);

    return list.hashCode();
  }

  @Override
  public int compareTo(NetworkDetails other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNetworkType()).compareTo(other.isSetNetworkType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNetworkType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.networkType, other.networkType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMobileNetworkType()).compareTo(other.isSetMobileNetworkType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMobileNetworkType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mobileNetworkType, other.mobileNetworkType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMobileDataStatus()).compareTo(other.isSetMobileDataStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMobileDataStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mobileDataStatus, other.mobileDataStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMobileDataActivity()).compareTo(other.isSetMobileDataActivity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMobileDataActivity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mobileDataActivity, other.mobileDataActivity);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRoamingEnabled()).compareTo(other.isSetRoamingEnabled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoamingEnabled()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roamingEnabled, other.roamingEnabled);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWifiStatus()).compareTo(other.isSetWifiStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWifiStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.wifiStatus, other.wifiStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWifiSignalStrength()).compareTo(other.isSetWifiSignalStrength());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWifiSignalStrength()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.wifiSignalStrength, other.wifiSignalStrength);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWifiLinkSpeed()).compareTo(other.isSetWifiLinkSpeed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWifiLinkSpeed()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.wifiLinkSpeed, other.wifiLinkSpeed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("NetworkDetails(");
    boolean first = true;

    if (isSetNetworkType()) {
      sb.append("networkType:");
      if (this.networkType == null) {
        sb.append("null");
      } else {
        sb.append(this.networkType);
      }
      first = false;
    }
    if (isSetMobileNetworkType()) {
      if (!first) sb.append(", ");
      sb.append("mobileNetworkType:");
      if (this.mobileNetworkType == null) {
        sb.append("null");
      } else {
        sb.append(this.mobileNetworkType);
      }
      first = false;
    }
    if (isSetMobileDataStatus()) {
      if (!first) sb.append(", ");
      sb.append("mobileDataStatus:");
      if (this.mobileDataStatus == null) {
        sb.append("null");
      } else {
        sb.append(this.mobileDataStatus);
      }
      first = false;
    }
    if (isSetMobileDataActivity()) {
      if (!first) sb.append(", ");
      sb.append("mobileDataActivity:");
      if (this.mobileDataActivity == null) {
        sb.append("null");
      } else {
        sb.append(this.mobileDataActivity);
      }
      first = false;
    }
    if (isSetRoamingEnabled()) {
      if (!first) sb.append(", ");
      sb.append("roamingEnabled:");
      sb.append(this.roamingEnabled);
      first = false;
    }
    if (isSetWifiStatus()) {
      if (!first) sb.append(", ");
      sb.append("wifiStatus:");
      if (this.wifiStatus == null) {
        sb.append("null");
      } else {
        sb.append(this.wifiStatus);
      }
      first = false;
    }
    if (isSetWifiSignalStrength()) {
      if (!first) sb.append(", ");
      sb.append("wifiSignalStrength:");
      sb.append(this.wifiSignalStrength);
      first = false;
    }
    if (isSetWifiLinkSpeed()) {
      if (!first) sb.append(", ");
      sb.append("wifiLinkSpeed:");
      sb.append(this.wifiLinkSpeed);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class NetworkDetailsStandardSchemeFactory implements SchemeFactory {
    public NetworkDetailsStandardScheme getScheme() {
      return new NetworkDetailsStandardScheme();
    }
  }

  private static class NetworkDetailsStandardScheme extends StandardScheme<NetworkDetails> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, NetworkDetails struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NETWORK_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.networkType = iprot.readString();
              struct.setNetworkTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MOBILE_NETWORK_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mobileNetworkType = iprot.readString();
              struct.setMobileNetworkTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MOBILE_DATA_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mobileDataStatus = iprot.readString();
              struct.setMobileDataStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MOBILE_DATA_ACTIVITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mobileDataActivity = iprot.readString();
              struct.setMobileDataActivityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ROAMING_ENABLED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.roamingEnabled = iprot.readBool();
              struct.setRoamingEnabledIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // WIFI_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.wifiStatus = iprot.readString();
              struct.setWifiStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // WIFI_SIGNAL_STRENGTH
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.wifiSignalStrength = iprot.readI32();
              struct.setWifiSignalStrengthIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // WIFI_LINK_SPEED
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.wifiLinkSpeed = iprot.readI32();
              struct.setWifiLinkSpeedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, NetworkDetails struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.networkType != null) {
        if (struct.isSetNetworkType()) {
          oprot.writeFieldBegin(NETWORK_TYPE_FIELD_DESC);
          oprot.writeString(struct.networkType);
          oprot.writeFieldEnd();
        }
      }
      if (struct.mobileNetworkType != null) {
        if (struct.isSetMobileNetworkType()) {
          oprot.writeFieldBegin(MOBILE_NETWORK_TYPE_FIELD_DESC);
          oprot.writeString(struct.mobileNetworkType);
          oprot.writeFieldEnd();
        }
      }
      if (struct.mobileDataStatus != null) {
        if (struct.isSetMobileDataStatus()) {
          oprot.writeFieldBegin(MOBILE_DATA_STATUS_FIELD_DESC);
          oprot.writeString(struct.mobileDataStatus);
          oprot.writeFieldEnd();
        }
      }
      if (struct.mobileDataActivity != null) {
        if (struct.isSetMobileDataActivity()) {
          oprot.writeFieldBegin(MOBILE_DATA_ACTIVITY_FIELD_DESC);
          oprot.writeString(struct.mobileDataActivity);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetRoamingEnabled()) {
        oprot.writeFieldBegin(ROAMING_ENABLED_FIELD_DESC);
        oprot.writeBool(struct.roamingEnabled);
        oprot.writeFieldEnd();
      }
      if (struct.wifiStatus != null) {
        if (struct.isSetWifiStatus()) {
          oprot.writeFieldBegin(WIFI_STATUS_FIELD_DESC);
          oprot.writeString(struct.wifiStatus);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetWifiSignalStrength()) {
        oprot.writeFieldBegin(WIFI_SIGNAL_STRENGTH_FIELD_DESC);
        oprot.writeI32(struct.wifiSignalStrength);
        oprot.writeFieldEnd();
      }
      if (struct.isSetWifiLinkSpeed()) {
        oprot.writeFieldBegin(WIFI_LINK_SPEED_FIELD_DESC);
        oprot.writeI32(struct.wifiLinkSpeed);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NetworkDetailsTupleSchemeFactory implements SchemeFactory {
    public NetworkDetailsTupleScheme getScheme() {
      return new NetworkDetailsTupleScheme();
    }
  }

  private static class NetworkDetailsTupleScheme extends TupleScheme<NetworkDetails> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, NetworkDetails struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNetworkType()) {
        optionals.set(0);
      }
      if (struct.isSetMobileNetworkType()) {
        optionals.set(1);
      }
      if (struct.isSetMobileDataStatus()) {
        optionals.set(2);
      }
      if (struct.isSetMobileDataActivity()) {
        optionals.set(3);
      }
      if (struct.isSetRoamingEnabled()) {
        optionals.set(4);
      }
      if (struct.isSetWifiStatus()) {
        optionals.set(5);
      }
      if (struct.isSetWifiSignalStrength()) {
        optionals.set(6);
      }
      if (struct.isSetWifiLinkSpeed()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetNetworkType()) {
        oprot.writeString(struct.networkType);
      }
      if (struct.isSetMobileNetworkType()) {
        oprot.writeString(struct.mobileNetworkType);
      }
      if (struct.isSetMobileDataStatus()) {
        oprot.writeString(struct.mobileDataStatus);
      }
      if (struct.isSetMobileDataActivity()) {
        oprot.writeString(struct.mobileDataActivity);
      }
      if (struct.isSetRoamingEnabled()) {
        oprot.writeBool(struct.roamingEnabled);
      }
      if (struct.isSetWifiStatus()) {
        oprot.writeString(struct.wifiStatus);
      }
      if (struct.isSetWifiSignalStrength()) {
        oprot.writeI32(struct.wifiSignalStrength);
      }
      if (struct.isSetWifiLinkSpeed()) {
        oprot.writeI32(struct.wifiLinkSpeed);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, NetworkDetails struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.networkType = iprot.readString();
        struct.setNetworkTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.mobileNetworkType = iprot.readString();
        struct.setMobileNetworkTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.mobileDataStatus = iprot.readString();
        struct.setMobileDataStatusIsSet(true);
      }
      if (incoming.get(3)) {
        struct.mobileDataActivity = iprot.readString();
        struct.setMobileDataActivityIsSet(true);
      }
      if (incoming.get(4)) {
        struct.roamingEnabled = iprot.readBool();
        struct.setRoamingEnabledIsSet(true);
      }
      if (incoming.get(5)) {
        struct.wifiStatus = iprot.readString();
        struct.setWifiStatusIsSet(true);
      }
      if (incoming.get(6)) {
        struct.wifiSignalStrength = iprot.readI32();
        struct.setWifiSignalStrengthIsSet(true);
      }
      if (incoming.get(7)) {
        struct.wifiLinkSpeed = iprot.readI32();
        struct.setWifiLinkSpeedIsSet(true);
      }
    }
  }

}

