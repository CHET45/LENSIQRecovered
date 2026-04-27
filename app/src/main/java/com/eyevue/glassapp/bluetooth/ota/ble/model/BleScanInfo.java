package com.eyevue.glassapp.bluetooth.ota.ble.model;

import android.os.Parcel;
import android.os.Parcelable;
import p000.pk1;

/* JADX INFO: loaded from: classes4.dex */
public class BleScanInfo implements Parcelable {
    public static final Parcelable.Creator<BleScanInfo> CREATOR = new Parcelable.Creator<BleScanInfo>() { // from class: com.eyevue.glassapp.bluetooth.ota.ble.model.BleScanInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BleScanInfo createFromParcel(Parcel in) {
            return new BleScanInfo(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BleScanInfo[] newArray(int size) {
            return new BleScanInfo[size];
        }
    };
    private boolean isEnableConnect;
    private byte[] rawData;
    private int rssi;

    public BleScanInfo() {
        this.isEnableConnect = true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getRawData() {
        return this.rawData;
    }

    public int getRssi() {
        return this.rssi;
    }

    public boolean isEnableConnect() {
        return this.isEnableConnect;
    }

    public BleScanInfo setEnableConnect(boolean enableConnect) {
        this.isEnableConnect = enableConnect;
        return this;
    }

    public BleScanInfo setRawData(byte[] rawData) {
        this.rawData = rawData;
        return this;
    }

    public BleScanInfo setRssi(int rssi) {
        this.rssi = rssi;
        return this;
    }

    public String toString() {
        return "BleScanMessage{rawData=" + pk1.byte2HexStr(this.rawData) + ", rssi=" + this.rssi + ", isEnableConnect=" + this.isEnableConnect + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.rawData);
        parcel.writeInt(this.rssi);
        parcel.writeByte(this.isEnableConnect ? (byte) 1 : (byte) 0);
    }

    public BleScanInfo(Parcel in) {
        this.isEnableConnect = true;
        this.rawData = in.createByteArray();
        this.rssi = in.readInt();
        this.isEnableConnect = in.readByte() != 0;
    }
}
