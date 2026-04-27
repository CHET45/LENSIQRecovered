package p000;

import com.blankj.utilcode.util.C2473f;

/* JADX INFO: loaded from: classes6.dex */
public class ow1 {

    /* JADX INFO: renamed from: a */
    public final int f68989a;

    /* JADX INFO: renamed from: b */
    public final int f68990b;

    /* JADX INFO: renamed from: c */
    public final int f68991c;

    /* JADX INFO: renamed from: d */
    public final int f68992d;

    /* JADX INFO: renamed from: e */
    public final int f68993e;

    /* JADX INFO: renamed from: f */
    public final int f68994f;

    /* JADX INFO: renamed from: g */
    public final int f68995g;

    /* JADX INFO: renamed from: h */
    public final int[] f68996h = getPossibleProperties();

    public ow1(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f68989a = i;
        this.f68990b = i2;
        this.f68991c = i3;
        this.f68992d = i4;
        this.f68993e = i5;
        this.f68994f = i6;
        this.f68995g = i7;
    }

    @efb
    private int[] getPossibleProperties() {
        return new int[]{this.f68989a, this.f68990b, this.f68991c, this.f68992d, this.f68993e, this.f68994f, this.f68995g};
    }

    private static boolean propertiesIntContains(int i, int i2) {
        return (i & i2) != 0;
    }

    @efb
    private String propertyToString(int i) {
        if (i == this.f68990b) {
            return pe4.f70513d2;
        }
        if (i == this.f68992d) {
            return "WRITE";
        }
        if (i == this.f68991c) {
            return "WRITE_NO_RESPONSE";
        }
        if (i == this.f68995g) {
            return "SIGNED_WRITE";
        }
        if (i == this.f68994f) {
            return "INDICATE";
        }
        if (i == this.f68989a) {
            return "BROADCAST";
        }
        if (i == this.f68993e) {
            return "NOTIFY";
        }
        if (i == 0) {
            return "";
        }
        kfe.m14724e("Unknown property specified (%d)", Integer.valueOf(i));
        return "UNKNOWN (" + i + " -> check android.bluetooth.BluetoothGattCharacteristic)";
    }

    @efb
    public String propertiesIntToString(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i2 : this.f68996h) {
            if (propertiesIntContains(i, i2)) {
                sb.append(propertyToString(i2));
                sb.append(C2473f.f17566z);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
