package p000;

import java.nio.Buffer;

/* JADX INFO: loaded from: classes5.dex */
@zx4
@jd7
@yg8
public final class ki8 {
    private ki8() {
    }

    /* JADX INFO: renamed from: a */
    public static void m14757a(Buffer b) {
        b.clear();
    }

    /* JADX INFO: renamed from: b */
    public static void m14758b(Buffer b) {
        b.flip();
    }

    /* JADX INFO: renamed from: c */
    public static void m14759c(Buffer b, int limit) {
        b.limit(limit);
    }

    /* JADX INFO: renamed from: d */
    public static void m14760d(Buffer b) {
        b.mark();
    }

    /* JADX INFO: renamed from: e */
    public static void m14761e(Buffer b, int position) {
        b.position(position);
    }

    /* JADX INFO: renamed from: f */
    public static void m14762f(Buffer b) {
        b.reset();
    }
}
