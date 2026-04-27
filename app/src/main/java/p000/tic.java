package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class tic implements kdi {

    /* JADX INFO: renamed from: c */
    public static final int f85000c = 0;

    /* JADX INFO: renamed from: b */
    public final char f85001b;

    public tic() {
        this((char) 0, 1, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tic) && this.f85001b == ((tic) obj).f85001b;
    }

    @Override // p000.kdi
    @yfb
    public ieh filter(@yfb C9041lz c9041lz) {
        return new ieh(new C9041lz(h9g.repeat(String.valueOf(this.f85001b), c9041lz.getText().length()), null, null, 6, null), nzb.f66113a.getIdentity());
    }

    public final char getMask() {
        return this.f85001b;
    }

    public int hashCode() {
        return Character.hashCode(this.f85001b);
    }

    public tic(char c) {
        this.f85001b = c;
    }

    public /* synthetic */ tic(char c, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? (char) 8226 : c);
    }
}
