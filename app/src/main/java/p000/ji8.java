package p000;

import java.nio.Buffer;

/* JADX INFO: loaded from: classes5.dex */
@xx4
@jd7
public final class ji8 {
    private ji8() {
    }

    /* JADX INFO: renamed from: a */
    public static void m14104a(Buffer b) {
        b.clear();
    }

    /* JADX INFO: renamed from: b */
    public static void m14105b(Buffer b) {
        b.flip();
    }

    /* JADX INFO: renamed from: c */
    public static void m14106c(Buffer b, int limit) {
        b.limit(limit);
    }

    /* JADX INFO: renamed from: d */
    public static void m14107d(Buffer b, int position) {
        b.position(position);
    }
}
