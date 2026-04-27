package p000;

import java.util.Iterator;
import p000.fr5;

/* JADX INFO: loaded from: classes5.dex */
public class a60 extends fr5 {
    public a60(wr5 wr5Var, b2i b2iVar) {
        super(wr5Var, fr5.EnumC5939b.ARRAY_CONTAINS_ANY, b2iVar);
        r80.hardAssert(s2i.isArray(b2iVar), "ArrayContainsAnyFilter expects an ArrayValue", new Object[0]);
    }

    @Override // p000.fr5, p000.su5
    public boolean matches(ph4 ph4Var) {
        b2i field = ph4Var.getField(getField());
        if (!s2i.isArray(field)) {
            return false;
        }
        Iterator<b2i> it = field.getArrayValue().getValuesList().iterator();
        while (it.hasNext()) {
            if (s2i.contains(getValue().getArrayValue(), it.next())) {
                return true;
            }
        }
        return false;
    }
}
