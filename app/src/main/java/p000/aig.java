package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class aig<T> implements fx8<T>, Serializable {

    /* JADX INFO: renamed from: a */
    @gib
    public ny6<? extends T> f1677a;

    /* JADX INFO: renamed from: b */
    @gib
    public volatile Object f1678b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Object f1679c;

    public aig(@yfb ny6<? extends T> ny6Var, @gib Object obj) {
        md8.checkNotNullParameter(ny6Var, "initializer");
        this.f1677a = ny6Var;
        this.f1678b = zph.f105713a;
        this.f1679c = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new u18(getValue());
    }

    @Override // p000.fx8
    public T getValue() {
        T tInvoke;
        T t = (T) this.f1678b;
        zph zphVar = zph.f105713a;
        if (t != zphVar) {
            return t;
        }
        synchronized (this.f1679c) {
            tInvoke = (T) this.f1678b;
            if (tInvoke == zphVar) {
                ny6<? extends T> ny6Var = this.f1677a;
                md8.checkNotNull(ny6Var);
                tInvoke = ny6Var.invoke();
                this.f1678b = tInvoke;
                this.f1677a = null;
            }
        }
        return tInvoke;
    }

    @Override // p000.fx8
    public boolean isInitialized() {
        return this.f1678b != zph.f105713a;
    }

    @yfb
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ aig(ny6 ny6Var, Object obj, int i, jt3 jt3Var) {
        this(ny6Var, (i & 2) != 0 ? null : obj);
    }
}
