package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class rg4 implements tp1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final yf4 f78198a;

    public rg4(@yfb yf4 yf4Var) {
        this.f78198a = yf4Var;
    }

    @Override // p000.tp1
    public void invoke(@gib Throwable th) {
        this.f78198a.dispose();
    }

    @yfb
    public String toString() {
        return "DisposeOnCancel[" + this.f78198a + C4584d2.f28243l;
    }
}
