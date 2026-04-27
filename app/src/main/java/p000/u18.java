package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class u18<T> implements fx8<T>, Serializable {

    /* JADX INFO: renamed from: a */
    public final T f86549a;

    public u18(T t) {
        this.f86549a = t;
    }

    @Override // p000.fx8
    public T getValue() {
        return this.f86549a;
    }

    @Override // p000.fx8
    public boolean isInitialized() {
        return true;
    }

    @yfb
    public String toString() {
        return String.valueOf(getValue());
    }
}
