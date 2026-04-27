package p000;

import p000.i74;

/* JADX INFO: loaded from: classes8.dex */
public abstract class jmh<T> extends wr0<T> {

    /* JADX INFO: renamed from: b */
    public static final awd f51270b = new awd("matchesSafely", 2, 0);

    /* JADX INFO: renamed from: a */
    public final Class<?> f51271a;

    public jmh(Class<?> cls) {
        this.f51271a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.wr0, p000.yv9
    public final void describeMismatch(Object obj, i74 i74Var) {
        if (obj == 0 || !this.f51271a.isInstance(obj)) {
            super.describeMismatch(obj, i74Var);
        } else {
            matchesSafely(obj, i74Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.yv9
    public final boolean matches(Object obj) {
        return obj != 0 && this.f51271a.isInstance(obj) && matchesSafely(obj, new i74.C7170a());
    }

    public abstract boolean matchesSafely(T t, i74 i74Var);

    public jmh(awd awdVar) {
        this.f51271a = awdVar.findExpectedType(getClass());
    }

    public jmh() {
        this(f51270b);
    }
}
