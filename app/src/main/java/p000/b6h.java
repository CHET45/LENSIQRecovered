package p000;

import p000.q6h;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class b6h {

    /* JADX INFO: renamed from: f */
    public static final String f12817f = "TrackEncryptionBox";

    /* JADX INFO: renamed from: a */
    public final boolean f12818a;

    /* JADX INFO: renamed from: b */
    @hib
    public final String f12819b;

    /* JADX INFO: renamed from: c */
    public final q6h.C11325a f12820c;

    /* JADX INFO: renamed from: d */
    public final int f12821d;

    /* JADX INFO: renamed from: e */
    @hib
    public final byte[] f12822e;

    public b6h(boolean z, @hib String str, int i, byte[] bArr, int i2, int i3, @hib byte[] bArr2) {
        v80.checkArgument((bArr2 == null) ^ (i == 0));
        this.f12818a = z;
        this.f12819b = str;
        this.f12821d = i;
        this.f12822e = bArr2;
        this.f12820c = new q6h.C11325a(schemeToCryptoMode(str), bArr, i2, i3);
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
                xh9.m25148w("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
