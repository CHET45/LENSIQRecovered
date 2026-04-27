package p000;

import p000.fr5;

/* JADX INFO: loaded from: classes5.dex */
public class pq8 extends fr5 {

    /* JADX INFO: renamed from: d */
    public final ci4 f71641d;

    public pq8(wr5 wr5Var, fr5.EnumC5939b enumC5939b, b2i b2iVar) {
        super(wr5Var, enumC5939b, b2iVar);
        r80.hardAssert(s2i.isReferenceValue(b2iVar), "KeyFieldFilter expects a ReferenceValue", new Object[0]);
        this.f71641d = ci4.fromName(getValue().getReferenceValue());
    }

    @Override // p000.fr5, p000.su5
    public boolean matches(ph4 ph4Var) {
        return m11112a(ph4Var.getKey().compareTo(this.f71641d));
    }
}
