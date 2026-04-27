package p000;

import java.util.ArrayList;
import java.util.List;
import p000.fr5;

/* JADX INFO: loaded from: classes5.dex */
public class rq8 extends fr5 {

    /* JADX INFO: renamed from: d */
    public final List<ci4> f79028d;

    /* JADX WARN: Illegal instructions before constructor call */
    public rq8(wr5 wr5Var, b2i b2iVar) {
        fr5.EnumC5939b enumC5939b = fr5.EnumC5939b.NOT_IN;
        super(wr5Var, enumC5939b, b2iVar);
        ArrayList arrayList = new ArrayList();
        this.f79028d = arrayList;
        arrayList.addAll(qq8.m20510b(enumC5939b, b2iVar));
    }

    @Override // p000.fr5, p000.su5
    public boolean matches(ph4 ph4Var) {
        return !this.f79028d.contains(ph4Var.getKey());
    }
}
