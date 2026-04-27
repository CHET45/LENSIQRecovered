package p000;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class sv6 implements c93 {

    /* JADX INFO: renamed from: d */
    public static final boolean f82948d;

    /* JADX INFO: renamed from: a */
    public final UUID f82949a;

    /* JADX INFO: renamed from: b */
    public final byte[] f82950b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public final boolean f82951c;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    static {
        /*
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1c
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            p000.sv6.f82948d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.sv6.<clinit>():void");
    }

    public sv6(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    @Deprecated
    public sv6(UUID uuid, byte[] bArr, boolean z) {
        this.f82949a = uuid;
        this.f82950b = bArr;
        this.f82951c = z;
    }
}
