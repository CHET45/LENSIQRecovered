package p000;

import p000.fr5;

/* JADX INFO: loaded from: classes5.dex */
public class xfb extends fr5 {
    public xfb(wr5 wr5Var, b2i b2iVar) {
        super(wr5Var, fr5.EnumC5939b.NOT_IN, b2iVar);
        r80.hardAssert(s2i.isArray(b2iVar), "NotInFilter expects an ArrayValue", new Object[0]);
    }

    @Override // p000.fr5, p000.su5
    public boolean matches(ph4 ph4Var) {
        b2i field;
        return (s2i.contains(getValue().getArrayValue(), s2i.f80459c) || (field = ph4Var.getField(getField())) == null || field.hasNullValue() || s2i.contains(getValue().getArrayValue(), field)) ? false : true;
    }
}
