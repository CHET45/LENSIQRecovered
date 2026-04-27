package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class r7h {

    /* JADX INFO: renamed from: a */
    public final int f77356a;

    /* JADX INFO: renamed from: b */
    public final s1e[] f77357b;

    /* JADX INFO: renamed from: c */
    public final of5[] f77358c;

    /* JADX INFO: renamed from: d */
    public final x7h f77359d;

    /* JADX INFO: renamed from: e */
    @hib
    public final Object f77360e;

    @Deprecated
    public r7h(s1e[] s1eVarArr, of5[] of5VarArr, @hib Object obj) {
        this(s1eVarArr, of5VarArr, x7h.f97105b, obj);
    }

    public boolean isEquivalent(@hib r7h r7hVar) {
        if (r7hVar == null || r7hVar.f77358c.length != this.f77358c.length) {
            return false;
        }
        for (int i = 0; i < this.f77358c.length; i++) {
            if (!isEquivalent(r7hVar, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isRendererEnabled(int i) {
        return this.f77357b[i] != null;
    }

    public r7h(s1e[] s1eVarArr, of5[] of5VarArr, x7h x7hVar, @hib Object obj) {
        v80.checkArgument(s1eVarArr.length == of5VarArr.length);
        this.f77357b = s1eVarArr;
        this.f77358c = (of5[]) of5VarArr.clone();
        this.f77359d = x7hVar;
        this.f77360e = obj;
        this.f77356a = s1eVarArr.length;
    }

    public boolean isEquivalent(@hib r7h r7hVar, int i) {
        return r7hVar != null && Objects.equals(this.f77357b[i], r7hVar.f77357b[i]) && Objects.equals(this.f77358c[i], r7hVar.f77358c[i]);
    }
}
