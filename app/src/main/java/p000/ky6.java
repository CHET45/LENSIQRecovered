package p000;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.7")
public class ky6 extends m07 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Class f55631a;

    public ky6(Class cls) {
        super(1);
        this.f55631a = cls;
    }

    @Override // p000.m07
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ky6) {
            return this.f55631a.equals(((ky6) obj).f55631a);
        }
        return false;
    }

    @Override // p000.m07
    public int hashCode() {
        return this.f55631a.hashCode();
    }

    @Override // p000.m07
    public String toString() {
        return "fun interface " + this.f55631a.getName();
    }

    @Override // p000.m07, p000.xn1
    public to8 getReflected() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }
}
