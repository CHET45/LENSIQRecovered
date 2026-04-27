package p000;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public interface eq8 {

    /* JADX INFO: renamed from: a */
    public static final String f33837a = "UTF-8";

    /* JADX INFO: renamed from: b */
    public static final Charset f33838b = Charset.forName("UTF-8");

    boolean equals(Object obj);

    int hashCode();

    void updateDiskCacheKey(@efb MessageDigest messageDigest);
}
