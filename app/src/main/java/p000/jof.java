package p000;

import p000.gue;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class jof implements gue {

    /* JADX INFO: renamed from: d */
    public final long f51379d;

    /* JADX INFO: renamed from: e */
    public final long f51380e;

    public jof(long j) {
        this(j, 0L);
    }

    @Override // p000.gue
    public long getDurationUs() {
        return this.f51379d;
    }

    @Override // p000.gue
    public gue.C6548a getSeekPoints(long j) {
        return new gue.C6548a(new lue(j, this.f51380e));
    }

    @Override // p000.gue
    public boolean isSeekable() {
        return true;
    }

    public jof(long j, long j2) {
        this.f51379d = j;
        this.f51380e = j2;
    }
}
