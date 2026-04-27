package p000;

/* JADX INFO: loaded from: classes.dex */
public final class vxd extends kwf {

    /* JADX INFO: renamed from: a */
    @yfb
    public final kwf f92570a;

    /* JADX INFO: renamed from: b */
    public final int f92571b;

    public vxd(@yfb kwf kwfVar, int i) {
        super(null);
        this.f92570a = kwfVar;
        this.f92571b = i;
    }

    @Override // p000.kwf
    @yfb
    public Object getIdentity(@yfb mrf mrfVar) {
        return new mwf(this.f92570a.getIdentity(mrfVar), this.f92571b);
    }

    public final int getIndex() {
        return this.f92571b;
    }

    @yfb
    public final kwf getParent() {
        return this.f92570a;
    }
}
