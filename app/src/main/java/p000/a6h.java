package p000;

import p000.r6h;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a6h {

    /* JADX INFO: renamed from: f */
    public static final String f513f = "TrackEncryptionBox";

    /* JADX INFO: renamed from: a */
    public final boolean f514a;

    /* JADX INFO: renamed from: b */
    @hib
    public final String f515b;

    /* JADX INFO: renamed from: c */
    public final r6h.C11906a f516c;

    /* JADX INFO: renamed from: d */
    public final int f517d;

    /* JADX INFO: renamed from: e */
    @hib
    public final byte[] f518e;

    public a6h(boolean z, @hib String str, int i, byte[] bArr, int i2, int i3, @hib byte[] bArr2) {
        u80.checkArgument((bArr2 == null) ^ (i == 0));
        this.f514a = z;
        this.f515b = str;
        this.f517d = i;
        this.f518e = bArr2;
        this.f516c = new r6h.C11906a(schemeToCryptoMode(str), bArr, i2, i3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int schemeToCryptoMode(@hib String str) {
        if (str == null) {
            return 1;
        }
        byte b = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b = 3;
                }
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return 2;
            default:
                yh9.m25919w("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
