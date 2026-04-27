package p000;

import p000.fr5;

/* JADX INFO: loaded from: classes5.dex */
public class az7 extends fr5 {
    public az7(wr5 wr5Var, b2i b2iVar) {
        super(wr5Var, fr5.EnumC5939b.IN, b2iVar);
        r80.hardAssert(s2i.isArray(b2iVar), "InFilter expects an ArrayValue", new Object[0]);
    }

    @Override // p000.fr5, p000.su5
    public boolean matches(ph4 ph4Var) {
        b2i field = ph4Var.getField(getField());
        return field != null && s2i.contains(getValue().getArrayValue(), field);
    }
}
