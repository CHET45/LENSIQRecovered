package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class xo9<V> {

    /* JADX INFO: renamed from: a */
    @hib
    public final V f98794a;

    /* JADX INFO: renamed from: b */
    @hib
    public final Throwable f98795b;

    public xo9(V v) {
        this.f98794a = v;
        this.f98795b = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo9)) {
            return false;
        }
        xo9 xo9Var = (xo9) obj;
        if (getValue() != null && getValue().equals(xo9Var.getValue())) {
            return true;
        }
        if (getException() == null || xo9Var.getException() == null) {
            return false;
        }
        return getException().toString().equals(getException().toString());
    }

    @hib
    public Throwable getException() {
        return this.f98795b;
    }

    @hib
    public V getValue() {
        return this.f98794a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getValue(), getException()});
    }

    public xo9(Throwable th) {
        this.f98795b = th;
        this.f98794a = null;
    }
}
