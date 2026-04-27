package p000;

import p000.n8c;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class b37 implements m8f {

    /* JADX INFO: renamed from: b */
    public static final int f12524b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final kz6<vic, wpf, ov8, bth> f12525a;

    /* JADX WARN: Multi-variable type inference failed */
    public b37(@yfb kz6<? super vic, ? super wpf, ? super ov8, bth> kz6Var) {
        this.f12525a = kz6Var;
    }

    @Override // p000.m8f
    @yfb
    /* JADX INFO: renamed from: createOutline-Pq9zytI, reason: not valid java name */
    public n8c mo27947createOutlinePq9zytI(long j, @yfb ov8 ov8Var, @yfb c64 c64Var) {
        vic vicVarPath = C8522ku.Path();
        this.f12525a.invoke(vicVarPath, wpf.m33057boximpl(j), ov8Var);
        vicVarPath.close();
        return new n8c.C9741a(vicVarPath);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        b37 b37Var = obj instanceof b37 ? (b37) obj : null;
        return (b37Var != null ? b37Var.f12525a : null) == this.f12525a;
    }

    public int hashCode() {
        return this.f12525a.hashCode();
    }
}
