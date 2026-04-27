package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class oyg {

    /* JADX INFO: renamed from: a */
    @un8
    @yfb
    public final e13 f69234a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Object[] f69235b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final nxg<Object>[] f69236c;

    /* JADX INFO: renamed from: d */
    public int f69237d;

    public oyg(@yfb e13 e13Var, int i) {
        this.f69234a = e13Var;
        this.f69235b = new Object[i];
        this.f69236c = new nxg[i];
    }

    public final void append(@yfb nxg<?> nxgVar, @gib Object obj) {
        Object[] objArr = this.f69235b;
        int i = this.f69237d;
        objArr[i] = obj;
        nxg<Object>[] nxgVarArr = this.f69236c;
        this.f69237d = i + 1;
        md8.checkNotNull(nxgVar, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        nxgVarArr[i] = nxgVar;
    }

    public final void restore(@yfb e13 e13Var) {
        int length = this.f69236c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            nxg<Object> nxgVar = this.f69236c[length];
            md8.checkNotNull(nxgVar);
            nxgVar.restoreThreadContext(e13Var, this.f69235b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
