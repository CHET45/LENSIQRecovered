package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class u44 extends ejf {

    /* JADX INFO: renamed from: p */
    public final peg f86760p;

    public u44(String str, peg pegVar) {
        super(str);
        this.f86760p = pegVar;
    }

    @Override // p000.ejf
    /* JADX INFO: renamed from: m */
    public ydg mo10088m(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f86760p.reset();
        }
        return this.f86760p.parseToLegacySubtitle(bArr, 0, i);
    }
}
