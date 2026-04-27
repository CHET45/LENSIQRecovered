package p000;

import p000.p1b;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class tt2 extends rt2 implements oue {
    public tt2(long j, long j2, p1b.C10751a c10751a, boolean z) {
        super(j, j2, c10751a.f69425f, c10751a.f69422c, z);
    }

    @Override // p000.oue
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // p000.oue
    public long getTimeUs(long j) {
        return getTimeUsAtPosition(j);
    }
}
