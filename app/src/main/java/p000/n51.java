package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class n51 implements Serializable {

    /* JADX INFO: renamed from: C */
    public int f63315C;

    /* JADX INFO: renamed from: F */
    public String f63316F;

    /* JADX INFO: renamed from: H */
    public boolean f63317H;

    /* JADX INFO: renamed from: L */
    public int f63318L;

    /* JADX INFO: renamed from: M */
    public int f63319M;

    /* JADX INFO: renamed from: N */
    public int f63320N;

    /* JADX INFO: renamed from: a */
    public byte[] f63321a;

    /* JADX INFO: renamed from: b */
    public int f63322b;

    /* JADX INFO: renamed from: c */
    public boolean f63323c = true;

    /* JADX INFO: renamed from: d */
    public int f63324d;

    /* JADX INFO: renamed from: e */
    public int f63325e;

    /* JADX INFO: renamed from: f */
    public int f63326f;

    /* JADX INFO: renamed from: m */
    public String f63327m;

    public int getBattery() {
        return this.f63320N;
    }

    public int getDeviceType() {
        return this.f63318L;
    }

    public int getDeviceVersion() {
        return this.f63319M;
    }

    public String getIdentify() {
        return this.f63327m;
    }

    public String getOldBleAddress() {
        return this.f63316F;
    }

    public int getPid() {
        return this.f63326f;
    }

    public byte[] getRawData() {
        return this.f63321a;
    }

    public int getRssi() {
        return this.f63322b;
    }

    public int getUid() {
        return this.f63325e;
    }

    public int getVersion() {
        return this.f63315C;
    }

    public int getVid() {
        return this.f63324d;
    }

    public boolean isEnableConnect() {
        return this.f63323c;
    }

    public boolean isOTA() {
        return this.f63317H;
    }

    public n51 setBattery(int i) {
        this.f63320N = i;
        return this;
    }

    public n51 setDeviceType(int i) {
        this.f63318L = i;
        return this;
    }

    public n51 setDeviceVersion(int i) {
        this.f63319M = i;
        return this;
    }

    public n51 setEnableConnect(boolean z) {
        this.f63323c = z;
        return this;
    }

    public n51 setIdentify(String str) {
        this.f63327m = str;
        return this;
    }

    public n51 setOTA(boolean z) {
        this.f63317H = z;
        return this;
    }

    public n51 setOldBleAddress(String str) {
        this.f63316F = str;
        return this;
    }

    public n51 setPid(int i) {
        this.f63326f = i;
        return this;
    }

    public n51 setRawData(byte[] bArr) {
        this.f63321a = bArr;
        return this;
    }

    public n51 setRssi(int i) {
        this.f63322b = i;
        return this;
    }

    public n51 setUid(int i) {
        this.f63325e = i;
        return this;
    }

    public n51 setVersion(int i) {
        this.f63315C = i;
        return this;
    }

    public n51 setVid(int i) {
        this.f63324d = i;
        return this;
    }

    public String toString() {
        return "BleScanMessage{rawData=" + pk1.byte2HexStr(this.f63321a) + ", rssi=" + this.f63322b + ", isEnableConnect=" + this.f63323c + ", vid=" + this.f63324d + ", uid=" + this.f63325e + ", pid=" + this.f63326f + ", identify='" + this.f63327m + "', version=" + this.f63315C + ", oldBleAddress='" + this.f63316F + "', isOTA=" + this.f63317H + ", deviceType=" + this.f63318L + ", deviceVersion=" + this.f63319M + ", battery=" + this.f63320N + '}';
    }
}
