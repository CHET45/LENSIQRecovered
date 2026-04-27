package p000;

import p000.u0h;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.3")
public final class vya implements u0h.InterfaceC13315c {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final vya f92664b = new vya();

    /* JADX INFO: renamed from: c */
    public static final long f92665c = System.nanoTime();

    private vya() {
    }

    private final long read() {
        return System.nanoTime() - f92665c;
    }

    /* JADX INFO: renamed from: adjustReading-6QKq23U, reason: not valid java name */
    public final long m32821adjustReading6QKq23U(long j, long j2) {
        return u0h.C13314b.a.m32507constructorimpl(vl9.m32774saturatingAddNuflL3o(j, lt4.f58681b, j2));
    }

    /* JADX INFO: renamed from: differenceBetween-fRLX17w, reason: not valid java name */
    public final long m32822differenceBetweenfRLX17w(long j, long j2) {
        return vl9.saturatingOriginsDiff(j, j2, lt4.f58681b);
    }

    /* JADX INFO: renamed from: elapsedFrom-6eNON_k, reason: not valid java name */
    public final long m32823elapsedFrom6eNON_k(long j) {
        return vl9.saturatingDiff(read(), j, lt4.f58681b);
    }

    @Override // p000.u0h.InterfaceC13315c, p000.u0h
    public /* bridge */ /* synthetic */ wc2 markNow() {
        return u0h.C13314b.a.m32504boximpl(m32824markNowz9LOYto());
    }

    /* JADX INFO: renamed from: markNow-z9LOYto, reason: not valid java name */
    public long m32824markNowz9LOYto() {
        return u0h.C13314b.a.m32507constructorimpl(read());
    }

    @yfb
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    @Override // p000.u0h
    public /* bridge */ /* synthetic */ e0h markNow() {
        return u0h.C13314b.a.m32504boximpl(m32824markNowz9LOYto());
    }
}
