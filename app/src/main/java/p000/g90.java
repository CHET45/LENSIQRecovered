package p000;

/* JADX INFO: loaded from: classes8.dex */
public class g90 extends RuntimeException implements ixe {
    private static final long serialVersionUID = 2;

    /* JADX INFO: renamed from: a */
    public final String f39023a;

    /* JADX INFO: renamed from: b */
    public final boolean f39024b;

    /* JADX INFO: renamed from: c */
    public final Object f39025c;

    /* JADX INFO: renamed from: d */
    public final yv9<?> f39026d;

    @Deprecated
    public g90(String str, boolean z, Object obj, yv9<?> yv9Var) {
        this.f39023a = str;
        this.f39025c = obj;
        this.f39026d = yv9Var;
        this.f39024b = z;
        if (obj instanceof Throwable) {
            initCause((Throwable) obj);
        }
    }

    @Override // p000.ixe
    public void describeTo(i74 i74Var) {
        String str = this.f39023a;
        if (str != null) {
            i74Var.appendText(str);
        }
        if (this.f39024b) {
            if (this.f39023a != null) {
                i74Var.appendText(": ");
            }
            i74Var.appendText("got: ");
            i74Var.appendValue(this.f39025c);
            if (this.f39026d != null) {
                i74Var.appendText(", expected: ");
                i74Var.appendDescriptionOf(this.f39026d);
            }
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return p7g.asString(this);
    }

    @Deprecated
    public g90(Object obj, yv9<?> yv9Var) {
        this(null, true, obj, yv9Var);
    }

    @Deprecated
    public g90(String str, Object obj, yv9<?> yv9Var) {
        this(str, true, obj, yv9Var);
    }

    @Deprecated
    public g90(String str) {
        this(str, false, null, null);
    }

    @Deprecated
    public g90(String str, Throwable th) {
        this(str, false, null, null);
        initCause(th);
    }
}
