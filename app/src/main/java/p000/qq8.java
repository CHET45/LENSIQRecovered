package p000;

import java.util.ArrayList;
import java.util.List;
import p000.fr5;

/* JADX INFO: loaded from: classes5.dex */
public class qq8 extends fr5 {

    /* JADX INFO: renamed from: d */
    public final List<ci4> f75116d;

    /* JADX WARN: Illegal instructions before constructor call */
    public qq8(wr5 wr5Var, b2i b2iVar) {
        fr5.EnumC5939b enumC5939b = fr5.EnumC5939b.IN;
        super(wr5Var, enumC5939b, b2iVar);
        ArrayList arrayList = new ArrayList();
        this.f75116d = arrayList;
        arrayList.addAll(m20510b(enumC5939b, b2iVar));
    }

    /* JADX INFO: renamed from: b */
    public static List<ci4> m20510b(fr5.EnumC5939b enumC5939b, b2i b2iVar) {
        r80.hardAssert(enumC5939b == fr5.EnumC5939b.IN || enumC5939b == fr5.EnumC5939b.NOT_IN, "extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", new Object[0]);
        r80.hardAssert(s2i.isArray(b2iVar), "KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (b2i b2iVar2 : b2iVar.getArrayValue().getValuesList()) {
            r80.hardAssert(s2i.isReferenceValue(b2iVar2), "Comparing on key with " + enumC5939b.toString() + ", but an array value was not a ReferenceValue", new Object[0]);
            arrayList.add(ci4.fromName(b2iVar2.getReferenceValue()));
        }
        return arrayList;
    }

    @Override // p000.fr5, p000.su5
    public boolean matches(ph4 ph4Var) {
        return this.f75116d.contains(ph4Var.getKey());
    }
}
