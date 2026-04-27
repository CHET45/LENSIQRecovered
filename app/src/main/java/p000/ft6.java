package p000;

import p000.gue;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class ft6 implements gue {

    /* JADX INFO: renamed from: d */
    public final gue f37668d;

    public ft6(gue gueVar) {
        this.f37668d = gueVar;
    }

    @Override // p000.gue
    public long getDurationUs() {
        return this.f37668d.getDurationUs();
    }

    @Override // p000.gue
    public gue.C6548a getSeekPoints(long j) {
        return this.f37668d.getSeekPoints(j);
    }

    @Override // p000.gue
    public boolean isSeekable() {
        return this.f37668d.isSeekable();
    }
}
