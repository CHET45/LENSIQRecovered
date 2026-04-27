package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class q7h {

    /* JADX INFO: renamed from: a */
    public final int f73446a;

    /* JADX INFO: renamed from: b */
    public final r1e[] f73447b;

    /* JADX INFO: renamed from: c */
    public final pf5[] f73448c;

    /* JADX INFO: renamed from: d */
    public final y7h f73449d;

    /* JADX INFO: renamed from: e */
    @hib
    public final Object f73450e;

    @Deprecated
    public q7h(r1e[] r1eVarArr, pf5[] pf5VarArr, @hib Object obj) {
        this(r1eVarArr, pf5VarArr, y7h.f100701b, obj);
    }

    public boolean isEquivalent(@hib q7h q7hVar) {
        if (q7hVar == null || q7hVar.f73448c.length != this.f73448c.length) {
            return false;
        }
        for (int i = 0; i < this.f73448c.length; i++) {
            if (!isEquivalent(q7hVar, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isRendererEnabled(int i) {
        return this.f73447b[i] != null;
    }

    public q7h(r1e[] r1eVarArr, pf5[] pf5VarArr, y7h y7hVar, @hib Object obj) {
        this.f73447b = r1eVarArr;
        this.f73448c = (pf5[]) pf5VarArr.clone();
        this.f73449d = y7hVar;
        this.f73450e = obj;
        this.f73446a = r1eVarArr.length;
    }

    public boolean isEquivalent(@hib q7h q7hVar, int i) {
        return q7hVar != null && x0i.areEqual(this.f73447b[i], q7hVar.f73447b[i]) && x0i.areEqual(this.f73448c[i], q7hVar.f73448c[i]);
    }
}
