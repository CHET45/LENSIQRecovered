package p000;

/* JADX INFO: renamed from: jo */
/* JADX INFO: loaded from: classes.dex */
public final class C7988jo extends kwf {

    /* JADX INFO: renamed from: a */
    public final int f51317a;

    public C7988jo(int i) {
        super(null);
        this.f51317a = i;
    }

    public final int getGroup() {
        return this.f51317a;
    }

    @Override // p000.kwf
    @yfb
    public Object getIdentity(@yfb mrf mrfVar) {
        return mrfVar.anchor(this.f51317a);
    }
}
