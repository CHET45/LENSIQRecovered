package p000;

/* JADX INFO: loaded from: classes8.dex */
public abstract class lmh<T> extends wr0<T> {

    /* JADX INFO: renamed from: b */
    public static final awd f58276b = new awd("matchesSafely", 1, 0);

    /* JADX INFO: renamed from: a */
    public final Class<?> f58277a;

    public lmh() {
        this(f58276b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.wr0, p000.yv9
    public final void describeMismatch(Object obj, i74 i74Var) {
        if (obj == 0) {
            super.describeMismatch(obj, i74Var);
        } else if (this.f58277a.isInstance(obj)) {
            describeMismatchSafely(obj, i74Var);
        } else {
            i74Var.appendText("was a ").appendText(obj.getClass().getName()).appendText(" (").appendValue(obj).appendText(c0b.f15434d);
        }
    }

    public void describeMismatchSafely(T t, i74 i74Var) {
        super.describeMismatch(t, i74Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.yv9
    public final boolean matches(Object obj) {
        return obj != 0 && this.f58277a.isInstance(obj) && matchesSafely(obj);
    }

    public abstract boolean matchesSafely(T t);

    public lmh(Class<?> cls) {
        this.f58277a = cls;
    }

    public lmh(awd awdVar) {
        this.f58277a = awdVar.findExpectedType(getClass());
    }
}
