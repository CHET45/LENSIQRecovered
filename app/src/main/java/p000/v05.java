package p000;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public final class v05 implements eq8 {

    /* JADX INFO: renamed from: c */
    public static final v05 f89606c = new v05();

    private v05() {
    }

    @efb
    public static v05 obtain() {
        return f89606c;
    }

    public String toString() {
        return "EmptySignature";
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
    }
}
