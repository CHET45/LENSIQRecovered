package p000;

import java.nio.Buffer;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@by4
public final class ii8 {
    private ii8() {
    }

    /* JADX INFO: renamed from: a */
    public static void m13118a(Buffer b) {
        b.clear();
    }

    /* JADX INFO: renamed from: b */
    public static void m13119b(Buffer b) {
        b.flip();
    }

    /* JADX INFO: renamed from: c */
    public static void m13120c(Buffer b, int limit) {
        b.limit(limit);
    }

    /* JADX INFO: renamed from: d */
    public static void m13121d(Buffer b, int position) {
        b.position(position);
    }
}
