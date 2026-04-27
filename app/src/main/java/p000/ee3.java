package p000;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ee3<T> extends lmh<T> {

    /* JADX INFO: renamed from: c */
    public final String f32731c;

    public ee3(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Description must be non null!");
        }
        this.f32731c = str;
    }

    @Override // p000.ixe
    public final void describeTo(i74 i74Var) {
        i74Var.appendText(this.f32731c);
    }
}
