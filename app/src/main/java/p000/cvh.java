package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class cvh<T> implements fx8<T>, Serializable {

    /* JADX INFO: renamed from: a */
    @gib
    public ny6<? extends T> f27902a;

    /* JADX INFO: renamed from: b */
    @gib
    public Object f27903b;

    public cvh(@yfb ny6<? extends T> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "initializer");
        this.f27902a = ny6Var;
        this.f27903b = zph.f105713a;
    }

    private final Object writeReplace() {
        return new u18(getValue());
    }

    @Override // p000.fx8
    public T getValue() {
        if (this.f27903b == zph.f105713a) {
            ny6<? extends T> ny6Var = this.f27902a;
            md8.checkNotNull(ny6Var);
            this.f27903b = ny6Var.invoke();
            this.f27902a = null;
        }
        return (T) this.f27903b;
    }

    @Override // p000.fx8
    public boolean isInitialized() {
        return this.f27903b != zph.f105713a;
    }

    @yfb
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
