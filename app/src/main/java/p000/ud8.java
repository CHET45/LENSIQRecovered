package p000;

/* JADX INFO: loaded from: classes8.dex */
public class ud8 extends Exception {
    private static final long serialVersionUID = 3731842424390998726L;

    /* JADX INFO: renamed from: a */
    public final int f87651a;

    public ud8(int i) {
        this.f87651a = i;
    }

    public int getCloseCode() {
        return this.f87651a;
    }

    public ud8(int i, String str) {
        super(str);
        this.f87651a = i;
    }

    public ud8(int i, Throwable th) {
        super(th);
        this.f87651a = i;
    }

    public ud8(int i, String str, Throwable th) {
        super(str, th);
        this.f87651a = i;
    }
}
