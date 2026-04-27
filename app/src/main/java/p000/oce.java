package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class oce implements fpg {

    /* JADX INFO: renamed from: b */
    public static final oce f67217b = new oce(Collections.emptyList());

    /* JADX INFO: renamed from: a */
    public List<fpg> f67218a;

    private oce(List<fpg> list) {
        this.f67218a = list;
    }

    public static oce emptyRuleChain() {
        return f67217b;
    }

    public static oce outerRule(fpg fpgVar) {
        return emptyRuleChain().around(fpgVar);
    }

    @Override // p000.fpg
    public f3g apply(f3g f3gVar, j74 j74Var) {
        Iterator<fpg> it = this.f67218a.iterator();
        while (it.hasNext()) {
            f3gVar = it.next().apply(f3gVar, j74Var);
        }
        return f3gVar;
    }

    public oce around(fpg fpgVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fpgVar);
        arrayList.addAll(this.f67218a);
        return new oce(arrayList);
    }
}
