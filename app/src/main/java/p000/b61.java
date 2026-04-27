package p000;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b61 extends deb {
    @Override // p000.deb
    /* JADX INFO: renamed from: a */
    public void mo2946a(deb debVar) {
        if (!(debVar instanceof b61)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        super.mo2946a(debVar);
    }

    @Override // p000.deb
    public b61 getParent() {
        return (b61) super.getParent();
    }
}
