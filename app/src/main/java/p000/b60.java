package p000;

import p000.fr5;

/* JADX INFO: loaded from: classes5.dex */
public class b60 extends fr5 {
    public b60(wr5 wr5Var, b2i b2iVar) {
        super(wr5Var, fr5.EnumC5939b.ARRAY_CONTAINS, b2iVar);
    }

    @Override // p000.fr5, p000.su5
    public boolean matches(ph4 ph4Var) {
        b2i field = ph4Var.getField(getField());
        return s2i.isArray(field) && s2i.contains(field.getArrayValue(), getValue());
    }
}
