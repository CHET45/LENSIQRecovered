package p000;

import p000.o1b;

/* JADX INFO: loaded from: classes3.dex */
public final class ut2 extends st2 implements nue {

    /* JADX INFO: renamed from: k */
    public final long f89057k;

    /* JADX INFO: renamed from: l */
    public final int f89058l;

    /* JADX INFO: renamed from: m */
    public final int f89059m;

    /* JADX INFO: renamed from: n */
    public final boolean f89060n;

    /* JADX INFO: renamed from: o */
    public final long f89061o;

    public ut2(long j, long j2, o1b.C10138a c10138a, boolean z) {
        this(j, j2, c10138a.f66226f, c10138a.f66223c, z);
    }

    public ut2 copyWithNewDataEndPosition(long j) {
        return new ut2(j, this.f89057k, this.f89058l, this.f89059m, this.f89060n);
    }

    @Override // p000.nue
    public int getAverageBitrate() {
        return this.f89058l;
    }

    @Override // p000.nue
    public long getDataEndPosition() {
        return this.f89061o;
    }

    @Override // p000.nue
    public long getDataStartPosition() {
        return this.f89057k;
    }

    @Override // p000.nue
    public long getTimeUs(long j) {
        return getTimeUsAtPosition(j);
    }

    public ut2(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, z);
        this.f89057k = j2;
        this.f89058l = i;
        this.f89059m = i2;
        this.f89060n = z;
        this.f89061o = j == -1 ? -1L : j;
    }
}
