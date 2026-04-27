package p000;

import java.nio.Buffer;

/* JADX INFO: loaded from: classes3.dex */
public final class mi8 {
    private mi8() {
    }

    /* JADX INFO: renamed from: a */
    public static void m17323a(Buffer b) {
        b.clear();
    }

    /* JADX INFO: renamed from: b */
    public static void m17324b(Buffer b) {
        b.flip();
    }

    /* JADX INFO: renamed from: c */
    public static void m17325c(Buffer b, int limit) {
        b.limit(limit);
    }

    /* JADX INFO: renamed from: d */
    public static void m17326d(Buffer b) {
        b.mark();
    }

    /* JADX INFO: renamed from: e */
    public static void m17327e(Buffer b, int position) {
        b.position(position);
    }

    /* JADX INFO: renamed from: f */
    public static void m17328f(Buffer b) {
        b.reset();
    }
}
