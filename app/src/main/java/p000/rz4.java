package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class rz4 implements iz7 {

    /* JADX INFO: renamed from: a */
    public final boolean f80177a;

    public rz4(boolean z) {
        this.f80177a = z;
    }

    @Override // p000.iz7
    @gib
    public meb getList() {
        return null;
    }

    @Override // p000.iz7
    public boolean isActive() {
        return this.f80177a;
    }

    @yfb
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
