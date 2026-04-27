package p000;

/* JADX INFO: loaded from: classes8.dex */
public abstract class gd3<T> extends wr0<T> {

    /* JADX INFO: renamed from: a */
    public final String f39383a;

    public gd3(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Description should be non null!");
        }
        this.f39383a = str;
    }

    @Override // p000.ixe
    public final void describeTo(i74 i74Var) {
        i74Var.appendText(this.f39383a);
    }
}
