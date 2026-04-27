package p000;

import android.content.Context;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class hth<T> implements ceh<T> {

    /* JADX INFO: renamed from: c */
    public static final ceh<?> f44861c = new hth();

    private hth() {
    }

    @efb
    public static <T> hth<T> get() {
        return (hth) f44861c;
    }

    @Override // p000.ceh
    @efb
    public t5e<T> transform(@efb Context context, @efb t5e<T> t5eVar, int i, int i2) {
        return t5eVar;
    }

    @Override // p000.eq8
    public void updateDiskCacheKey(@efb MessageDigest messageDigest) {
    }
}
