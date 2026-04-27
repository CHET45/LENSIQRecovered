package p000;

import java.nio.Buffer;

/* JADX INFO: loaded from: classes4.dex */
public final class li8 {
    private li8() {
    }

    /* JADX INFO: renamed from: a */
    public static void m16159a(Buffer b) {
        b.clear();
    }

    /* JADX INFO: renamed from: b */
    public static void m16160b(Buffer b) {
        b.flip();
    }

    /* JADX INFO: renamed from: c */
    public static void m16161c(Buffer b, int limit) {
        b.limit(limit);
    }

    /* JADX INFO: renamed from: d */
    public static void m16162d(Buffer b) {
        b.mark();
    }

    /* JADX INFO: renamed from: e */
    public static void m16163e(Buffer b, int position) {
        b.position(position);
    }

    /* JADX INFO: renamed from: f */
    public static void m16164f(Buffer b) {
        b.reset();
    }
}
