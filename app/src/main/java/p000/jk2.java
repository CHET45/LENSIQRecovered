package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class jk2 {

    /* JADX INFO: renamed from: e */
    public static final int f50990e = 0;

    /* JADX INFO: renamed from: a */
    public final boolean f50991a;

    /* JADX INFO: renamed from: b */
    public final int f50992b;

    /* JADX INFO: renamed from: c */
    public final int f50993c;

    /* JADX INFO: renamed from: d */
    public final int f50994d;

    public jk2(boolean z, int i, int i2, int i3) {
        this.f50991a = z;
        this.f50992b = i;
        this.f50993c = i2;
        this.f50994d = i3;
    }

    public static /* synthetic */ jk2 copy$default(jk2 jk2Var, boolean z, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = jk2Var.f50991a;
        }
        if ((i4 & 2) != 0) {
            i = jk2Var.f50992b;
        }
        if ((i4 & 4) != 0) {
            i2 = jk2Var.f50993c;
        }
        if ((i4 & 8) != 0) {
            i3 = jk2Var.f50994d;
        }
        return jk2Var.copy(z, i, i2, i3);
    }

    public final boolean component1() {
        return this.f50991a;
    }

    public final int component2() {
        return this.f50992b;
    }

    public final int component3() {
        return this.f50993c;
    }

    public final int component4() {
        return this.f50994d;
    }

    @yfb
    public final jk2 copy(boolean z, int i, int i2, int i3) {
        return new jk2(z, i, i2, i3);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk2)) {
            return false;
        }
        jk2 jk2Var = (jk2) obj;
        return this.f50991a == jk2Var.f50991a && this.f50992b == jk2Var.f50992b && this.f50993c == jk2Var.f50993c && this.f50994d == jk2Var.f50994d;
    }

    public final int getChangedParams() {
        return this.f50993c;
    }

    public final int getDefaultParams() {
        return this.f50994d;
    }

    public final int getRealParamsCount() {
        return this.f50992b;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f50991a) * 31) + Integer.hashCode(this.f50992b)) * 31) + Integer.hashCode(this.f50993c)) * 31) + Integer.hashCode(this.f50994d);
    }

    public final boolean isComposable() {
        return this.f50991a;
    }

    @yfb
    public String toString() {
        return "ComposableInfo(isComposable=" + this.f50991a + ", realParamsCount=" + this.f50992b + ", changedParams=" + this.f50993c + ", defaultParams=" + this.f50994d + ')';
    }
}
